/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.*;
import java.security.interfaces.*;
import javax.crypto.*;
import javax.crypto.interfaces.*;
import com.sun.crypto.provider.SunJCE;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;


/**
 *
 * @author edarsow
 */
public class PubPrivKeyAgreement {
    
    public static void main(String[] args) {
        
        KeyPair deloPair = null;
        KeyAgreement deloresKeyAgreement = null;
        KeyAgreement sylviaKeyAgreement = null;
        byte[] deloPublicKeyEncoded = null;
        byte[] sylviaPublicKeyEncoded = null;
        KeyFactory sylviaKeyFactory = null;
        X509EncodedKeySpec x509KS = null;
        
        PublicKey deloPub = null;
        KeyPairGenerator sylviaKeyPairGen = null;
        KeyFactory deloKeyFactory = null;
        PublicKey sylviaPub = null;
        
        try {
            // Delores creates key pair with 2048-bit size
            System.out.println("Delores: Generate DH keys ...");
            KeyPairGenerator deloKeyPairGen = KeyPairGenerator.getInstance("DH");
            deloKeyPairGen.initialize(2048);
            deloPair = deloKeyPairGen.generateKeyPair();
            
            System.out.println("Delores: Initilization");
            deloresKeyAgreement = KeyAgreement.getInstance("DH");
            deloresKeyAgreement.init(deloPair.getPrivate());
            
            deloPublicKeyEncoded = deloPair.getPublic().getEncoded();
            // now Sylvia uses this key info to create a message
            sylviaKeyFactory = KeyFactory.getInstance("DH");
            x509KS = new X509EncodedKeySpec(deloPublicKeyEncoded);
            deloPub = sylviaKeyFactory.generatePublic(x509KS);
            
            // embodies the exchange of the keys across some network
            // assuming both computers are speaking Java
            DHParameterSpec dhParamFromDeloPubKey = ((DHPublicKey)deloPub).getParams();
            
            System.out.println("Sylvia: Generate DH keys");
            sylviaKeyPairGen = KeyPairGenerator.getInstance("DH");
            sylviaKeyPairGen.initialize(dhParamFromDeloPubKey);
            KeyPair sylviaPair = sylviaKeyPairGen.generateKeyPair();
            
            System.out.println("Sylvia: Initilization");
            sylviaKeyAgreement = KeyAgreement.geItnstance("DH");
            sylviaKeyAgreement.init(sylviaPair.getPrivate());
            
            sylviaPublicKeyEncoded = sylviaPair.getPublic().getEncoded();
            
            // now Delores uses Sylvia's public key
            deloKeyFactory = KeyFactory.getInstance("DH");
            x509KS = new X509EncodedKeySpec(sylviaPublicKeyEncoded);
            sylviaPub = deloKeyFactory.generatePublic(x509KS);
            System.out.println("Delores: Executing Phase 1 of DH protocol");
            deloresKeyAgreement.doPhase(sylviaPub, true);
            
            // now Sylvia uses Delores' public key
            System.out.println("Sylvia: Executing Phase 1 of DH protocol");
            sylviaKeyAgreement.doPhase(deloPub, true);
            
            // now generate the same secret
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("No such algo");
            System.out.println(ex);
        } catch (InvalidKeyException ex) {
            System.out.println("Invalid Key");
            System.out.println(ex);
        } catch (InvalidKeySpecException ex) {
            System.out.println("InvalidKeySpecException");
            System.out.println(ex);
        } catch (InvalidAlgorithmParameterException ex) {
            System.out.println("Invalid Algo");
            System.out.println(ex);
        }
        
        byte[] deloSharedSecret = null;
        byte[] sylviaSharedSecret = null;
        int deloLen;
        int sylviaLen;
        if(deloresKeyAgreement != null){
            try {
                deloSharedSecret = deloresKeyAgreement.generateSecret();
                deloLen = deloSharedSecret.length;
                sylviaSharedSecret = new byte[deloLen];
                if(sylviaKeyAgreement != null){
                    sylviaLen = sylviaKeyAgreement.generateSecret(sylviaSharedSecret, 0);
                    
                }
                System.out.println("Delores secret: " + toHexString(deloSharedSecret));
                System.out.println("Sylvia secret: " + toHexString(sylviaSharedSecret));
                if(!java.util.Arrays.equals(sylviaSharedSecret, deloSharedSecret)){
                    throw new Exception("Shared secrets differ!");
                } else {
                    System.out.println("Shared secrets are the same");
                }
            } catch (IllegalStateException | ShortBufferException ex) {
                System.out.println(ex);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } // end null check
        
        System.out.println("Use shared secret as SecretKey object");
        SecretKeySpec deloAESKey = new SecretKeySpec(deloSharedSecret, 0, 16, "AES");
        SecretKeySpec sylviaAESKey = new SecretKeySpec(sylviaSharedSecret, 0, 16, "AES");

        System.out.println("Secret (symmetric) Key: " + toHexString(deloAESKey.getEncoded()));
        
        Cipher deloCipher = null;
        Cipher sylviaCipher = null;
        byte[] clearText = null;
        byte[] cipherText = null;
        byte[] encodedParams = null;
        byte[] recoveredText = null;
        AlgorithmParameters aesParams = null;
        
        try {
            // USE AES in CBC mode
            sylviaCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            sylviaCipher.init(Cipher.ENCRYPT_MODE, sylviaAESKey);
            clearText = "Where There's a Will There's A Way".getBytes();
            cipherText = sylviaCipher.doFinal(clearText);
            encodedParams = sylviaCipher.getParameters().getEncoded();
            
            //************************************
            //*****Exchange of the encodedParamsObject over
            //***** Insecure network happens here
            //************************************
            
            // Delo decrypts
            aesParams = AlgorithmParameters.getInstance("AES");
            aesParams.init(encodedParams);
            deloCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            deloCipher.init(Cipher.DECRYPT_MODE, deloAESKey, aesParams);
            recoveredText = deloCipher.doFinal(cipherText);
            if(!java.util.Arrays.equals(clearText, recoveredText)){
                throw new Exception("AES in CBC mode recovered text is diff from clear!");
            } else {
                System.out.print("Matching recovered text: ");
                System.out.println(new String(recoveredText, "UTF-8"));
                 
           }
            
        } catch (NoSuchAlgorithmException | NoSuchPaddingException ex) {
            System.out.println(ex);
        } catch (InvalidKeyException ex) {
            System.out.println(ex);
        } catch (IllegalBlockSizeException ex) {
            System.out.println("Illegal blocksize ex");
            System.out.println(ex);
        } catch (BadPaddingException ex) {
            System.out.println("Bad Padding");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("IO Ex");
            System.out.println(ex);
        } catch (InvalidAlgorithmParameterException ex) {
            System.out.println("Invalid algo");
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println("Decrypt Doesn't work");
            System.out.println(ex);
        }
        
        
        
        
        
        
        
    } // close main
    
    /*
     *  Used without warranty from Oracle JCA reference guide
     * https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html
     *   Converts a byte to hex digit and writes to the supplied buffer
     */
    private static void byte2hex(byte b, StringBuffer buf) {
        char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int high = ((b & 0xf0) >> 4);
        int low = (b & 0x0f);
        buf.append(hexChars[high]);
        buf.append(hexChars[low]);
    }

    /*
     * Converts a byte array to hex string
     * Used without warranty from Oracle JCA reference guide
     * https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html
     */
    private static String toHexString(byte[] block) {
        StringBuffer buf = new StringBuffer();
        int len = block.length;
        for (int i = 0; i < len; i++) {
            byte2hex(block[i], buf);
            if (i < len-1) {
                buf.append(":");
            }
        }
        return buf.toString();
    }
}

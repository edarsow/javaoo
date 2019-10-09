/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edarsow
 */
public class Md5Test {
    
    private static final String importantMessage = "Acceleration is nine point eight "
            + "meters NOT SECOND per second on earth";
    
    public static void main(String[] args) {
        System.out.print("INPUT: ");
        System.out.println(importantMessage);
        try {
            MessageDigest digester = MessageDigest.getInstance("SHA-256");
            digester.update(importantMessage.getBytes());
            byte[] hashValue = digester.digest();
            
            StringBuffer hexbuffer = new StringBuffer();
            for (int i = 0; i < hashValue.length; i++){
                hexbuffer.append(Integer.toHexString(0xFF & hashValue[i]));
            }
            
            System.out.print("HASH: ");
            System.out.println(hexbuffer.toString());
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
    }
    
}

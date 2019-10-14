/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author edarsow
 */
public class MD5HashDemo {
    
    private static final String importantMessage = "Acceleratuon is nine point eight "
            + "meters NOT SECOND per second on earth";
    
    /**
     * Demo method for computing an MD5 hash value of an incoming String
     * @param args 
     */
    public static void main(String[] args) {
        System.out.print("INPUT: ");
        System.out.println(importantMessage);
        try {
            MessageDigest digester = MessageDigest.getInstance("SHA-256");
            digester.update(importantMessage.getBytes());
            String h = DatatypeConverter.printHexBinary(digester.digest());
            System.out.println("hashed value: " + h);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
    }
}

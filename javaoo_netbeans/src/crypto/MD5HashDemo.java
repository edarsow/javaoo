/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author edarsow
 */
public class MD5HashDemo {
    
    private static final String importantMessage = "Um. learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVAUm, learn your JAVA!";
    
    /**
     * Demo method for computing an MD5 hash value of an incoming String
     * @param args 
     */
    public static void main(String[] args) {
        System.out.print("INPUT: ");
        System.out.println(importantMessage);
        try {
            // Create an instance of a hashing machine
            MessageDigest digester = MessageDigest.getInstance("MD5");
            
            // call update() as many times as we need to store
            // all the data we want to hash. We must pass in the input
            // as an array of bytes, not a String
            digester.update(importantMessage.getBytes());
            
            // Finally, call digest() to get the hashed value
            // and we immediately pass output to 
            // a fancy adapter class called DatatypeConverter
            // which turns raw bytes into Unicode String
            String h = DatatypeConverter.printHexBinary(digester.digest());
            // Output hashed value to user.
            System.out.println("hashed value: " + h);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength.studcode;

import java.util.Scanner;
import java.util.Date;

/**
 * Main
 */
public class Main {
    
    // Declare variables in Class scope, any method can access these
    final static String REQUIRED_CHARACTERS = "@#$*!&";
    

    public static void main(String[] args) {
        // Assignment Header
            System.out.println("CIT-130 Spring 2021");
            System.out.println("Compiled by Andre Kukharenko%n");
            System.out.println("Passowrd Strength Checker"); 
            System.out.println("Run on " + (new Date()));

            // Declare variables
            Scanner input = new Scanner(System.in);
            int minLength = 8;
            int maxLength = 25;
            int passwordLength = 5;
                        
            // Prompt user to enter a new string and provide instructions on how to do it.
            System.out.println("Create a new password with at least one UPPERCASE letter, one lowercase letter, one digit, and one symbol.");
            System.out.println("Enter a new password: ");
            String password = input.nextLine();

            // Create a series of loops in order to test the efficacy of the user password, and pass through the rules set forth in 
            // blueprints.
            if (password.length() < minLength){
                System.out.println("Password is too short, please enter new password");
            } else if (password.length() > maxLength){
                System.out.println("Password is too long, please enter a new password");
            } else if (checkForRequiredCharacters(password)){
                System.out.println("Password must contain special character (@#$*!&), please enter a new password");
            } 
//            else if (stringContent ()) {
//                System.out.println("Password must contain at least one digit, please enter a new password");
//            } else if (stringContent ()) {
//                System.out.println("Passowrd must contain at least one uppercase letter, please enter a new password.");
//            } else if (stringContent ()) {
//                System.out.println("Passowrd must contain at least one uppercase letter, please enter a new password.");
//            }        

    }
    
    public static boolean checkForRequiredCharacters(String pswd){
        // Build regexp from required character String
        // GOAL: .*[@#$*!&].*
        StringBuilder regexp = new StringBuilder();
        regexp.append(".*[");
        regexp.append(REQUIRED_CHARACTERS);
        regexp.append("].*");
        System.out.println("Generated REGEXP: " + regexp.toString());
        
        // this switch will store outcome of character check
        // Flip to true if password has components
        boolean containsReqChars = true;
        if(pswd.matches(regexp.toString())){
            containsReqChars = false;
            System.out.println("Password contains required chars");
        } else {
            System.out.println("Password fails regexp");
        }
        // otherwise the switch is false--no need for else
        
        return containsReqChars;
    }
}
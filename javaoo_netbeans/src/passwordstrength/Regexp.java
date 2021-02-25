/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

/**
 * Demo of regular expression utilities in the String class
 * See Liang 9th edition Chapter 9, Section 2.7
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class Regexp {
    
    public static void main(String[] whateva){
                
        System.out.println("yes\\\\no");
        // Uncomment methods to test its regular expression example
//        regexpRepeatCounts();
        //      regexpDigit();
        //      regexpWeirdChar();
        //    regexpSpaces();
//        regexpQuizReview();
        
    } // close main
    
    
    public static void regexpQuizReview(){
          // Write a regular expression that matches a String that is exactly any number 3 times 
          // followed by a single letter and then the & character between 3 and 6 times
        String rawString = "8%6h&&&&&&";
    
        String regExp = ""; 
                                   
        if(rawString.matches(regExp)){
            System.out.println("Match! " + rawString + " is matched by the regexp: " + regExp);
        } else {
            System.out.println("No Match " + rawString + " does not match the regexp: " + regExp);
        }
    }
      
    
    
    public static void regexpRepeatCounts(){
          // Demo of a regular expression match
        String rawString = "basetttbyu";
        // REGEXP NOTES:  . means any character
        //                * is a repeater, 0 or more times
        //                \\d stands for any digit class
        //                {3,8} means the preceding character must be repeated 
        //                      between 3 and 8 times
        String regExp = ".*\\d{3,8}.*"; // Matches strings that contain somwhere in them
                                        // a sequence of digits between 3 and 8 digits long
        
        if(rawString.matches(regExp)){
            System.out.println("Match! " + rawString + " is matched by the regexp: " + regExp);
        } else {
            System.out.println("No Match " + rawString + " does not match the regexp: " + regExp);
        }
    }
      
    public static void regexpWeirdChar(){
          // Demo of a regular expression match
        String rawString = "p%enci?l";
        // REGEXP NOTES:  . means any character
        //                * is a repeater, 0 or more times
        //                + means must match preceding character 1 or more times   
        String regExp = ".*[&%$#?]+.*"; // You need one of the following somewhere in the passsword:
                                        // &, %, $, #, ?
        
        if(rawString.matches(regExp)){
            System.out.println("Match! " + rawString + " is matched by the regexp: " + regExp);
        } else {
            System.out.println("No Match " + rawString + " does not match the regexp: " + regExp);
        }
    }
    
    
    public static void regexpDigit(){
          // Demo of a regular expression match
        String rawString = "7passw8rd";
        // REGEXP NOTES:  . means any character
        //                * is a repeater, 0 or more times
        String regExp = "\\D.*\\d.*"; // CANNOT START with a digit but must contain
                                      // a digit somewhere in the rest of the passsword
        
        if(rawString.matches(regExp)){
            System.out.println("Match! " + rawString + " is matched by the regexp: " + regExp);
        } else {
            System.out.println("No Match " + rawString + " does not match the regexp: " + regExp);
        }
    }
    
    
    public static void regexpSpaces(){
          // Demo of a regular expression match
        String rawString = "7passw 8rd";
        
        // REGEXP NOTES:  . means any character
        //                * is a repeater, 0 or more times
        //                \\s means any space character
        String regExp = ".*\\s.*"; // does the string have a space anywhere in it?
        
        if(rawString.matches(regExp)){
            System.out.println("Match! " + rawString + " is matched by the regexp: " + regExp);
        } else {
            System.out.println("No Match " + rawString + " does not match the regexp: " + regExp);
        }
    }
    
    
} // close class

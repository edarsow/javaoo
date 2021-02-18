/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class StringAPI {
    
    public static void main(String[] args) {
        // creating a String object by assigning a literal
        String title = "Goshen";
        // Instantating a new String object with the no-arg constructor
        String artist = new String();
        System.out.println("Contents of new String: " + artist);
        
        char[] arr = {'S','m','i','l','e',' ','A','g','a','i','n' };
        System.out.println("Raw char[] array: " + arr);
        
        // demo using the char[] constructor for String
        String blackBearSong = new String(arr);
        System.out.println("Contents of String created with char[]: " + blackBearSong);
        
        System.out.println("Character at index 4: "+ blackBearSong.charAt(4));
        
        String shopPhone = "412.894.3020";
        String cellPhone = "(923)923.9907";
        
        StringAPI stringTools = new StringAPI();
        
        System.out.println("Shop Phone: " + shopPhone);
        System.out.println("Shop Area Code: " + stringTools.extractAreaCode(shopPhone));
        System.out.println("Cell Phone: " + cellPhone);
        System.out.println("Cell Area Code: " + stringTools.extractAreaCode(cellPhone));
        // Extact area code from phone number
           
    } // close main
    
    /**
     * Extracts area code of a given phone number
     * Current implementation only dumb chops the first three characters
     * and assumes there's no leading (
     * @param phoneNum
     * @return area code only
     */
    public String extractAreaCode(String phoneNum){
        return phoneNum.substring(0, 3);
        
    }
    
    
    
} // close class

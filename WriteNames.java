 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerSorting;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class WriteNames {
    public static void main(String args []){
        PrintWriter fileWriter = null;
        try{
            java.io.File nameFile = new java.io.File("namesInClass.txt");
            System.out.println("File path: " + nameFile.getAbsolutePath());   
            fileWriter = new PrintWriter(nameFile);
            fileWriter.println("Mr. Rizvi");
            fileWriter.println("Mr. Eckles");
            fileWriter.println("Ms. Faux");
            fileWriter.println("Mr. Sarnowski");
            fileWriter.flush();
            fileWriter.close();
            
            Scanner fileScanner = new Scanner(nameFile);
            System.out.println("Delim: " + fileScanner.delimiter());
            System.out.println(fileScanner.next());
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
    
        }finally{
            fileWriter.close();
        }
        
        
    }
}

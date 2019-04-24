/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_notdub;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edarsow
 */
public class FileModel {

    public void writeFile(String fileName) {
        PrintWriter fileWriter = null;
        StringBuilder sb = new StringBuilder();
        sb.append("src/files/");
        sb.append(fileName);

        try {
            java.io.File nameFile = new java.io.File(sb.toString());
            System.out.println("Writing to: " + nameFile.getAbsolutePath());
            // connect our writer object with the file to write to
            fileWriter = new PrintWriter(nameFile);
            fileWriter.print("Mr. Ri+zvi\n");
            fileWriter.print("Mr.Eged");
            
            fileWriter.flush();
            fileWriter.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    public String readFile(String fn) {
        StringBuilder sb = new StringBuilder();
        String fname = "src/files/" + fn;
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(fname));
//        fileScanner.useDelimiter("\n");
//        System.out.println("Delim: " + fileScanner.delimiter());
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        while(fileScanner.hasNext()){
            sb.append(fileScanner.next());
            
            
        }
//        sb.append(fileScanner.next());
//        sb.append(fileScanner.next());
//        sb.append(fileScanner.next());
        System.out.println("File Contents: " + sb.toString());
        return sb.toString();
    }

}

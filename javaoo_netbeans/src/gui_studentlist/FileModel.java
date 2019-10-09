/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_studentlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
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
            fileWriter.println("16, Mr. Rizvi, FLSudio Course");
            fileWriter.println("99, Mr.Eged, Burger King Today and Tomorrow");
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

    public List<Student> readFile(String studentFileName) {
        List<Student> studList = new LinkedList<>();
        String fname = "src/files/" + studentFileName;
        Scanner fileScanner = null;
        
        try {
            fileScanner = new Scanner(new File(fname));
            fileScanner.useDelimiter("\n");
//        System.out.println("Delim: " + fileScanner.delimiter());
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        while(fileScanner.hasNext()){
            Student stud = new Student();
            String s = fileScanner.next();
            System.out.println("Next: " + s);
            StringTokenizer tokenizer = new StringTokenizer(s);
            String tok = tokenizer.nextToken(",");
            System.out.println("tok: " + tok);
            stud.id = Integer.parseInt(tok);
            stud.name = tokenizer.nextToken();
            stud.course = tokenizer.nextToken();
            studList.add(stud);
        }
        System.out.println("Returning stud list size: " + studList.size());
        return studList;
    }
}

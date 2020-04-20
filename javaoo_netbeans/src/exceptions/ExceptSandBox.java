/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Exception test-class
 * @author sylvia
 */
public class ExceptSandBox {
    // member variable for storing or vector list
    private static  List<Vector> vectList;
    
    public static void main(String[] args) {
        createVectorModel();
    } // close of main
    
    private static void createVectorModel(){
        int userVal = 0;
        // capture return value for logic checking
        try{
            // this method can throw an InputMismatchException, which we catch
             userVal = gatherUserInput();
            
        } catch (InputMismatchException | SimulationException ex){
            System.out.println("Exception caught: " + ex.getClass().getName());
            System.out.println("Wacko answers result in override to 10");
            
            // Carry out recovery steps; use default sim value
            userVal = 10;
        }
        
        createVectorList(userVal);
        
        displayVectorList();
    }
    
    /**
     * Asks user for number of vectors
     * @return user inputted value, could be any int
     * @throws InputMismatchException user input cannot be parsed to int
     */
    private static int gatherUserInput() throws InputMismatchException, SimulationException{
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Vectors shall I assemble?");
        int numVectors = 0;
        // at least 1 method in this block MAY throw an exception,
        // which we shall NOT catch; we throw it to caller
        // EXCEPTIONS INTERRUPT EXECUTION FLOW
        numVectors = scan.nextInt();
        if(numVectors <= 0){
            throw new SimulationException();
        }
        
        return numVectors;
    }
    
    public static void createVectorList(int n){
        vectList = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < n; i++){
            Vector v = new Vector();
            v.transmissionRisk = r.nextDouble();
            vectList.add(v);
        }
        
    }
    
    private static void displayVectorList(){
        try{
            for(Vector v: vectList){
                System.out.println("Vector risk: " + v.transmissionRisk);
            }
        } catch (NullPointerException npe){
            System.out.println("I cannot print a null list!!");
        }
    }
    
    static class Vector{
        double transmissionRisk;
    }
    
}

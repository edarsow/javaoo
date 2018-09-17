/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdiagrams.patternprinting;

/**
 * Demo class for interfaces.
 * @author delores
 */
public interface BoxPrinter {
    
    /**
     * Sends data to System.out.println() to 
     * create a square box with a side length
     * of the inputted value.
     * 
     * It's up to the implementing method to
     * choose how to print this box to the console
     * in code and how to interpret the length
     * of a side integer passed in.
     * 
     * @param sideLength 
     */
    public void PrintABox(int sideLength);
    
}

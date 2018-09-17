/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdiagrams.patternprinting;

/**
 * Demonstration class which implements a single
 * abstract method in interface BoxPrinter
 * @author delores
 */
public class LoopingBoxer implements BoxPrinter{

    final String SIDE_UNIT_CHAR = "*";
    /**
     * Implements PrintABox and interprets the
     * side length in units of a character
     * printed to the console. 
     * @param sideLength 
     */
    @Override
    public void PrintABox(int sideLength) {
        
        for(int outer = 0; outer<sideLength; outer++){
            
            for(int i = 0; i < sideLength; i++){
                    System.out.print(SIDE_UNIT_CHAR);
            }
            System.out.println("");
        }
    }
}

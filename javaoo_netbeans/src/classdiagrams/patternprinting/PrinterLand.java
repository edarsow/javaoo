/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdiagrams.patternprinting;

/**
 * Demo client class which instantiates objects
 * who are part of a multi-class structure.
 * @author delores
 */
public class PrinterLand {
    public static void main(String[] args) {
        BoxPrinter bp = new LoopingBoxer();
        bp.PrintABox(5);
    }
    
}

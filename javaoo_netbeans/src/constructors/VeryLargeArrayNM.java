/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author sylvia
 */
public class VeryLargeArrayNM {
    public static void main(String[] args) {
        RadioTelescope fast = new RadioTelescope();
        RadioTelescope arecibo = new RadioTelescope(1420);
        RadioTelescope greenBankTelescope = new RadioTelescope("Ellie");
        
        System.out.println("fast freq: " + fast.getFreq());
        System.out.println("fast operator: " + fast.getOperator());
        
        System.out.println("arecibo freq: " + arecibo.getFreq());
        System.out.println("arecibo operator: " + arecibo.getOperator());
        
        System.out.println("green bank freq: " + greenBankTelescope.getFreq());
        System.out.println("green bank operator: " + greenBankTelescope.getOperator());
        
        System.out.println("CHOP!");
        
        arecibo.chopFreq(2);
        fast.chopFreq(4);
        
        System.out.println("arecibo freq: " + arecibo.getFreq());
        System.out.println("fast freq: " + fast.getFreq());
        
        System.out.println("OPS!");
        
        greenBankTelescope.setOperator("Fish");
        
        System.out.println("green bank op: " + greenBankTelescope.operator);
        
    }
    
}

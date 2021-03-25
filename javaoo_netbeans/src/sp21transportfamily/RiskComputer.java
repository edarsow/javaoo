/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

import java.util.Random;

/**
 * Demo of ideas for computing risk scores and fatalities 
 * @author edith
 */
public class RiskComputer {
    
    public static void main(String[] args) {
        
        // create an instance of this class
        Random rando = new Random();
        
        // the least data informed way would be just 
        // randomly draw a value from 0 to total passengers
        // and call those fatalities
       
        // create a single bus and give it a count of passengers
        Bus bus = new Bus();
        bus.setPassengerCount(45);
       
        System.out.println("Bus passenger count: " + bus.getPassengerCount());
        // use the nextInt method's tool to randomly choose a value between
        // 0 and the total passenger count. NOTE: nextInt(bound)'s upper
        // end is EXCLUSIVE so we add onen to allow the possibility that
        // each passenger is injured
        int numberInjured = rando.nextInt(bus.getPassengerCount() + 1);
        System.out.println("Number injured: " + numberInjured);
        
        double percentInjured = (double) numberInjured / bus.getPassengerCount();
        System.out.println("Fraction injured: " + percentInjured);
        
   
        
        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

import java.util.Random;

/**
 *
 * @author delores
 */
public class VehicleLand {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Test result: " + crash(c));
    }
    
    /**
     * Turn this method into an interface!
     * And Thanks to Mr. Horton for finding this
     * fantastic online description of NTHSA rating
     * standards
     * https://auto.howstuffworks.com/car-driving-safety/accidents-hazardous-conditions/crash-test5.htm
     * @param ct
     * @return 
     */
    public static double crash(CrashTestable ct){
        double score = 0.0;
        // simplest possible logic that calls
        // one or more methods on the interface
        // and computes a double value
        // between 0 and 5 (representing star rating)
        if(ct.driverAirbagPresent()){
            score = score + 1;
        }
        
        if(ct.getVehicleYear() > 2015){
            score = score + 1;
        }
        
        Random rand = new Random();
        score = score + rand.nextDouble();
        score = score + rand.nextDouble();
        score = score + rand.nextDouble();
        return score;
    }   
}

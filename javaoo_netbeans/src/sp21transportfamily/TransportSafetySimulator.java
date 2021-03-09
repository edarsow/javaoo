/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

/**
 * Program  to model transportation safety
 * across several modes of travel:
 * Plane, Car, Train, Boat
 * 
 * Simulates average cost and casualty outcomes
 * for transportation of a fixed number of
 * passengers from source to destination
 * 
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class TransportSafetySimulator {
    
    public static void main(String[] args) {
        // Source location with X number
        // of humans who want to get to 
        // destination: use modeling
        // and random generation to simulate
        // moving folks from source to dest
        // on a variety of modes of transport
        // and compute metrics for cost and
        // time and injury rates based on
        // member variable values on our 
        // transportation objects
        
        // DEMO of the principle that
        // a variable typed to the superclass
        // can hold ANY Subtyped object!!
        
        TranportVehicle vehicle1 = new TranportVehicle();
        vehicle1.setAverageSpeed(80);
        
        // TransportVehicle typed variables can hold ANY subclass instance!!!
        TranportVehicle vehicle2 = new CommercialAirliner();
        
        CommercialAirliner southjet227 = new CommercialAirliner();
        southjet227.setAverageSpeed(380);
        
        // call computeTravelTime with an instance of CommercialAirliner
        double timePGHToAtlanta = computeTravelTime(southjet227, 526);
        System.out.println("Travel time of plane from PGH to Atlanta: " + timePGHToAtlanta + " hours");
        
        PassengerTrain amtrak1 = new PassengerTrain();
        // calling a setter method from the subclass
        amtrak1.setPassengerCarCount(21);
        // calling a setter method on the superclass (TransportVehicle)
        amtrak1.setAverageSpeed(65.0);
        
        double trainTime = computeTravelTime(amtrak1, 370);
        System.out.println("Travel time of train from PGH to NYC: " + trainTime + " hours");
        
        
        
        
    }
    
    /**
     * 
     * method to compute time required for a given TransportationVehicle
     * to travel X miles
     * @param vehicle ANY subclass of TransportVehicle
     * @param distance
     * @return 
     */
    public static double computeTravelTime(TranportVehicle vehicle, double distance){
        // distance = rate * time
        // time = distance / rate
        
        return distance / vehicle.getAvergageSpeed();
        
        
    }
    
}

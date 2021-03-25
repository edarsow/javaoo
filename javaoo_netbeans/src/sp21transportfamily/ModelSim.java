/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static sp21transportfamily.TransportSafetySimulator.attemptDerailment;
import static sp21transportfamily.TransportSafetySimulator.computeTravelTime;

/**
 * Demo of an object-oriented approach to a simulation task
 * @author edith
 */
public class ModelSim {
    public static void main(String[] args) {
        
        TransportationSimulator ts = new TransportationSimulator();
        
        // call setupVehicleList which returns a pretty set of 
        // subclasses with call signs and all that jazz
        // immediately pass the List to our simulator for processing
        ts.runTransportSimulation(setupVehicleList());
        
        System.out.println("Simulation results: ");
        System.out.println(ts.getSimulationResults());
        
        
    }
    
    public static List<TransportVehicle> setupVehicleList(){
         
        TransportVehicle vehicle1 = new TransportVehicle();
        vehicle1.setAverageSpeed(80);
        
        // TransportVehicle typed variables can hold ANY subclass instance!!!
        TransportVehicle vehicle2 = new CommercialAirliner();
        
        CommercialAirliner southjet227 = new CommercialAirliner();
        southjet227.setAverageSpeed(380);
        southjet227.setAltitute(28560);
        southjet227.setCallSign("Southjet 227");
        southjet227.setPassengerCount(102);
        
        // call computeTravelTime with an instance of CommercialAirliner
        double timePGHToAtlanta = computeTravelTime(southjet227, 526);
        System.out.println("Travel time of plane from PGH to Atlanta: " + timePGHToAtlanta + " hours");
        
        PassengerTrain amtrak1 = new PassengerTrain();
        // calling a setter method from the subclass
        amtrak1.setPassengerCarCount(21);
        // calling a setter method on the superclass (TransportVehicle)
        amtrak1.setAverageSpeed(20.0);
        amtrak1.setGrossWeight(2500000);
        amtrak1.setCallSign("MegaTrainDelta");
        amtrak1.setPassengerCount(210);
        
        attemptDerailment(amtrak1);
        
        double trainTime = computeTravelTime(amtrak1, 370);
        System.out.println("Travel time of train from PGH to NYC: " + trainTime + " hours");
        
        // test our subclasses of Automobile
        RaceCar ferrari250GTCoupe = new RaceCar();
        ferrari250GTCoupe.setAverageSpeed(142.9);
        ferrari250GTCoupe.setCallSign("Ferrari250");
        ferrari250GTCoupe.setPassengerCount(2);
        double raceCarTime = computeTravelTime(ferrari250GTCoupe, 808);
        
        
        ferrari250GTCoupe.setWheelBaseInches(60.3);
        System.out.println("Travel time in race car from PGH to Rochster, MN: " + raceCarTime);   
        
        // ************* STORE OUR OBJECTS IN A LIST<> *******************
        // vehicleList is typed as List and can hold objects of type TransportVehicle
        // but more importantly, it can also hold ANY subtype. 
        // DESIGN PRINCIPLE: CODE TO SUPERCLASS WHEN POSSIBLE
        // vehicleList is typed to the List interface, and I store inside it
        // a concrete implemenation of List called LinkedLiset
        List<TransportVehicle> vehicleList = new LinkedList<>();
        
        //  load up our custom objects into our list
        // ANY SUBCLASS can be added to a list typed to hold 
        // the parent
        vehicleList.add(amtrak1);
        vehicleList.add(southjet227);
        vehicleList.add(ferrari250GTCoupe);
        
        return vehicleList;
        
        
    }
    
    
}

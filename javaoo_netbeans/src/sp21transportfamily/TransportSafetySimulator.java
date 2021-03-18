/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        
        // send list down to our passenger tabulator and print returned result
        int pTotal = computeTotalPassengerCount(vehicleList);
        System.out.println("Total Passengers: " + pTotal);
        
        // A more specific storage container, that could be used
        // to queue vehicles for road transport
//        List<Automobile> autoList = new ArrayList<>();
//        autoList.add(ferrari250GTCoupe);
    } 
    
    
    /**
     * Tabulates total passenger count of each Object in our list
     * @param vList preferably with a non-zero pasenger count. If you
     * give me null, I return zero passegers
     * @return total passengers in all passed in TransportVehicles
     */
    public static int computeTotalPassengerCount(List<TransportVehicle> vList){
        
        int passTotal = 0;
        // Only examine elements if we actually have a list and that list
        // is NOT empty (!)
        if(vList != null && !vList.isEmpty()){
            // Use Enhanced for Loop to visit each item individually
            // This says, serve me once TransportVehicle at a time, 
            // and do so by sticking it in the variable called v
            // which I can look at more closely inside the for loop
            for(TransportVehicle v: vList){
                System.out.println("***************************************");
                System.out.println("Examining Vehicle: " + v.getCallSign());
                System.out.println("Passenger Count: " + v.getPassengerCount());
                passTotal = passTotal + v.getPassengerCount();
            } // enhanced for loop
        }
        
        return passTotal;
    }
    
    
    /**
     * Method will check with any class that implements
     * the Derailable interface to see if it is capable of derailment
     * @param dr 
     */
    public static void attemptDerailment(Derailable dr){
        System.out.println("Derailment Check: " + dr.canBeDerailed());
        
        
    }
    
    /**
     * 
     * method to compute time required for a given TransportationVehicle
     * to travel X miles
     * This method's signature uses the principle of polymorphism in that
     * we accept any class which has TransportVehicle in its ancestry
     * i.e. is a subclass of TransportVehicle
     * @param vehicle ANY subclass of TransportVehicle
     * @param distance
     * @return 
     */
    public static double computeTravelTime(TransportVehicle vehicle, double distance){
        // distance = rate * time
        // time = distance / rate
        
        
        // Demo the use of the instanceof operator and type casting
        // to resurrect our subclass object
        // attempt to type cast our inputted vehicle to the subclass Van
 
        
        // Step 1 is determine which subclass we actually have using instanceof
        if(vehicle instanceof RaceCar){
            System.out.println("Ooh, I was passed a RaceCar subclass!");
            // store a reference to our RaceCar in an appropriately typed
            // variable that gives us access to the subclass's public utilities
            // (RaceCar) is type casting, forcing the object to its right
            // to become typed as the value in the ()
            RaceCar racer = (RaceCar) vehicle;
            System.out.println("WheelBase measurement: " + racer.getWheelBaseInches());
        } else if(vehicle instanceof CommercialAirliner){
            System.out.println("Goodie, I was passed a CommercialAirliner! Fly, fly, fly");
            // type cast to airliner
            CommercialAirliner plane = (CommercialAirliner) vehicle;
            System.out.println("Plane's altitude is: " + plane.getAltitude());
            
        }
        
        
        return distance / vehicle.getAvergageSpeed();
        
        
    }
    
}

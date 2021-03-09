/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

/**
 * Superclass representing a mode of transportation
 * for carrying passengers
 * 
 * 
 * 
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class TranportVehicle {
    private int passengerCount;
    private double averageSpeed;
    private double costPerPassengerMile;
    private double safetyCoefficient;
    private boolean inTransit;
    
    private double fuelCapacity;
    private double currentFuelLevel;
    
    
    
    // methods for "getters" "setters" of our
    // private member variables
    
    /**
     * Gets the value of member variable passengerCount
     * @return 
     */
    public int getPassengerCount(){
        // go into "private vault" and retrieve
        // the value of a single member variable
        return passengerCount;
    }
    
    /**
     * Sets a value for passengerCount
     * Checks for 0 or positive value 
     * and sets count at 0 for negative inputs
     * @param cnt value to inject
     */
    public void setPassengerCount(int cnt){
        // check incoming value for 
        // reasonableness and then  inject into
        // private vault
        if(cnt >= 0){
            passengerCount = cnt;
        } else {
            passengerCount = 0;
        }
    } 
    
    public double getAvergageSpeed(){
        return averageSpeed;
    }
    
    public void setAverageSpeed(double spd){
        averageSpeed = spd;
    }
    
    
    
}

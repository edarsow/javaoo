/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 * Collaboratively designed interface for
 * specifying behaviors that allow an object to be
 * crash tested by client code. Should be implemented
 * by any vehicle-related object which contains member variables
 * which can be used to compute these requested values.
 * @author Javoo2!
 */
public interface CrashTestable {
    /**
     * release year
     * @return release year
     */
    public int getVehicleYear();
    
    /**
     * driving mode represents a grouping of settings related
     * to the car's performance ex(eco, snow, sport)
     * @return returns an instance of the DrivingMode
     * 
     */
    public DrivingMode getDrivingMode();
    /**
     * use pounds for units
     * @return gross weight in pounds
     */
    public double getVehicleWeight();
    
    /**
     * vehicle off of the ground to the lowest height to the 
     * bumper
     * @return height in inches 
     */
    public double getFrontBumberHeight();
    
    /**
     * possible return values include: steel, aluminum,
     * carbon fiber, cool corvette stuff.
     * This is yucky.
     * @return material
     */
    public String frameMaterialIdentifer();
    
    /**
     * boolean flag for working driver front collision airbag
     * @return presence of airbag
     */
    public boolean driverAirbagPresent();
    
    // for determining center of gravity
    
    /**
     * center of the front wheel to the back wheel
     * @return value in inches
     */
    public double getLengthOfWheelBase();
    
    /**
     * weight of the vehicle in lbs when the vehicle
     * is level
     * @return weight in lbs
     */
    public double getFrontWeightLevelWeight();
    
    /**
     * weight on the front tiers when the back is raised 10"
     * @return value in lbs
     */
    public double getFrontWeightWhenRaised();
    
}// close class

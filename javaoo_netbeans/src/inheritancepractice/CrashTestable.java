/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 * 
 * @author edarsow
 */
public interface CrashTestable {
    public int getVehicleYear();
    public DrivingMode getDrivingMode();
    
    public double getVehicleWeight();
    public double getFrontBumberHeight();
    
    public String frameMaterialIdentifer();
    
    public boolean driverAirbagPresent();
    
    // for determining center of gravity
    public double getLengthOfWheelBase();
    public double getFrontWeightLevelWeight();
    public double getFrontWeightWhenRaised();
    
}

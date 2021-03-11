/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

/**
 * Superclass of our Auto family
 * of transport mechanisms that travel on roads
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class Automobile extends TransportVehicle{
    private double wheelBaseInches;

    /**
     * @return the wheelBaseInches
     */
    public double getWheelBaseInches() {
        return wheelBaseInches;
    }

    /**
     * @param wheelBaseInches the wheelBaseInches to set
     */
    public void setWheelBaseInches(double wheelBaseInches) {
        this.wheelBaseInches = wheelBaseInches;
    }
    
    
    
}

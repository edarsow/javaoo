/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

import com.sun.org.apache.xalan.internal.xsltc.trax.TrAXFilter;

/**
 * Subclass in our TransportVehicle object
 * Hierarchy representing a passenger plane
 * 
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class CommercialAirliner extends TranportVehicle{
    
    final int ENGINE_CYCLE_CUTOFF = 34000;
    final int HOURS_CUTOFF = 34000;
    
    private int crewCount;
    private double altitude;
    private double hoursOfOperation;
    private int engineCycles;
    
    // getters and setters
    // TODO: Finish getters and setters
    
    public int getCrewCount(){
        return crewCount;
    }
    
    public void setCrewCount(int cc){
        crewCount = cc;
    }
    
    public double getAltitude(){
        return altitude;
    }
    
    public void setAltitute(double alt){
        if(alt >= 0){
            altitude = alt;
        } else {
            altitude = 0;
        }
    }
    
    
    
    
    
    
    
}

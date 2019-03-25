/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planecrash;

import java.util.Random;

/**
 *
 * @author edarsow
 */
public class PlaneObjectModel {
    
    public Aircraft getAircraft(){
        Random r = new Random();
        Aircraft ac = new AirbusA330();
        ac.setAircraftid(r.nextInt(1000000));
        ac.setHours(r.nextInt(130000));
        ac.setCycles(40000);
        return ac;
        
    }
    
}

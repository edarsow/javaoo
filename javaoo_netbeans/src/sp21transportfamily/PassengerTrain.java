/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

/**
 *
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class PassengerTrain extends TranportVehicle {
    private int passengerCarCount;
    private int freightCarCount;
    
    public int getPassengerCarCount(){
        return passengerCarCount;
    }
    
    public void setPassengerCarCount(int count){
        passengerCarCount = count;
    }
    
    
    
}

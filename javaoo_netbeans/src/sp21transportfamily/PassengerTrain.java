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
public  class   PassengerTrain 
        extends TransportVehicle
        implements Derailable{
    
    private int passengerCarCount;
    private int freightCarCount;
    private double grossWeight;
    
    
    /**
     * Checks gross weight and speed to
     * determine if this train can be 
     * derailed
     * @return 
     */
    @Override
    public boolean canBeDerailed(){
        boolean derailSuccessLiekly = false;
        if(grossWeight < 3000000 && this.getAvergageSpeed() < 35){
            derailSuccessLiekly = true;
        }
        return derailSuccessLiekly;
    }
    
    
    public int getPassengerCarCount(){
        return passengerCarCount;
    }
    
    public void setPassengerCarCount(int count){
        passengerCarCount = count;
    }

    /**
     * @return the freightCarCount
     */
    public int getFreightCarCount() {
        return freightCarCount;
    }

    /**
     * @param freightCarCount the freightCarCount to set
     */
    public void setFreightCarCount(int freightCarCount) {
        this.freightCarCount = freightCarCount;
    }

    /**
     * @return the grossWeight
     */
    public double getGrossWeight() {
        return grossWeight;
    }

    /**
     * @param grossWeight the grossWeight to set
     */
    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }
    
    
    
}

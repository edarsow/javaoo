/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author sylvia
 */
public class RadioTelescope {
    
    double waveLength;
    String operator;
    
    public RadioTelescope(){
        // The "Hydrogen Line Frequency"
        waveLength = 1420.405;
        operator = "Jansky";
    }
    
    public RadioTelescope(double wl){
        waveLength = wl;
        operator = "Jansky";
    }
    
    public RadioTelescope(String op){
        operator = op;
        // Channel 37
        waveLength = 608;
    }
    
    public void setFrequency(double freq){
        waveLength = freq;
    }
    
    public void chopFreq(int divisor){
        waveLength = waveLength / divisor;
    }
    
    public double getFreq(){
        return waveLength;
    }
    
    public String getOperator(){
        return operator;
    }
    
    public void setOperator(String op){
        operator = op;
    }
    
}

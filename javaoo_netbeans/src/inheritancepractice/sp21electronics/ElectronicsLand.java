/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice.sp21electronics;

/**
 *
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class ElectronicsLand {
    public static void main(String[] args) {
        InfaredThermometer therm = new InfaredThermometer();
        therm.isPowerOn = true;
        therm.tempUnit = 'f';
        therm.manufacturer = "HDE";
        
        SoundMeter soundMeter = new SoundMeter();
        soundMeter.manufacturer = "Meterk";
        
        
        VGASwitch vgaSwitch = new VGASwitch();
        
        
        
    }
}

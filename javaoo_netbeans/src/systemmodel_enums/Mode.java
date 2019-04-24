/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmodel_enums;

/**
 *
 * @author edarsow
 */
public enum Mode {
    SANITARY (""),
    BRIGHT_WHITES (""),
    BULKY (""),
    HEAVY_DUTY (""),
    NORMAL (""),
    DELICATES ("Sway. Roll. Roll.");
    
    private String machineSound;
    
    Mode(String s){
        machineSound = s;
    }
    
    public String getMachineSound(){
        return machineSound;
    }
    
    
    
    
    
}

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
public class EnumLand {
    public static void main(String[] args) {
        DrivingMode currentMode = DrivingMode.SNOW;
        DrivingMode desiredMode = DrivingMode.SPORTY;
        
        if(currentMode == DrivingMode.SNOW
                && desiredMode == DrivingMode.SPORTY ){
            System.out.println("Not allowed, set to ECO first");
        } else {
            currentMode = desiredMode;
        }
        
        System.out.println("Current mode is now " + 
                currentMode.name());
        changeDrivingMode(DrivingMode.CLIMBING);
    } // end main
    
    public static boolean changeDrivingMode(DrivingMode dm){
        
        System.out.println("Passed in mode: " + dm.description);
        return true;
    }
    
    
}

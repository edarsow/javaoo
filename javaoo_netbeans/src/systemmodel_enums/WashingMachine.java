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
public class WashingMachine {
    private Mode machineMode;
    private CycleStage stage;
    
    public WashingMachine(){
        machineMode = Mode.NORMAL;
    }
    
    public Mode getMode(){
        return machineMode;
    }
    
    public CycleStage getStage(){
        return stage;
    }
    
    public void setMode(Mode m){
        if(m == null){
            machineMode = Mode.NORMAL;
        } else {
            machineMode = m;
        }
        
        System.out.print("Machien mode set to: ");
        System.out.println(m.toString());
    }
    
    /**
     * Simulates the washing machine carrying out its primary
     * function of washing clothes. Reads its current Mode
     * value to determine length of cycle. Outputs to console
     * Strings to depict different washing intensities.
     * @return number of minutes the cycle takes at current 
     * machine mode
     */
    public int beginWashCycle(){
        switch(machineMode){
            case NORMAL:
                System.out.println("Swish swish");
                return 26;
            case BRIGHT_WHITES:
                System.out.println("Mmmm. Sway. Sway.");
                return 72;
            case HEAVY_DUTY:
                System.out.println("Grr. Thump. Swish. Crush.");
                return 91;
            case DELICATES:
                System.out.println(Mode.DELICATES.getMachineSound());
                return 41;
            case BULKY:
                System.out.println("Lumber. Tumble. Squish. Wobble.");
                return 84;
            case SANITARY:
                System.out.println("Clean. Squeak.");
                return 116;
            default:
                System.out.println("Default case");
                return 100;
        } // close switch
    } // close wash
} // close class

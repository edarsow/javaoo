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
public class WashClient {
    
    public static void main(String[] args) {
        
        WashingMachine wm = new WashingMachine();
        wm.setDegtergentLevel(33);
        
        try{
            System.out.println(wm.beginWashCycle());
            wm.setMode(Mode.DELICATES);
            // extract enum constant attributes
    //        wm.getStage().getStageOrder();
            System.out.println(wm.beginWashCycle());
        } catch (ModeException me){
            System.out.println(me.getMessage());
            System.out.println("Severity: " + me.severity.name());
        }
    }
    
}

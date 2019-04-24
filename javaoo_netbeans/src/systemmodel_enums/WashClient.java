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
        System.out.println(wm.beginWashCycle());
        
        wm.setMode(Mode.DELICATES);
        
        // extract enum constant attributes
        wm.getStage().getStageOrder();

        System.out.println(wm.beginWashCycle());
    }
    
}

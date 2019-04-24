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
public enum CycleStage {
    FILL (1),
    AGITATE (2),
    RINSE (3),
    DRAIN (4);
    
    private int stageOrder;
    
    CycleStage(int so){
        stageOrder = so;
    }
    
    public int getStageOrder(){
        return stageOrder;
    }
    
}

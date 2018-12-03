/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightclubrefactoring;

import java.util.List;

/**
 *
 * @author delores
 */
public class Contractor {
    public String fname;
    public String lname;
    public String phoneNum;
    
    public boolean availableForAdditionalContracts;
    
    private List<CarCrash> assignedCrashCases;
    
    public int assignCarCrash(CarCrash c){
        assignedCrashCases.add(c);
        return assignedCrashCases.size();
    }
    
    public void removeCrash(CarCrash c){
        assignedCrashCases.remove(c);
    }
    
    
    
}

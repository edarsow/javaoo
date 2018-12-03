/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightclubrefactoring;

/**
 *
 * @author delores
 */
public class SalariedEmployee {
    public String fname;
    public String lname;
    public String phoneNum;
    
    private CarCrash assignedCrash;

    /**
     * @return the assignedCrash
     */
    public CarCrash getAssignedCrash() {
        return assignedCrash;
    }

    /**
     * @param assignedCrash the assignedCrash to set
     */
    public void setAssignedCrash(CarCrash assignedCrash) {
        this.assignedCrash = assignedCrash;
    }
    
    
    public boolean registerAsEmployed(int employeeID){
        // guts
        return true; //assume successful employment process
    }
    
    /**
     * Simulates visiting the crash site and creating crash report
     * @param crash the CarCrash to investigate
     * @return determination of case acceptance onto docket
     */
    public boolean investigateCrash(CarCrash crash){
        // guts
        return true; // assume we take on the case
    }
    
    
}

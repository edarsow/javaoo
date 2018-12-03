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
public class Manager {
    public String fname;
    public String lname;
    public String phoneNum;
    
    private List<HourlyEmployee> assignedHourlyEmployees;
    private List<HourlyEmployee> assignedSalariedEmployees;
    
    
    public boolean registerAsEmployed(int employeeID){
        // guts
        return true; //assume successful employment process
    }

    /**
     * @return the assignedHourlyEmployees
     */
    public List<HourlyEmployee> getAssignedHourlyEmployees() {
        return assignedHourlyEmployees;
    }

    /**
     * @param assignedHourlyEmployees the assignedHourlyEmployees to set
     */
    public void setAssignedHourlyEmployees(List<HourlyEmployee> assignedHourlyEmployees) {
        this.assignedHourlyEmployees = assignedHourlyEmployees;
    }

    /**
     * @return the assignedSalariedEmployees
     */
    public List<HourlyEmployee> getAssignedSalariedEmployees() {
        return assignedSalariedEmployees;
    }

    /**
     * @param assignedSalariedEmployees the assignedSalariedEmployees to set
     */
    public void setAssignedSalariedEmployees(List<HourlyEmployee> assignedSalariedEmployees) {
        this.assignedSalariedEmployees = assignedSalariedEmployees;
    }
    
    
}

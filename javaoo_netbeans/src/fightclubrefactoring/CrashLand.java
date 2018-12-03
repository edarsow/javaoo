/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightclubrefactoring;

/**
 * client class for exercise's class hierarchy
 * @author delores
 */
public class CrashLand {
    public static void main(String[] args) {
        
        CarCrash crash1 = new CarCrash();
        CarCrash crash2 = new CarCrash();
        // assign me to an employee
        CarCrash crash3 = new CarCrash();
        
        SalariedEmployee salary1 = new SalariedEmployee();
        salary1.investigateCrash(crash1);
        
        HourlyEmployee hourly1 = new HourlyEmployee();
        hourly1.investigateCrash(crash2);
        
        // TODO
        // after refactoring,
        // demonstrate at least one method call on each
        // class in this demo
        
    }
            
    
}

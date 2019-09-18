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
public enum DrivingMode {
    ECO("Saves fuel be restricting acceleration"),
    SNOW("Automatically adjusts rear differential"),
    SPORTY("Increases responsiveness"),
    CLIMBING("Prioritizes low gears");
    
    public final String description;
    
    DrivingMode(String des){
        this.description = des;
    }
    
}

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
public class CarCrash {
    
    private int crashID;
    private String crashAddress;
    private int severityRating;

    /**
     * @return the crashID
     */
    public int getCrashID() {
        return crashID;
    }

    /**
     * @param crashID the crashID to set
     */
    public void setCrashID(int crashID) {
        this.crashID = crashID;
    }

    /**
     * @return the crashAddress
     */
    public String getCrashAddress() {
        return crashAddress;
    }

    /**
     * @param crashAddress the crashAddress to set
     */
    public void setCrashAddress(String crashAddress) {
        this.crashAddress = crashAddress;
    }

    /**
     * @return the severityRating
     */
    public int getSeverityRating() {
        return severityRating;
    }

    /**
     * @param severityRating the severityRating to set
     */
    public void setSeverityRating(int severityRating) {
        this.severityRating = severityRating;
    }
    
}

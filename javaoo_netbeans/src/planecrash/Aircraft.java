/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planecrash;

/**
 *
 * @author edarsow
 */
public class Aircraft {
 private int aircraftid;
    private int hours;
    private int cycles;
    private boolean catastrophicFailure;
    private double uncertaintly;
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Aircraft ID: " + aircraftid);
        sb.append(" Hours: " + hours);
        sb.append(" Cycles: " + cycles);
        sb.append(" Uncertainty: " + uncertaintly);
        sb.append(" Catasrophic failure? " + catastrophicFailure);
        return sb.toString();
        
    }
    

    /**
     * @return the aircraftid
     */
    public int getAircraftid() {
        return aircraftid;
    }

    /**
     * @param aircraftid the aircraftid to set
     */
    public void setAircraftid(int aircraftid) {
        this.aircraftid = aircraftid;
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * @return the cycles
     */
    public int getCycles() {
        return cycles;
    }

    /**
     * @param cycles the cycles to set
     */
    public void setCycles(int cycles) {
        this.cycles = cycles;
    }

    /**
     * @return the catastrophicFailure
     */
    public boolean isCatastrophicFailure() {
        return catastrophicFailure;
    }

    /**
     * @param catastrophicFailure the catastrophicFailure to set
     */
    public void setCatastrophicFailure(boolean catastrophicFailure) {
        this.catastrophicFailure = catastrophicFailure;
    }    

    /**
     * @return the uncertaintly
     */
    public double getUncertaintly() {
        return uncertaintly;
    }

    /**
     * @param uncertaintly the uncertaintly to set
     */
    public void setUncertaintly(double uncertaintly) {
        this.uncertaintly = uncertaintly;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex;

/**
 * Models a fed-ex package
 * @author sylvia
 */
public class Parcel {
    private int sizeCubicInches;
    private double weightGrams;
    private boolean recovered;

    /**
     * @return the sizeCubicInches
     */
    public int getSizeCubicInches() {
        return sizeCubicInches;
    }

    /**
     * @return the weightGrams
     */
    public double getWeightGrams() {
        return weightGrams;
    }

    /**
     * @param sizeCubicInches the sizeCubicInches to set
     */
    public void setSizeCubicInches(int sizeCubicInches) {
        this.sizeCubicInches = sizeCubicInches;
    }

    /**
     * @param weightGrams the weightGrams to set
     */
    public void setWeightGrams(double weightGrams) {
        this.weightGrams = weightGrams;
    }

    /**
     * @return the recovered
     */
    public boolean isRecovered() {
        return recovered;
    }

    /**
     * @param recovered the recovered to set
     */
    public void setRecovered(boolean recovered) {
        this.recovered = recovered;
    }
    
}

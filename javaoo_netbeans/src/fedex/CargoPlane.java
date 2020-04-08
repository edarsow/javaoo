/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex;

import java.util.List;

/**
 * Composite object representing a plane
 * carrying crew and parcels;
 * @author sylvia
 */
public class CargoPlane {
    private List<Parcel> parcels;
    private List<CrewMember> crew;
    private double altitudeStable;

    /**
     * @return the parcels
     */
    public List<Parcel> getParcels() {
        return parcels;
    }

    /**
     * @return the crew
     */
    public List<CrewMember> getCrew() {
        return crew;
    }

    /**
     * @return the altitudeStable
     */
    public double getAltitudeStable() {
        return altitudeStable;
    }

    /**
     * @param parcels the parcels to set
     */
    public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    /**
     * @param crew the crew to set
     */
    public void setCrew(List<CrewMember> crew) {
        this.crew = crew;
    }

    /**
     * @param altitudeStable the altitudeStable to set
     */
    public void setAltitudeStable(double altitudeStable) {
        this.altitudeStable = altitudeStable;
    }
    
    
    
}

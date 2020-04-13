/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sylvia
 */
public class FedExPlaneModel {
    final static double WEIGHT_H20_GRAMPERINCH3 = 18.14369;
    // a cubic package 24" on a side
    final static int MAX_PACKAGE_SIZE_INCH3 = 13824;
    final static int MAX_PACKAGE_WEIGHTGRAMPERINCH3 = 40;
    
    final static int MAX_CREW_AGE = 80;
    final static int MIN_CREW_AGE = 18;
    
    
    /**
     * Generator method for our composite business objects of 
     * CargoPlane. Outputted CargoPlane objects have lists of
     * initialized Parcel objects and CrewMember objects
     * @param crewSize number of CrewMember obs to creeate
     * @param parcelNum number of Parcels to create
     * @return an assembled CargoPlane
     */
    public CargoPlane generateCargoPlane(int crewSize, int parcelNum){
        // instantiate a business object!
        CargoPlane plane = new CargoPlane();
        // generate a List<CrewMembers> per crewSize input
        plane.setCrew(generateCrewMembers(crewSize));
        // generate a List<Parcel> per parcelNum input
        plane.setParcels(generateParcelList(crewSize));
        return plane;
    }
    
    
    /**
     * Generates a list of the inputted size and 
     * computes a random age for each crew member
     * based on the final member variables providing 
     * upper and lower bounds
     * @param crewSize number of crew to create
     * @return
     */
    private List<CrewMember> generateCrewMembers(int crewSize){
        List<CrewMember> crewList = new ArrayList<>();
        Random rand = new Random();
        // fill list with CrewMember objects of random ages
        for(int c = 0; c < crewSize; c++){
            CrewMember cm = new CrewMember();
            int a = rand.nextInt(MAX_CREW_AGE);
            if(a >= MIN_CREW_AGE){
                cm.setAge(a);
            } else {
                cm.setAge(a + MIN_CREW_AGE);
            }
            crewList.add(cm);
        }
        return crewList;
    }
    
    private List<Parcel> generateParcelList(int numPar){
        List<Parcel> parList = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < numPar; i++){
            Parcel p = new Parcel();
            p.setSizeCubicInches(rand.nextInt(MAX_PACKAGE_SIZE_INCH3));
            double gauss = rand.nextGaussian();
            // the mean weight will be that of h20
            // and we'll use the gauss draw of -1 to 1 to adjust the mean
            // by as much + or - the average (so the lightest package will be weight 0
            // and heaviest will be 2x the weight of water per inch^3
            double weight = WEIGHT_H20_GRAMPERINCH3 + (gauss * WEIGHT_H20_GRAMPERINCH3);
            p.setWeightGrams(weight);
            parList.add(p);
        }
        return parList;
    }
}

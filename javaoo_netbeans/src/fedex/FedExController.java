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
 * Controller object for fed-ex plane crash simulator using the
 * MVC design pattern a la the gang of four
 * @author sylvia
 */
public class FedExController {
    /**
     * Keeps a link to our model
     */
    private static FedExPlaneModel model;
    /**
     * Keep a link to our view system
     */
    private static FedExViewCLI view;
    
    public static void main(String[] args) {
        // instantiate both the model objects and any necessary view objects
        model = new FedExPlaneModel();
        view = new FedExViewCLI();
        // setup config with help from view
        SimulationConfig config = initSimulation();
        // run sim
        config = runSim(config);
        view.displaySimulationResults(config);
    }
    
    /**
     * Creates a config parameter bundle object, sends to view
     * and returns to caller for next steps
     * @return SimulationConfig object with set member variables
     */
    private static SimulationConfig initSimulation(){
        SimulationConfig config = view.prepareSimulationParams(new SimulationConfig());
        // implement business logic checks on what I get from the user
        // its NOT the view's job to check business rules!
        if(config.getCrewSize() < 1){
            config.setCrewSize(10);
        } 
        if(config.getParcelCount() < 1){
            config.setParcelCount(1000);
        }
        if(config.getPlaneCount() < 1){
            config.setPlaneCount(5);
        }
        return config;
    }
    
    /**
     * Given a properly setup configuration object, undertake the actual
     * simulation of crashing the planes and setting outcomes of plane variables
     * @param config loaded up configuration Object
     * @return config object with crashed planes (i.e. member variables set)
     */
    private static SimulationConfig runSim(SimulationConfig config){
        List<CargoPlane> planeList = new ArrayList<>();
        // based on inputted parameters, ask model for objects
        for(int i = 0; i < config.getPlaneCount(); i++){
            // each plane in this sim has the same number of crew and parcels
            planeList.add(model.generateCargoPlane(config.getCrewSize(), config.getParcelCount()));
        }
        // iterate over my plane list again, this time setting flags for 
        // recovery of parcels and surival of crew (i.e. the simulated outcomes)
        for(CargoPlane pl: planeList){
            // take crew out of plane, send to simulator of death, inject back into plane
            pl.setCrew(simulateCrewSurvival(pl.getCrew()));
            pl.setParcels(simulateParcelRecovery(pl.getParcels()));
        }
        config.setPlaneList(planeList);
        return config;
    }
    
    
    /**
     * Simulates crew survival rates based on age
     * @param crewList
     * @return list of CrewMembers with survival flags set
     */
    private static List<CrewMember> simulateCrewSurvival(List<CrewMember> crewList){
        Random r = new Random();
        for(CrewMember cr: crewList){
            // sample logic for crew survival
            if(cr.getAge() > 50){
                cr.setSurvived(r.nextBoolean());
            } else {
                if(r.nextDouble() > .75){
                    cr.setSurvived(false);
                } else {
                    cr.setSurvived(true);
                }
            }
        }
        return crewList;
    }
    
    /**
     * Compares parcel density to water density and sets recovered flags
     * @param pList
     * @return list of Parcels with recovered flags set
     */
    private static List<Parcel> simulateParcelRecovery(List<Parcel> pList){
        for(Parcel p: pList){
            double parcelDensity = p.getWeightGrams() / p.getSizeCubicInches();
            System.out.println("Parcel density: " + parcelDensity);
            if(parcelDensity > FedExPlaneModel.WEIGHT_H20_GRAMPERINCH3){
                p.setRecovered(false);
            } else {
                p.setRecovered(true);
            }
        }
        return pList;
    }
    
}

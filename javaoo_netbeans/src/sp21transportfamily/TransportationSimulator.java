/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

import java.util.List;

/**
 *
 * @author edith
 */
public class TransportationSimulator implements TransportSimulatable {

        
    private String simulationResults;
    
    
    // create a constructor
    public TransportationSimulator(){
        simulationResults = null;
    }
    
    @Override
    public void runTransportSimulation(List<TransportVehicle> vList) {
        
        StringBuilder sb = new StringBuilder();
        int passTotal = 0;
        // Only examine elements if we actually have a list and that list
        // is NOT empty (!)
        if(vList != null && !vList.isEmpty()){
            // Use Enhanced for Loop to visit each item individually
            // This says, serve me once TransportVehicle at a time, 
            // and do so by sticking it in the variable called v
            // which I can look at more closely inside the for loop
            for(TransportVehicle v: vList){
                sb.append("***************************************\n");
                sb.append("Examining Vehicle: " + v.getCallSign() + "\n");
                sb.append("Passenger Count: " + v.getPassengerCount() + "\n");
                passTotal = passTotal + v.getPassengerCount();
            } // enhanced for loop
            sb.append("****** OVERALL RESULTS *******");
            sb.append("Total Passengers in all vehicles: " + passTotal);
            
        }
        // after we've run the simulatoin, dump our String train into 
        // the member variable which holds simulation results
        simulationResults = sb.toString();
        
    }

    @Override
    public String getSimulationResults() {
        
        // ship to caller the results of the most recent simulation
        return simulationResults;
            
    }
    
}

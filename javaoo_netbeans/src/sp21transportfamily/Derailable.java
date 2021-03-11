/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

/**
 * Interface implemented by PassengerTrain
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public interface Derailable {
    
    /**
     * Implementing class must determine based on its
     * speed and gross weight whether or not a portable
     * derailer would successfully shove locomotive off tracks
     * @return 
     */
    public boolean canBeDerailed();
    
}

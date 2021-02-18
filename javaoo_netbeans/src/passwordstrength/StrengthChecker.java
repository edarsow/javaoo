/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

/**
 * Tool class for evaluating candidate password strength 
 * against a set of requirement
 * 
 * TODO: Consider how to store/encode the strength requirements for
 * the candidate passwords. Option 1: FINAL variables in this class
 * Option 2: Store requirements in an external file and read that file
 * into Java and then check candidate passwords
 * 
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class StrengthChecker {
    
    
    /**
     * Checks a candidate for the presence of a given character
     * @param candidatePswd
     * @param reqChar
     * @return true for does contain required char, false for does not
     */
    public boolean checkForCandidateCharacter(String candidatePswd, char[] reqChar){
        // TODO over weekend: check for null inputs, and retur false under any
        // null input
        
        
        // start assuming non presence of reqChar
        boolean containsChar = false;
        // convert reqChar character to String
        String required = new String(reqChar);
        // flip containsChar to true if we find reqChar in candidatePswd
        int index = candidatePswd.indexOf(required);
        
        if(index != -1){ // We found the required String
          // toggle my control variable
          containsChar = true;
        } 
        
        return containsChar;
    } // close method
    
    
    
} // close class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmodel_enums;

/**
 * Thrown when a user attempts to perform an action now allowed
 * when machine is in its current mode
 * @author Loretta
 */
public class ModeException extends Exception {
    ExceptionSeverity severity;    
    public ModeException(String msg, ExceptionSeverity sev){
        super(msg);
        severity = sev;
    }
}

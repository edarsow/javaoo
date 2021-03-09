/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

import passwordstrength.studcode.cit130.PasswordStrengthChecker.StrengthChecker;

/**
 * Client class for our Password Strength Checking machine
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class PasswordClient {
    public static void main(String[] args) {
        // Create an instance of our password checking machine
        StrengthChecker checker = new StrengthChecker();
        String candidatePswd = "baseBa11isTooLongToBEAPassword";
        
        // fire up our checker machine, and store messages
        String message = checker.verfiyCandidatePassword(candidatePswd);
        System.out.println(message);
        
        
    }
}

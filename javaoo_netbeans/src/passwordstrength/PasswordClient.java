/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

/**
 * Client class for our Password Strength Checking machine
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class PasswordClient {
    public static void main(String[] args) {
        StrengthChecker checker = new StrengthChecker();
        char[] arr = {'@'};
        System.out.println("Candidate passed? " + checker.checkForCandidateCharacter("r0mbo", arr));
    }
}

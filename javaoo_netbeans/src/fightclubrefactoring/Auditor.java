/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightclubrefactoring;

/**
 *
 * @author delores
 */
public class Auditor {
    public String fname;
    public String lname;
    public String phoneNum;
    
    public String certificationTitle;
    public java.time.LocalDateTime cetificationExpiryDate;
    
    /**
     * Carries out an audit of an organization with the inputted EIN
     * @param organizationEIN assigned by the IRS
     * @return the result of the audit
     */
    public boolean conductAudit(int organizationEIN){
        // guts
        return false; // assume a failed Audit
    }
    
}

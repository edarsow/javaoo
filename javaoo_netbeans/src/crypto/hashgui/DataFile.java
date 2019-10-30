/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto.hashgui;

/**
 *
 * @author edarsow
 */
public class DataFile {
    private java.io.File file;
    private String fileContents;
    private String md5Hash;
    
    public String getHashValue(){
        // maybe this is where we call MessageDigest.digest()?
        return "";
    };
    
    /**
     * Compare the md5 hash values of
     * this and the passed in object
     * to test for equality
     * @param df
     * @return 
     */
    @Override
    public boolean equals(Object df){
        if(!(df instanceof DataFile)){
            return false;
        } 
        
        // we know that if we're here, we have
        // a DataFile
        // cast df to DataFile and 
        // store in an appropriately typed object
        
        return false;
    }
}

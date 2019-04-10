/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordStrengthMachine;

import java.util.Arrays;

/**
 * An object to test the strength of a password
 * @author eliza
 */
public class StrengthChecker {
    
    private boolean isSecure = true;
    private boolean hasLower = false;
    private boolean needsLower;
    private boolean hasUpper = false;
    private boolean needsUpper;
    private boolean hasSymbol = false;
    private boolean needsSymbol;
    private boolean hasNumber = false;
    private boolean needsNumber;
    private boolean hasForbidden = false;
    private String[] forbiddenSymbols;
    private String[] requiredSymbols;
    private String errorMessage = "Please type your password";
    
    
    int minLength;
    int maxLength;
    
    /**
     * compares an input password to a set of parameters to decide if the 
     * password is secure
     * @param password String of password being checked
     * @return isSecure boolean telling if password is secure based on the set parameters
     */
    public boolean checkPassword(String password){
        errorMessage = "";
        char [] arr = password.toCharArray();
        isSecure = true;
        errorMessage = "";
        
        //test length of password
        if(arr.length < minLength || arr.length > maxLength){
            error("Password must be between " + minLength +" and " + maxLength);
            isSecure = false;
           
        }

        for(char character: arr){
            //text char to see if it is upper or lower letter or number
            if(Character.isLetterOrDigit(character)){
                if(Character.isLetter(character)){
                    if(Character.isUpperCase(character)){
                        hasUpper = true;
                    } else hasLower = true;
                }else hasNumber = true;
            //remaining char must be symbols, test against forbidden & required    
            }else{
                for(char symbol: arr){
                    if(Arrays.asList(requiredSymbols).contains(symbol + "")){
                        hasSymbol = true;
                    }
                    if(Arrays.asList(forbiddenSymbols).contains(symbol + "")){
                        hasForbidden = true;
                    }
                        
                }
        //check
        if(hasForbidden){
            error("Illegal symbol detected. The following are not allowed: " + forbiddenSymbols);
            isSecure = false;
        }  
        if(needsLower && !hasLower){
            error("Lowercase letter required");
            isSecure = false;
        }
        if(needsUpper && !hasUpper){
            error("Uppercase letter required");
            isSecure = false;
        }
        if(needsSymbol && !hasSymbol){
            error("Password must contain one of the following: " + requiredSymbols);
            isSecure = false;
        }
        if(needsNumber && !hasNumber){
            error("Number Required");
            isSecure = false;
        } 
        }
        
        }
        return isSecure;
    }
        
    /**
     * adds a string to the errorMessage
     * @param addingError string being added to errorMessage
     */
    public void error(String addingError){
           errorMessage =  errorMessage.concat(errorMessage + "n/" + addingError);
    }

    /**
     * returns the errorMessage created when the password was tested
     * @return errorMessage 
     */
    public String getErrors(){
        return errorMessage;
    }
    
    /**
     * sets if an uppercase letter is required
     * @param upperCaseRequired boolean deciding if an uppercase letter is required
     */
    public void setUpperCase(boolean upperCaseRequired){
        needsUpper = upperCaseRequired;
    }
    
    /**
     * sets if a lowercase letter is required for the password
     * @param lowerCaseRequired boolean deciding if a lowercase letter is required
     */
    public void setLowerCase(boolean lowerCaseRequired){
        needsLower = lowerCaseRequired;
    }
    
    /**
     * sets if a symbol is required for the password
     * @param symbolRequired boolean telling if there must be a symbol in the password
     */
    public void setNeedsSymbol(boolean symbolRequired){
         needsSymbol = symbolRequired;
    }
    
    /**
     * sets maximum and minimum lengths of the password
     * @param max int maximum allowed password size
     * @param min int minimum allowed password size
     */
    public void setLength(int max,int min){
        maxLength = max;
        minLength = min;
    }
    
    /**
     * adds symbols to the set of forbidden characters
     * @param toAdd String of characters to add
     */
    public void addForbiddenSymbols( String toAdd){
        if(forbiddenSymbols == null){
            forbiddenSymbols = toAdd.split("");
        }else{
            String[] holdingArr = toAdd.split("");
            String[] otherArr = forbiddenSymbols;
            forbiddenSymbols = new String[holdingArr.length + otherArr.length];
            int i= 0;
            int k= 0;
            for(String str: forbiddenSymbols){
                str = holdingArr[i];
                i++;
            }
            for(int j = i;j<forbiddenSymbols.length;j++){
                forbiddenSymbols[j]=otherArr[k];
                k++;
            }
        }
    }
    
    
    /**
     * removes symbols from the set of forbidden characters
     * @param toDelete string of characters to remove
     */
    public void removeForbiddenSymbols(String toDelete){
        for(String st: forbiddenSymbols){
            if(st.equals(toDelete)){
                st = null;
            }
        }
    }
    /**
     * clears all characters from the set of forbidden characters
     */
    public void clearForbiddenSymbols(){
        forbiddenSymbols = new String[0];
    }
    
    /**
     * 
     * @return forbiddenSymbols String[] containing characters that are not allowed
     */
    public String[] getForbiddenSymbols(){
        return forbiddenSymbols;
    }
    
    /**
     * adds characters to the list of possible required characters
     * @param toAdd
     */
    public void addRequiredSymbol(String toAdd){
        
    }
    
    /**
     * removes characters from the list of possible required characters
     * @param toDelete the symbol to remove
     */
    public void removeRequiredSymobol(String toDelete){
        int i = 0;
        for(String st: requiredSymbols){
            if(st.equals(toDelete)){
                requiredSymbols[i] = null;
            }
            i++;
        }
    }
    
    /**
     * clears all characters from requiredSymbols
     */
    public void clearRequiredSymbols(){
        requiredSymbols = new String[0];
    }
    
    /**
     * gets the array of symbols that could be required
     * @return  String[] of required symbols
     */
    public String[] getRequiredSymbols(){
        return requiredSymbols;
    }
    
    /**
     * gets the minimum password length
     * @return  int minimum password length
     */
    public int getMinLength(){
        return minLength;
    }
    
    /**
     * gets the maximum password length
     * @return int maximum password length
     */
    public int getMaxLength(){
        return maxLength;
    }
}

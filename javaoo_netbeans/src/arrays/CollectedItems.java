/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Object to manage and display
 * an array of String representing
 * collected items
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class CollectedItems {
    
    // MEMBER VARIABLES
    private String[] collectionArray;
    private String title;
    
    // MEMBER METHODS
    
    /**
     * Constructor-like method that creates our array of
     * collected items and a title
     * @param collectionSize how many items you plan to store
     * @param t name of the collection
     */
    public void setupCollection(int collectionSize, String t){
        // Create an array of the requested size, store in collectionArray
        // operating on my member variables
        collectionArray = new String[collectionSize];
        // inject the given String as the title
        title = t;
        
    } // close setupCollection
    
    /**
     * Adds the given item to this object's internal array
     * @param itemName the title of the item to store
     */
    public void insertItem(String itemName){
        // Which array shelf should I store the inputted item?
        // Loop over collectionArray, and store the item in 
        // the first bin whose value is NULL
        for(int c = 0; c < collectionArray.length ; c++ ){
            // see if the current "bin" is NULL
            // if it's NULL, insert the item
            // not NULL? Keep going
            if(collectionArray[c] == null){
                collectionArray[c] = itemName;
                // once I wrote item, done!
                // leave my for loop
                break;
            } // close if
            
        } // close for
    } // close insertItem
    
    /**
     * Dumps to console this object's array
     */
    public void displayCollection(){
        System.out.println("Items in: " + title);
       for(int r = 0; r < collectionArray.length; r++){
           System.out.println("Item " + (r + 1) + " " + collectionArray[r]);
       }  // close for
    } // close displayCollection
    
    
    
    
} // close class

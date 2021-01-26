/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Client class for an array of Collected Items
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class CollectionLand {
    /**
     * Front door of our program practicing array-based object structures
     * @param args 
     */
    public static void main(String[] args) {
        // Make an instance of my CollectedItems
        CollectedItems elecTools = new CollectedItems();
        // called our setup method, passing in 10 for numItems
        // and a title of our collection
        elecTools.setupCollection(10, "Eric's Electrical Stuff");
        // Add items with calls to insertItem
        elecTools.insertItem("Wire Strippers");
        elecTools.insertItem("Cable cutters");
        elecTools.insertItem("Romex Stripper");
        
        // show collection
        elecTools.displayCollection();
        
        // TODO: For Thursday
        // Fill in several items in your first collecetion
        
        // TODO: Make a second instance of CollecetedItems
        // and populate it with songs you like
        CollectedItems popSongs = new CollectedItems();
        // Keep going!
        
        
    } // close main
    
    
    
    
} // close class

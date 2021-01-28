/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;

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
        // When possible, do as little coding in main
        // as practical, to help with code re-use
        
        // Turn off method to use user input
//        loadSampleCollectionData();

        // Turned off to demo switch
//        startUserInputtedCollection();
        
        menuWithSwitch();
        
    } // close main
    
    /**
     * Test code for creating and using our CollecetedItems
     * class
     */
    public static void loadSampleCollectionData(){
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
        
    } // close loadSampleData
    
    /**
     * Method which allows users to add an item to a collection
     * and view its output
     */
    public static void startUserInputtedCollection(){
        System.out.println("Welcome to the collection tool");
        System.out.println("How many items do you want to collect?");
        // TODO: Create a Scanner instance
        // TODO: use Scanner to read an integer from user
        // Also ask for the name of the collection
        
        // TODO: Feed the user's num & name to our setupCollection method
        
        // TODO: Ask user to enter values for each item in 
        // the collection
        
        // Display all collected items
        // OPTIONAL: Use a switch statement to
        // create a menu like interface
        // EG: 1: Start new collecetion
        //     2: Enter items
        //     3: Display items
        //     4: Remove, reorder, rename items?
        
    } // close startUserCollection
    
    /**
     * Demo of swtich statements powering menus for the user
     */
    public static void menuWithSwitch(){
        
        int menuSelection = 0;
        // Create a new Scanner object wired to read from the keyboard
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Select your favorite music genre from list and press enter");
        System.out.println("1. Alternative");
        System.out.println("2. Rock 'n Roll");
        System.out.println("3. Folk/ Bluegrass");
        System.out.println("4. Hip Hop");
        System.out.println("5. Soul");
        System.out.println("6. Top 40");
        System.out.println("7. EDM");
        
        menuSelection = inputScanner.nextInt();
        
        
        System.out.println("Chained ifs:");
        if(menuSelection == 1){
            System.out.println("You chose alternative");
        } else if(menuSelection == 2){
            System.out.println("You chose rock 'n roll");
        } else if(menuSelection == 3){
            System.out.println("You chose folk/bluegrass");
        } else {
            System.out.println("Not enough time to check the others, sorry!");
        }
        
        System.out.println("Switch");
        switch(menuSelection){
            case 1:
                System.out.println("You chose alternative");    
                break;
            case 2: 
                System.out.println("You chose rock 'n roll");
                break;
            case 3:
                System.out.println("You chose folk/bluegrass");
                break;
            default:
                System.out.println("I don't know that type of music, sorry!");
                
        } // close switch
        
        
        System.out.println("You selected: " + menuSelection);
        
        
    }
    
    
    
} // close class

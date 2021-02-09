/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Models a single line of a lyric in a song
 * and contains timing data
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class LyricLine {
    
    // Member variables
    public String lineText;
    public long timeToDisplayMilli;
    
   
    /**
     * Default, no-argument constructor lives here
     * Constructor names are ALWAYS identical to 
     * the class name, with optional input arguments
     */
    public LyricLine(){
        System.out.println("Inside no-arg constructor");
        // Initializing member varibles to sensible 
        //defaults
        lineText = "[no lyric]";
        // Inject a sensible default display time
        timeToDisplayMilli = 1000;
        
    } // close no-arg constructor
    
    /**
     * Creates an instance of LyricLine
     * @param lt actual line's text
     * @param ms number of milliseconds to display line
     */
    public LyricLine(String lt, long ms){
        System.out.println("Inside two-arg constructor:");
        System.out.println("Received lt: " + lt);
        System.out.println("Received ms: " + ms);

        // transfer the input parameters to our member variables
        lineText = lt;
        timeToDisplayMilli = ms;
        
        
    } // Close two-arg constructor
    
} // close class

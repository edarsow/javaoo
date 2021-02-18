/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Client class of LyricMachine
 * Practice commenting behavior
 * Write code for humans and computers
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class SongWorld {
    public static void main(String[] args) {

//        testLyricMachine();
//        testLyricLine();
        buildLyricLineArray();
    
    } // close main
    
    public static void testLyricMachine(){
        // make instance of machine
        LyricMachine lm = new LyricMachine();
        lm.initializeArray(5, 4);
        lm.readInLyrics();
        lm.displayLyrics();
    }// Close test
    
    public static void testLyricLine(){
        // Creating an instance of LyricLine with no-arg const
        LyricLine lineTest1 = new LyricLine();
        // assing a lyric to our line
//        lineTest.lineText = "As the sun goes down";
        displayLyricLineInfo(lineTest1);
        
        // Create a LyricLine with inputs
        // for line text and displayTime
        LyricLine lineTest2 = new LyricLine("Been sittin' on my window-sill all day", 4480);
        displayLyricLineInfo(lineTest2);
        
    } // close test lyric line
    
    /**
     * Test code for arrays of custom types!
     */
    public static void buildLyricLineArray(){
        // Create an array size 3
        LyricLine[] superLyrics = new LyricLine[4];
        // CHAT TASK: assign new LyricLine("Been sittin' on my window-sill all day", 4480);
        // to shelf 0
        superLyrics[0] =  new LyricLine("There's a pigeon that's", 2090);
        superLyrics[1] =  new LyricLine("Been sittin' on my window-sill all day", 6480);
        superLyrics[2] =  new LyricLine("I guess he's lonely too", 2350);
        superLyrics[3] =  new LyricLine("I wonder if his love has flown away", 4000);
        // pass our nice array of LyricLines to our Karaoke simulator
        karaokeSimulation(superLyrics);
        
    } // close test
    
    /**
     * Displays lines of lyrics with timings
     * @param kTape Array of instantiated LyricLine objects
     */
    public static void karaokeSimulation(LyricLine[] kTape){
        Scanner scan = new Scanner(System.in);
        // wait for an enter press
        String wait = scan.nextLine();
        
        // iterate over our incoming array of LyricLines, one at a time
        for(int line = 0; line < kTape.length; line++){
                // Extract the LyricLine object from our current row
                // and store temporarily
                LyricLine tempLine = kTape[line];
                // dump lyric to console
                System.out.println(tempLine.lineText);
                try {
                    Thread.sleep(tempLine.timeToDisplayMilli);
                }catch (InterruptedException ex) {
                    // do nothing
                }
            } // close for
            
    } // close Karaoko
    
    /**
     * Utility methods for displaying guts of a lyric line
     * @param line 
     */
    private static void displayLyricLineInfo(LyricLine line){
        System.out.println("Text: " + line.lineText);
        System.out.println("Time to display: " + line.timeToDisplayMilli);
    } // close utility methods
    
} // Close Class

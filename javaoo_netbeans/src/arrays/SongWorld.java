/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Client class of LyricMachine
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class SongWorld {
    public static void main(String[] args) {
        // make instance of machine
        LyricMachine lm = new LyricMachine();
        lm.initializeArray(5, 4);
        lm.readInLyrics();
        lm.displayLyrics();
        
        
    }
    
}

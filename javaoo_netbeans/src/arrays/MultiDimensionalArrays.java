/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class MultiDimensionalArrays {
    
    public static void main(String[] args) {
        // Create a two-dimensional array of String values
        // each bin of which describes the contents
        // of Eric's electrical wire clip holder
        // We want a 6x3 grid, which Java thinks of as 6 arrays, each with an array 
        // of length 3 inside it
        String[][] electricalClips = new String[6][3];
        // Assign the description of the upper left bin
        // to the first row, first column
        electricalClips[0][0] = "Plastic only, 3/4\"";
        electricalClips[1][2] = "Metal insulated, 5/16\"";
        electricalClips[2][1] = "Silly romex clips 3/4\"";
        
        System.out.println("Value of electricalClips.length: " + electricalClips.length);
        
        // TODO tinkering for Thursday 4-Feb-21
        /*
        ADJUST Eric's electrical clips to be some grid of stuff interesting 
        to you!
        
        Adjust the array looping code such that the output displays
        the current row and column count for each value
        Sample:
        CONTENTS ROW 1:
            COL 1: "blah blah"
            COL 2: "Blah Blah"
        CONTENTS ROW 2:
            COL 1: "Blah Bloo"
        
        Extension IDEA: Can you create an output that actually draws lines
        and makes a grid display of values
        
          5 | 6 | 6  | 4
        ------------------
         8  | 9 | 24 | 2
        
        */
        
        
        // Display values of the array
        // outer for loop iterates over the rows of our 6x3 array
        for(int row=0; row < electricalClips.length; row++){
            // this inner for() loops over each column in our CURRENT row
            for(int col=0; col < electricalClips[row].length; col++ ){
                // now, send to console the value of the current row and col
                System.out.println("Bin contents: " + electricalClips[row][col]);
            } // close inner for over the columns
            // add a return character to start a new row on console
            System.out.println();
        } // close outer for over the rows
        
    } // close main
        
    
} // close class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class AndreCheck {
    public static void main(String[] args) {
          // Create a two-dimensional array of String values
    // each bin of which describes the contents
    // of Eric's electrical wire clip holder
    // We want a 6x3 grid, which Java thinsk of as 6 arrays, each with an array
    // of lenght 3 inside it.
    String[][] electricalClips = new String[6][3];
    // Assign the description of the upper left bin
    // to the first row, first column
    electricalClips[0][0] = "Plastic only, 3/4\"";
    electricalClips[1][2] = "Metal insulated, 5/16\"";
    electricalClips[2][1] = "Silly romex clips 3/4\"";
    
    // Display values of the array
    // outer for loop iterates over the row of our 6x3 array
    for(int row=0; row < electricalClips.length; row++){
        // this inner for() loops over each column in our CURRENT row
        
        // This displays the contents of each row
        System.out.println("Row " + (row+1) + ":");
        for(int col=0; col < electricalClips[row].length; col++){
            // Display the results by column IN EACH ROW
            System.out.println("Column " + col+ ": " + electricalClips[row][col]);
                    } // close inner for over the columns
        // add a return characte3r to start a new row on the console
        System.out.println();
    } // close outer for the over the rows

    
    // Display values of the array
    
    }
}

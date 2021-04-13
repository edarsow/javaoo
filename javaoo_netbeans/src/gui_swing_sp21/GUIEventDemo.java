/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_swing_sp21;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.StrokeBorder;

/**
 * Code along with Daniel Liang edition 9 with integration of
 * our Movie GUI project
 * @author edith
 */
public class GUIEventDemo extends JFrame{
    // Design pattern will be to create a member variable for each
    // primary component in our program
    private JLabel jlblMessage = new JLabel("Greetings", JLabel.CENTER);
    
    private JCheckBox jchkBold = new JCheckBox("Bold");
    private JCheckBox jchkItalic = new JCheckBox("Italic");
    
    public static void main(String[] args) {
        // Make an instance of our very own class--THIS CLASS
        // and by making an instance of this class, 
        // the constructor will get called, in which we'll
        // setup our key GUI components from the very first
        // line!
        GUIEventDemo frame = new GUIEventDemo(); // call constructor
        frame.pack(); // make size of window the minimum possible to show components
        frame.setTitle("GUI Event Demo");
        frame.setLocationRelativeTo(null); // put window in middle of screen with null
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // easier x button setup
        frame.setVisible(true);
    } // close main
    
    // MIGHTY CONSTRUCTOR, this is a special method
    // called when an instance of this class is created, usually 
    // with the new keyword
    public GUIEventDemo(){
        System.out.println("Setting up GUI In Constructor");
        // customize the display our JLabel component by setting a border
        jlblMessage.setBorder(new StrokeBorder(new BasicStroke(12,1,2,12)));
        // we've inherited the supremely important add() method from our
        // parent, javax.swing.JFrame which allows us to actually put
        // a component in our JFrame (i.e. "a window")
        add(jlblMessage, BorderLayout.CENTER);
        
            
    } // close constructor
    
} // close class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_swing_sp21;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
        
        JPanel jpCheckBoxes = new JPanel();
        // tell the JPanel how to organize the components we insert with .add()
        jpCheckBoxes.setLayout(new GridLayout(1,2));
        // add our subcomponents
        jpCheckBoxes.add(jchkBold);
        jpCheckBoxes.add(jchkItalic);
        // add our whole mini-panel to our master frame
        add(jpCheckBoxes, BorderLayout.EAST);
        
        // register listener with check boxes
        jchkBold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // call our setFont() method
                setNewFont();
            }
        });
        
        jchkItalic.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // call our setFont() method
                setNewFont();
            }
        });
        
        
        
            
    } // close constructor
    
    private void setNewFont(){
        System.out.println("Checking current check box settings and computing new value");
        int fontStyle = Font.PLAIN;
        // strange looking if/else on a single line
        // computing an integer value to represent our desired font
        fontStyle += (jchkBold.isSelected() ? Font.BOLD : Font.PLAIN);
        fontStyle += (jchkItalic.isSelected() ? Font.ITALIC : Font.PLAIN);
        
        Font font = jlblMessage.getFont();
        jlblMessage.setFont(new Font(font.getName(), fontStyle, font.getSize()));
        jlblMessage.setText("My display has been changed!");
        
    } // close setNewFont
        
    
} // close class

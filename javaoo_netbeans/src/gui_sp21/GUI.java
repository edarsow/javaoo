/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_sp21;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Demo code along with the AWT packet from website
 * @author edith
 */
public class GUI {
     private static Frame mainFrame;
     
     public static void main(String[] args){
         // delegate all work to makeGUI
         makeGUI();
     } // close main
     
     public static void makeGUI(){
          // create an instance of the Frame class and store a handle to
          // it in our member variable
          
         mainFrame = new Frame("Spring 2021 CIT 130 AWT Demo");
         
         // Start configuring our window by giving it an instance of
         // GridLayout
         mainFrame.setLayout(new GridLayout(1,2));
         
         // tell the frame its size
         mainFrame.setSize(500, 250);
         
         // tell the frame to show itself to the user
         mainFrame.setVisible(true);
         
         // writing an eventhandler that will be called automatically 
         // when the user clicks the x button
         mainFrame.addWindowListener(new WindowAdapter(){
             @Override
             public void windowClosing(WindowEvent windowEvent){
                 System.out.println("WindowEvent: " + windowEvent.getSource().toString());
                 System.out.println("I'm the window event listener method!");
                 // close program
                 System.exit(0);
             } // close our overridden method on the WindowAdapter class
             
         }); // close class to addWindowListener method, into which we're passing
         // an entire class, with a customized method inside it
         
         
         
     }
    
    
} // close class

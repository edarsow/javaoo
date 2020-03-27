/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sylvia
 */
public class HandleEvent extends JFrame {
    
    private JButton buttonOK = new JButton("OK");
    private JButton buttonCancel = new JButton("Cancel");
    
    
    public HandleEvent(){
        // Step 1: Create sub-objects (i.e. controls)
        
        // Step 2: Create panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(buttonCancel);
        panel.add(buttonOK);
        
        // we call the add() method on JFrame
        // all praise Java inheritance!!
        add(panel);
        
        // Register the listener classes (which implement the listener methods)
        ButtonOKListener bok = new ButtonOKListener();
        ButtonCancelListener bcncl = new ButtonCancelListener();
        // CODE TO INTERFACES!!!
        // tell the buttons which method to call when clicked
        // (by giving the a class that implements the ActionListener
        // interface
        buttonOK.addActionListener(bok);
        buttonCancel.addActionListener(bcncl);
        
    } // close constructor
    
    public static void main(String[] args) {
        JFrame myFrame = new HandleEvent();
        myFrame.setTitle("Practice Swing stuff");
        myFrame.setSize(500, 500);
        myFrame.setLocation(231, 411);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
    
    /**
     * Inner class action listener who can ACCESS any components of the
     * out class, including our button variables
     */
    class ButtonOKListener implements ActionListener {
        private int toggle = 0;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("You clicked the OK button you lucky salmon!");
            toggle++;
            if(toggle % 2 == 0){
                buttonCancel.setText("Don't change me dammit!");
            } else {
                buttonCancel.setText("Cancel");
            }
        }

    } // close listener inner class

    class ButtonCancelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("You canceled me!");
        }
    } // close listener inner class
    
} // close public class


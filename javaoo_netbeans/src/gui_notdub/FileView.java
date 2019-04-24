/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_notdub;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author edarsow
 */
public class FileView {
    
    
    private FileController controller;
    private JLabel output;
    
    
    public void initializeWindow(){
        JFrame jf = new JFrame("Simple File");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        
        JButton loadButton = new JButton("Load file data");
        loadButton.setSize(80, 50);
        loadButton.addActionListener(new LoadFileDataListener());
        
        JTextArea textDisplay = new JTextArea("Area");
        textDisplay.setSize(50, 80);
        
        JTextField fileDataField = new JTextField("");
        fileDataField.setSize(80, 50);
        
        output = new JLabel("");
        
        
        jf.add(fileDataField);
        jf.add(loadButton);
        jf.add(textDisplay);
        jf.add(output);
        
        
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        
    }
    
    class LoadFileDataListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(controller != null){
                String t = controller.retrieveFileContents(FileController.FILE_NAME);
                System.out.println("Inside Action Listener; file: " + t);
                output.setText(t);
            }
        }
    }

    /**
     * @return the controller
     */
    public FileController getController() {
        return controller;
    }

    /**
     * @param controller the controller to set
     */
    public void setController(FileController controller) {
        this.controller = controller;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author edarsow
 */
public class KeyProcessing extends JFrame{
    private KeyboardPanel keyPanel = new KeyboardPanel();
    
    public KeyProcessing(){
        add(keyPanel);
        keyPanel.setFocusable(true);
    }
    
    public static void main(String[] args) {
        KeyProcessing frame = new KeyProcessing();
        frame.setTitle("Key event demo");
        frame.setSize(250,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    static class KeyboardPanel extends JPanel{
        private int x =100;
        private int y = 100;
        private char keyChar = 'X';
        
        public KeyboardPanel() {
            addKeyListener(new KeyAdapter() {
               @Override
               public void keyPressed(KeyEvent ev){
                   switch (ev.getKeyCode()){
                       case KeyEvent.VK_DOWN: 
                           if(y<=140) y += 10; 
                           break;
                       case KeyEvent.VK_UP: y -= 10; break;
                       case KeyEvent.VK_RIGHT: x += 10; break;
                       case KeyEvent.VK_LEFT: x -= 10; break;
                   }
                   repaint();
               }
            });
        }
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
            g.drawString(String.valueOf(keyChar), x, y);
        }
    }
    
}

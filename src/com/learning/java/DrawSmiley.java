package com.learning.java;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawSmiley extends JPanel
{
        public void paintComponent (Graphics g){
                super.paintComponent(g);

                //Draw the face
                g.setColor(Color.YELLOW);
                g.fillOval(10,10,200,200);

                //Draw the eyes
                g.setColor(Color.BLACK);
                g.fillOval(55,65,30,30);
                g.fillOval(135,65,30,30);

                //Draw the mouth
                g.fillOval(50,110,120,60);

                // "touch up" Mouth into a smile
                g.setColor(Color.YELLOW);
                g.fillRect(50,110,120,30);
                g.fillOval(50,120,120,40);
        }
}

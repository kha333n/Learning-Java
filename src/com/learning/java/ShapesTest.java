package com.learning.java;

import javax.swing.*;

public class ShapesTest
{
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\nEnter 2 to draw ovals:");

        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(400,400);
        application.setVisible(true);
    }
}

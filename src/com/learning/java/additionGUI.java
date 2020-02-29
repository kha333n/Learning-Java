package com.learning.java;
import javax.swing.JOptionPane;

public class additionGUI
{
    public static void main(String[] args)
    {
        int number1, number2, sum;
        String input;
        input = JOptionPane.showInputDialog("Enter First Number:");
        number1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter second number;");
        number2 = Integer.parseInt(input);
        sum = number1 + number2;
        JOptionPane.showMessageDialog(null,sum);
    }
}

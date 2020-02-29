package com.learning.java;
import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String [] args)
    {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.next();

        switch (s)
        {
            case "a":
            case "A":
                System.out.println("Vowel A");
                break;
            case "e":
            case "E":
                System.out.println("Vowel E");
                break;
            case "i":
            case "I":
                System.out.println("Vowel I");
                break;
            case "o":
            case "O":
                System.out.println("Vowel O");
                break;
            case "u":
            case "U":
                System.out.println("Vowel U");
                break;
            default:
                System.out.println("Not a Vowel");
        }
    }
}

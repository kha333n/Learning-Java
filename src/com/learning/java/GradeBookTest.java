package com.learning.java;

import java.util.Scanner;

public class GradeBookTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        GradeBook myGradeBook = new GradeBook();
        myGradeBook.DisplayMessage();
        System.out.print("Please enter course name: ");
        String course = input.nextLine();
        System.out.println();
        myGradeBook.displayMessageP(course);
    }
}

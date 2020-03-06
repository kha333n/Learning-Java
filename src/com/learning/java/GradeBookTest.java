package com.learning.java;

import java.util.Scanner;

public class GradeBookTest
{
    public static void main(String[] args)
    {
        // array of student grades
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook newGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        newGradeBook.processGrades();
    }
}


package com.learning.java;

import java.util.Scanner;

public class GradeBook
{
    private String course;
    public GradeBook(String c)
    {
        course = c;
    }
    public void setCourse(String c) {
        course = c;
    }
    public String getCourse() {
        return course;
    }
    public void DisplayMessage() {
        System.out.printf("Welcome to the grade book for \n %s! \n",course);
    }
    public void determineClassAverage()
    {
        Scanner input = new Scanner(System.in);
        int total = 0, gradeCounter = 0, grade;
        double average;

        System.out.print("Enter Grade or -1 to quit: ");
        grade = input.nextInt();
        while (grade != -1)
        {
            total = total + grade;
            gradeCounter++;
            System.out.print("Enter Grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;
            System.out.printf("\nTotal of all 10 grades is %d \n", total);
            System.out.printf("Class average is %.2f\n", average);
        }
        else
        {
            System.out.print("No grades wer entered!\n");
        }
    }

}


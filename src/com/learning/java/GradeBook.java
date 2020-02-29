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
        int total = 0, gradeCounter = 1, grade, average;
        while (gradeCounter <= 10)
        {
            System.out.print("Enter Grade: ");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter++;
        }
        average = total / 10;
        System.out.printf("\nTotal of all 10 grades is %d \n",total);
        System.out.printf("Class average is %d\n",average);
    }

}


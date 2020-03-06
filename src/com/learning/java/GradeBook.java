package com.learning.java;

import java.util.Scanner;

public class GradeBook
{
    private String course;
    private int grades[];


    public GradeBook(String c,int[] gradeArray)

    {
        grades = gradeArray;
        course = c;
    }
    public void processGrades()
    {
        //// output grades array
        outputGrades();

        // call method getAverage to calculate the average grade
        System.out.printf("\nClass average is %.2f\n",getAverage());
        // call methods getMinimum and getMaximum

        System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n",getMinimum(),getMaximum());

        // call outputBarChart to print grade distribution chart
        outputBarChart();
    }

    public int getMinimum()
    {
        int lowGrade = grades[0];   // assume grades[ 0 ] is smallest

        // loop through grades array
        for ( int grade : grades )
        {
            // if grade lower than lowGrade, assign it to lowGrade
            if ( grade < lowGrade )
                lowGrade = grade; // new lowest grade
        } // end for
        return lowGrade; // return lowest grade
    }
    public int getMaximum()
    {
        int highGrade = grades[ 0 ]; // assume grades[ 0 ] is largest

        for ( int grade : grades )
        {
            // if grade greater than highGrade, assign it to highGrade
            if ( grade > highGrade )
            highGrade = grade; // new highest grade
        }
        return highGrade;
    }
    public double getAverage()
    {
        int total = 0;

        // sum grades for one student
        for ( int grade : grades )
            total += grade;

        // return average of grades
        return (double) total / grades.length;
    }

    // output bar chart displaying grade distribution
    public void outputBarChart()
    {
        System.out.println( "Grade distribution:" );

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[ 11 ];

        // for each grade, increment the appropriate frequency
        for ( int grade : grades )
            ++frequency[ grade / 10 ];

        // for each grade frequency, print bar in chart
        for ( int count = 0; count < frequency.length; count++ )
        {
            // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
            if ( count == 10 )
            System.out.printf( "%5d: ", 100 );
            else
            System.out.printf( "%02d-%02d: ", count * 10, count * 10 + 9 );

            // print bar of asterisks
            for ( int stars = 0; stars < frequency[ count ]; stars++ )
                    System.out.print( "*" );

            System.out.println(); // start a new line of output
        }
    }

    // output the contents of the grades array
public void outputGrades()
    {
        System.out.println( "The grades are:\n" );

        // output each student's grade
        for ( int student = 0; student < grades.length; student++ )
            System.out.printf( "Student %2d: %3d\n",
                    student + 1, grades[ student ] );
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


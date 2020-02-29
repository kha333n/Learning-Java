package com.learning.java;
import java.util.Scanner;

public class Analysis
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passed = 0, failure = 0, studentsCounter = 1, result;

        while (studentsCounter <= 10){
            System.out.print("Enter result ( 1 = Pass, 2 = Fail): ");
            result = input.nextInt();

            if (result == 1)
            {
                passed++;
            }
            else failure++;
            studentsCounter++;
        }

        System.out.printf("Passed %d\nFailed %d\n",passed,failure);

        if (passed > 8) {
            System.out.println("Bonus to Instructor!");
        }
    }

}

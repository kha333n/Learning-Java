package com.learning.java;

public class MethodOverloading
{
    public static void main(String[] args){
        System.out.printf("Square of Integer 7 is: %d\n",square(7));
        System.out.printf("Square of Integer 7.5 is: %d\n",square(7.5));
    }

    public static int square(int x){
        System.out.printf( "\nCalled square with int argument: %d\n",
                x );
        return x*x;
    }

    public static double square(double x){
        System.out.printf( "\nCalled square with double argument: %f\n",
                x );
        return x*x;
    }
}

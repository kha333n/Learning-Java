package com.learning.java;

public class InitArray
{
    public static void main(String[] args){
        //int [] array = new int[10];
        //Declare array

        //Initializer List
        int[] array = {10,20,30,40,50,60,70,80,90,100};

        System.out.printf("%s%8s\n","Index","Value");
        //Column heading

        //Output each array item
        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d\n",counter,array[counter]);
        }
    }
}

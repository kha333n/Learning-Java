package com.learning.java;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ArrayManipulation
{
    public static void main(String [] args){
        double[] doublearray= { 8.4,3.2,4.3,7.2,8,9.1,0.3,9,4,3.2};
        //sort doublearray into ascending order
        Arrays.sort(doublearray);
        System.out.printf( "\ndoubleArray: " );

        for ( double value : doublearray )
            System.out.printf( "%.1f ", value );

        // fill 10-element array with 7s
        int[] filledIntArray = new int[ 10 ];
        Arrays.fill( filledIntArray, 7 );
        displayArray( filledIntArray, "filledIntArray" );


        // copy array intArray into array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[ intArray.length ];
        System.arraycopy( intArray, 0, intArrayCopy, 0, intArray.length );
        displayArray( intArray, "intArray" );
        displayArray( intArrayCopy, "intArrayCopy" );

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals( intArray, intArrayCopy );
        System.out.printf( "\n\nintArray %s intArrayCopy\n",
                 (b? "==" : "!=" ) );

        // compare intArray and filledIntArray for equality
        b = Arrays.equals( intArray, filledIntArray );
        System.out.printf( "intArray %s filledIntArray\n",
                (b? "==" : "!=" ) );

        // search intArray for the value 5
        int location = Arrays.binarySearch( intArray, 5 );

        if ( location >= 0 )
            System.out.printf("Found 5 at element %d in intArray\n", location );
        else
            System.out.println( "5 not found in intArray" );

        // search intArray for the value 8763
        location = Arrays.binarySearch( intArray, 8763 );

        if ( location >= 0 )
            System.out.printf("Found 8763 at element %d in intArray\n", location );
        else
            System.out.println( "8763 not found in intArray" );

    }

    // output values in each array
    public static void displayArray(@NotNull int[] array, String description ) {
        System.out.printf("\n%s: ", description);
        for (int value : array)
            System.out.printf("%d ", value);
    }
}

package com.learning.java;

public class DeckofCardsTest
{
    public static void main(String [] args){
        DeckofCards mydeck = new DeckofCards();
        mydeck.shuffle();

        // print all 52 Cards in the order in which they are dealt
        for (int i = 1; i <= 52; i++){
            // deal and display a Card
            System.out.printf( "%-19s", mydeck.dealCard() );

            if (i% 4 == 0 ) // output a newline after every fourth card
            {
                System.out.println();
            }
        }
    }
}

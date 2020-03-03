package com.learning.java;
import java.util.Random;

public class DeckofCards
{
    private Card[] deck;  //array of card objects
    private int currentCard; //array index of next card to be dealt  (0-51)
    private static final int NUMBER_OF_CARDS = 52;   //constant   total cards.

    //random number generator
    private static final Random randomNumbers= new Random();

    //Constructor fills deck of cards
    public DeckofCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];  //create array of card object;

        currentCard = 0; //set currentCard so first card dealt is deck[0]

        //populate deck with card objects
        for (int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count % 4]);
        }
    }

    //shuffle deck of cards with one-pass algorithm
    public void shuffle(){
        // after shuffling, dealing should start at deck[ 0 ] again
        currentCard = 0; // reinitialize currentCard
        // for each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++){
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt( NUMBER_OF_CARDS );

            // swap current Card with randomly selected Card
            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        }
    }

    //deal one card
    public Card dealCard(){
        //determine whether card remain to be dealt
        if (currentCard < deck.length){
            return deck[currentCard++];
        }
        else return null;
    }

}


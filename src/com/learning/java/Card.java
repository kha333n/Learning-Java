package com.learning.java;

public class Card
{
    private String face, suit;
    //Face and suit of card

    //constructor
    public Card(String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    }

    //return string representation of card
    public String toString(){
        return face + " of " + suit;
    }
}


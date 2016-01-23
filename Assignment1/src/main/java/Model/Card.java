package Model;

/**
 * Created by Cameron on 1/19/2016 
 */

public class Card {

    public static String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String names[] = {"_", "_", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    private int suit;
    private int value;

    Card(){}

    Card(int s,int v){
        suit = s;
        value = v;
    }

    public int getValue(){ return value; }

    public String getSuit(){
        return suits[suit];
    }

    public String getName(){
        return names[value];
    }

}

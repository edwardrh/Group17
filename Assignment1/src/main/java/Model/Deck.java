package Model;

import java.util.ArrayList;

/**
 * Created by Cameron on 1/19/2016.
 */
public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public Deck(int num){
        cards = new ArrayList<>();
        int s,v;
        for(v=2;v<15;v++){
            for(s=0;s<4;s++){
                cards.add(new Card(s,v));
                num--;
                if(num==0){ break; }
            }
            if(num==0){ break; }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card new_card) {
        cards.add(new_card);
    }

    public Card Deal() {
        if(cards.isEmpty())
            return new Card(0,0);
        Card delt = cards.get(0);
        cards.remove(delt);
        return delt;
    }

    public void removeCard(Card r){
        cards.remove(r);

    }

    public Card getTopCard(){ return cards.get(cards.size() - 1); }
}

package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    private List<Card> cards;


    public Deck() {
        this.cards = new ArrayList<>();
    }


    public void makeCard() {
        List<String> shapeList = List.of("♠", "♥", "♣", "◆");
        List<Card> cardDeck = new ArrayList<>();

        for (int i = 1; i < 14; i++) {  // for loop 전체 순회
            for(String shape : shapeList) {
                cardDeck.add(new Card(shape, i));
            }
        }
        Collections.shuffle(cardDeck);
        cards = cardDeck;
    }


    public Card giveCard() {
        cards.remove(0);
        return cards.get(0);
    }

}

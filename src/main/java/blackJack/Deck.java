package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

    public List makeCard() {
        List<String> shapeList = List.of("♠", "♥", "♣", "◆");
        List<Card> cardDeck = new ArrayList<>();

        for (int i = 1; i < 14; i++) {  // for loop 전체 순회
            for(String shape : shapeList) {
                cardDeck.add(new Card(shape, i));
            }
        }
        Collections.shuffle(cardDeck);
        return cardDeck;
    }
}

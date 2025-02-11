package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        hand.add(card);
        score += card.getNum();
    }

    public void printCardsScore() {
        System.out.print(name + " :");
        for (Card card: hand) {
            System.out.print(card.getShape() + card.getNum());
        }
        System.out.println(" score:" + score);
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

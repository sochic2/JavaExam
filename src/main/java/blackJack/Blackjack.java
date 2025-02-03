package blackJack;

import java.util.List;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player user = new Player("user");
        Player dealer = new Player("dealer");
        List<Card> cardDeck= deck.makeCard();
        int idx = 0;

        for (int i=0; i < 2; i++) {
            user.addCard(cardDeck.get(idx));
            idx += 1;
            dealer.addCard(cardDeck.get(idx));
            idx += 1;
        }

        for (Card card: user.getHand()) {
            System.out.print(card.getShape() + card.getNum());
        }

        System.out.println(" score:" + user.getScore());


        while (true) {
            if (user.getScore() >21) break;

            Scanner sc = new Scanner(System.in);
            System.out.println("Y/N");
            String str = sc.nextLine();
            if (str.equals("N")) {
                break;
            }
            else {
                user.addCard(cardDeck.get(idx));
                idx += 1;
            }
        }

        int userScore = user.getScore();
        int dealerScore = dealer.getScore();


        System.out.println("User");
        for (Card card: user.getHand()) {
            System.out.print(card.getShape() + card.getNum());
        }

        System.out.println(" score:" + user.getScore());


        System.out.println("Dealer");
        for (Card card: dealer.getHand()) {
            System.out.print(card.getShape() + card.getNum());
        }

        System.out.println(" score:" + dealer.getScore());

        if (userScore > 21) {
            if (dealerScore > 21) {
                System.out.println("draw");
            }
            else {
                System.out.println("dealer win");
            }
            return;
        }

        if (dealerScore > 21) {
            System.out.println("user win");
            return;
        }

        if (dealerScore > userScore) {
            System.out.println("dealer win");
        }
        else {
            System.out.println("user win");
        }

    }

}

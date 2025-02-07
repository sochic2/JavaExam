package blackJack;

import java.util.List;
import java.util.Scanner;

public class Blackjack {
//    private List<Card> deck = new Deck().getCards();
//    public Player user = new Player("user");
//    private Player dealer = new Player("dealer");
    private Scanner sc = new Scanner(System.in);

    private Deck deck;
    private Player user;
    private Player dealer;
    private List<Card> cards;

//    public Blackjack(Deck deck, Player user, Player dealer, List<Card> cards) {
//        this.deck = deck;
//        this.user = user;
//        this.dealer = dealer;
//        this.cards = deck.getCards();
//    }


    public Blackjack(Deck deck, Player user, Player dealer) {
        this.deck = deck;
        this.user = user;
        this.dealer = dealer;
        this.cards = deck.getCards();
    }

    public void printResult(String winner) {
        if (winner.equals("user")) {
            System.out.println("User win!!!");

        } else if (winner.equals("dealer")) {
            System.out.println("dealer win!!!");

        } else {
            System.out.println("draw!!!");
        }
    }


    public void checkWinner() {
        System.out.println("----------result------------");
        user.printCardsScore();
        dealer.printCardsScore();
        int userScore = user.getScore();
        int dealerScore = dealer.getScore();

        if (userScore > 21) {
            if (dealerScore > 21) {
                printResult("draw");
            }
            else {
                printResult("dealer");
            }
            return;
        }

        if (dealerScore > 21) {
            printResult("user");
            return;
        }

        if (dealerScore > userScore) {
            printResult("dealer");
        } else if (dealerScore == userScore) {
            printResult("draw");
        } else {
            printResult("user");
        }
    }


    public void play() {
        int idx = 0;
        System.out.println(cards);
        for (int i=0; i < 2; i++) {
            user.addCard(cards.get(idx));
            idx += 1;
            dealer.addCard(cards.get(idx));
            idx += 1;
        }

        user.printCardsScore();

        while (true) {
            if (user.getScore() > 21) {
                checkWinner();
                return;
            }
            System.out.println("카드 더 받기 Y/N");
            String inputStr = sc.nextLine();
            if (inputStr.equals("N")) {
                checkWinner();
                return;
            } else if (inputStr.equals("Y")) {
                user.addCard(cards.get(idx));
                idx += 1;
                user.printCardsScore();
            } else {
                System.out.println("Y/N만 입력하세요");
            }
        }
    }

//    public static void main(String[] args) {
//        Blackjack game = new Blackjack();
//        game.play();
//    }

}

package jw222tf_assign3;

/**
 * Created by Jorian on 8-12-2016 at 22:46.
 */
public class PlayingCardsMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.alternativeDisplaySetOfCards();

        deck.shuffleSetOfCards();
        deck.displaySetOfCards();

        System.out.println();

        System.out.println();
        deck.dealACard(true);
        deck.dealACard(true);
        deck.dealACard(true);

        System.out.println("\nCards left in deck: "+ deck.cardsInDeck());

        //System.out.println("\nDealt cards are returned to deck.");
        deck.shuffleSetOfCards();
        System.out.println("Cards left in deck: "+ deck.cardsInDeck());
    }
}
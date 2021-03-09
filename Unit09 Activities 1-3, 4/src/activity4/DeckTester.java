package activity4;

import activity2.Deck;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		
		System.out.println("**** Original Deck Methods ****");
		System.out.println("toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deck Methods After a Card Dealt ****");
		System.out.println("toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
          System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();
 
        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();
   
        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();
        
        System.out.println("**** 52 Card Deck Shuffle Tests ****");
        String[] ranks52 = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
        String[] suits52 = {"spades", "hearts", "diamonds", "clubs"};
        int[] pointValues52 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck d52 = new Deck(ranks52, suits52, pointValues52);
        System.out.println("After Creation:\n\n" + d52.toString());
        
        Card c = d52.deal();
        System.out.println("After Dealing the " + c + ":\n\n" + d52.toString());
	}
}

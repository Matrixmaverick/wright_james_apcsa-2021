package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card aceClubs1 = new Card("ace", "clubs", 1);
		Card aceClubs2 = new Card("ace", "clubs", 1);
		Card sixHearts = new Card("6", "hearts", 6);
		
		System.out.println("**** Ace of Clubs #1 Tests ****");
		System.out.println("  rank:  " + aceClubs1.rank());
		System.out.println("  suit:  " + aceClubs1.suit());
		System.out.println("  pointValue:  " + aceClubs1.pointValue());
		System.out.println("  toString:  " + aceClubs1.toString());
		System.out.println();
		
		System.out.println("**** Ace of Clubs #2 Tests ****");
		System.out.println("  rank:  " + aceClubs2.rank());
		System.out.println("  suit:  " + aceClubs2.suit());
		System.out.println("  pointValue:  " + aceClubs2.pointValue());
		System.out.println("  toString:  " + aceClubs2.toString());
		System.out.println();
		
		System.out.println("**** Six of Hearts Tests ****");
		System.out.println("  rank:  " + sixHearts.rank());
		System.out.println("  suit:  " + sixHearts.suit());
		System.out.println("  pointValue:  " + sixHearts.pointValue());
		System.out.println("  toString:  " + sixHearts.toString());
		System.out.println();
	}
}

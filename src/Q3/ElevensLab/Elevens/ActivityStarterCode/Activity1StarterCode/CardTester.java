package Q3.ElevensLab.Elevens.ActivityStarterCode.Activity1StarterCode;

import java.util.Scanner;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("jack", "diamond", 11);
		Card card2 = new Card("king", "hearts", 13);
		Card card3 = new Card("queen", "diamond", 12);

		System.out.println(card2.matches(card1));
		System.out.println(card1.suit() + " " + card2.rank() + " " + card3.pointValue());
	}
}

package Q3.ElevensLab.Elevens.ActivityStarterCode.Activity2StarterCode;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks ={"jack", "king", "queen"};
		String[] suits = {"diamond", "hearts", "diamond"};
		int[] values = {11, 13, 12};
		Deck deck = new Deck(ranks, suits, values);
		System.out.println(Deck.deal());
	}
}

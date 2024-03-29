package Q3.ElevensLab.Elevens.ActivityStarterCode.Activity3StarterCode;

import java.util.ArrayList;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		//two different lists. first half and second half are two different lists.
		for (int i = 0; i < values.length/2 ; i ++) {
			temp1.add(values[i]);
		}
		for (int i = values.length/2; i < values.length;  i++){
			temp2.add(values[i]);
		}

		for (int i = temp1.size(); i --> 0; ) {
			temp2.add(i, values[i]);
		}
		for (int value : values) {
			values[value] = temp2.get(value);
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		int temp = 0;
		int temp2 = 0;
		for (int k = values.length; k --> 0;) {
			temp = values[k];
			temp2 = (int) (Math.random() * ((double) values.length - 0.0) + 0);
			values[k] = values[temp2];
			values[temp2] = temp;

		}
	}
}

package watermelons;

import java.util.Arrays;

public class Watermelons {

	/**
	 * Computes the sum of each distinct pair of entries in the incoming array.
	 * A given pair of entries has its sum computed only once.  So if you
	 * compute the sum for entries 2 and 4, and that sum appears in your answer
	 * array, then you do not also compute the sum of entries 4 and 2.
	 * Depending on the input, the same sum value may appear multiple times in the result.
	 * For example, if all of the incoming values are 0, then so are all of the returned values.
	 * @param nums an array of integers, possibly containing duplicates
	 * @return an array containing the sums of pairs as described above
	 */
	public static int[] allPairSums(int[] nums) {
		int ansLength = 0;
		int ansIncrease = 1;
		for (int i = 0; i < nums.length-1; ++i) {
			ansLength = ansLength + ansIncrease;
			ansIncrease += 1;
		}
		int[] ans = new int[ansLength];
		int i = 0;
		for (int j = 0; j < nums.length; ++j) {
			for (int k = j+1; k < nums.length; ++k) {
				ans[i] = nums[j] + nums[k];
				i += 1;
			}
		}

		return ans;
	}

	/**
	 * The method below must COMPUTE and return a solution as described
	 * on the web page for this extension.  
	 * 
	 * You must compute the solution by trying
	 * lots of possibilities, and finding the one that yields the right answer.
	 * 
	 * You can run the provided unit test to see if you are right.
	 * @param pairSums is array of watermelon pairwise sums.  In other words,
	 *    each element of pairSums represents the sum of one pair of watermelons in our puzzle.
	 * @return
	 */
	public static int[] getSolution(int[] pairSums) {
		int[] ans = new int[5];
		Arrays.sort(pairSums);
		ans[1] = pairSums[0];
		ans[4] = pairSums[9];
		while (!sameIntArrays(pairSums, allPairSums(ans))) {

			ans[0] += 1;
			ans[1] -= 1;
			if (ans[0] == pairSums[0]) {
				ans[0] = 0;
				ans[1] = pairSums[0];
			}

			ans[3] += 1;
			ans[4] -= 1;
			if (ans[3] == pairSums[9]) {
				ans[3] = 0;
				ans[4] = pairSums[9];
			}

			ans[2] += 1;
			if (ans[2] == pairSums[1]) {
				ans[2] = 0;
			}
		}
		return ans;
	}

	/**
	 * Compare two arrays for equality.  They must first be
	 * sorted, so that Arrays.equals can do its thing element
	 * by element, as is it wants.
	 * 
	 * However, what if the caller doesn't want the arrays to
	 * be disturbed?  We therefore clone the arrays (copies are
	 * made of them) before we do the compare, and we compare the
	 * clones.
	 * @param one: an array, not mutated
	 * @param two: another array, not mutated
	 * @return true iff the arrays' contents are the same
	 */
	public static boolean sameIntArrays(int[] one, int[] two) {
		int[] cone = (int[]) one.clone();
		int[] ctwo = (int[]) two.clone();
		Arrays.sort(cone);
		Arrays.sort(ctwo);
		return Arrays.equals(cone, ctwo);
	}

	public static void main(String[] args) {
		int[] melons = {10,20,30,40,40};
		int[] sums = allPairSums(melons);
		Arrays.sort(sums);
		for (int i = 0; i < sums.length; ++i) {
			System.out.print(sums[i] + " ");
		}
		System.out.println();
	}
}

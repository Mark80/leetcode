package code;

public class LongestSubSequence {

	public static void main(String[] args) {
		System.out.println(longest(new int[] { 1, 2, 3, 4, 5, 1 }));
		System.out.println(longest(new int[] { 1, 2, 7, 4, 5, 1 }));
		System.out.println(longest(new int[] { 1, 2, 3, 4, 5, 6 }));
		System.out.println(longest(new int[] { 1, -10, 3, 4, 5, 6 }));
		System.out.println(longest(new int[] { 9, 8, 7, 6, 5 }));
		//System.out.println(longest(new int[]{1,2,3,4,5,1}));
	}

	static int longest(int[] arr) {
		var max = 1;
		var currentMax = 1;

		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] < arr[i + 1]) {
				currentMax += 1;
				if (currentMax > max) {
					max = currentMax;
				}
			} else {
				currentMax = 0;
			}
			i++;
		}

		return max;
	}

}

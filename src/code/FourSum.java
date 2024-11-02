package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

	public static void main(String[] args) {
		FourSum fourSum = new FourSum();
		int[] candidates = new int[] { 1, 2, 3 };
		System.out.println(fourSum.fourSum(candidates, 4));

		candidates = new int[] { -2, -1, 0, 0, 1, 2 };
		System.out.println(fourSum.fourSum(candidates, 0));

		candidates = new int[] { 1, 0, -1, 0, -2, 2 };
		System.out.println(fourSum.fourSum(candidates, 0));

		candidates = new int[] { 2, 2, 2, 2, 2 };
		System.out.println(fourSum.fourSum(candidates, 8));

		candidates = new int[] { 0, 0, 0, 0, 0 };
		System.out.println(fourSum.fourSum(candidates, 0));

		candidates = new int[] { 1, -2, -5, -4, -3, 3, 3, 5 };
		System.out.println(fourSum.fourSum(candidates, -11));

		candidates = new int[] { -497, -494, -484, -477, -453, -453, -444, -442, -428, -420, -401, -393, -392, -381, -357, -357, -327, -323, -306, -285, -284,
				-263, -262, -254, -243, -234, -208, -170, -166, -162, -158, -136, -133, -130, -119, -114, -101, -100, -86, -66, -65, -6, 1, 3, 4, 11, 69, 77,
				78, 107, 108, 108, 121, 123, 136, 137, 151, 153, 155, 166, 170, 175, 179, 211, 230, 251, 255, 266, 288, 306, 308, 310, 314, 321, 322, 331, 333,
				334, 347, 349, 356, 357, 360, 361, 361, 367, 375, 378, 387, 387, 408, 414, 421, 435, 439, 440, 441, 470, 492 };
		System.out.println(fourSum.fourSum(candidates, 1682));

		candidates = new int[] { 1000000000, 1000000000, 1000000000, 1000000000 };
		System.out.println(fourSum.fourSum(candidates, -294967296));

		candidates = new int[] { -1000000000,-1000000000,1000000000,-1000000000,-1000000000 };
		System.out.println(fourSum.fourSum(candidates, 294967296));

	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				for (int k = j + 1; k < nums.length - 1; k++) {
					for (int l = k + 1; l < nums.length; l++) {
						if ((long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l] > (long)target ||
								(long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l] < (long)Integer.MIN_VALUE) {
							break;
						}

						if (result.contains(List.of(nums[i], nums[j], nums[k], nums[l]))) {
							break;
						}

						if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
							result.add(List.of(nums[i], nums[j], nums[k], nums[l]));
						}
					}

				}
			}
		}
		return new ArrayList<>(result);
	}

}


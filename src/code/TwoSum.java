package code;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		var input = new int[] { 2, 7, 11, 15 };
		ArrayPrinter.print(twoSum(input, 9));

		input = new int[] { 3, 2, 4 };
		ArrayPrinter.print(twoSum(input, 6));

		input = new int[] { 3, 3 };
		ArrayPrinter.print(twoSum(input, 6));

		input = new int[] { 3, 3, 3, 7, 3, 9, 7 };
		ArrayPrinter.print(twoSum(input, 16));
	}

	public static int[] twoSum(int[] nums, int target) {
		var map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			var index = map.get(target - nums[i]);
			if (index != null && index != i)
				return new int[] { i, index };
		}

		return new int[] {};
	}

}

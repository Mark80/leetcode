package code;

import java.util.HashSet;

public class MissingPositive {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 4, -1, 1 };
		System.out.println(firstMissingPositive(nums));

		nums = new int[] { 4, -1, 1 };
		System.out.println(firstMissingPositive(nums));

		nums = new int[] { 7, 8, 9, 11, 12 };
		System.out.println(firstMissingPositive(nums));

		nums = new int[] { 7, 8, 9, 11, 2, 12, 1 };
		System.out.println(firstMissingPositive(nums));

		nums = new int[] { 1, 2, 0 };
		System.out.println(firstMissingPositive(nums));

		nums = new int[] { -5 };
		System.out.println(firstMissingPositive(nums));

		nums = new int[] { -1, -2, -60, 40, 43 };
		System.out.println(firstMissingPositive(nums));

		int[] nums2 = new int[] { 1, 1000 };
		System.out.println(firstMissingPositive(nums2));

		nums2 = new int[] { 0, 3 };
		System.out.println(firstMissingPositive(nums2));

		int[] nums3 = new int[] { 1, 2, 3, 10, 2147483647, 9 };
		System.out.println(firstMissingPositive(nums3));

	}

	public static int firstMissingPositive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		var absMin = nums[0];
		var absMax = nums[0];
		for (int num : nums) {
			if (num > 0 && absMin < 0) {
				absMin = num;
			}
			if (num > 0 && absMax < 0) {
				absMax = num;
			}
			if (num > 0) {
				set.add(num);
				if (num < absMin)
					absMin = num;
				if (num > absMax)
					absMax = num;
			}
		}

		if (absMax <= 0)
			return 1;

		if (set.size() == absMax)
			return absMax + 1;

		if (absMin > 1 || set.size() == 0)
			return 1;

		var min = absMax;

		for (int num : nums) {
			if (num >= 0) {
				boolean contains = true;
				boolean contains2 = true;
				if (num > 1)
					contains = set.contains(num - 1);
				if (num < 2147483647)
					contains2 = set.contains(num + 1);
				if (!contains && num - 1 < min) {
					min = num - 1;
				} else if (!contains2 && num + 1 < min) {
					min = num + 1;
				}
			}
		}

		if (min <= 0)
			return 1;

		return min;

	}
}

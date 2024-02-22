package code;

public class SubArray {

	public static void main(String[] args) {
		var nums = new int[] { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { 5, -1, -10, 8 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -1, 10, 8 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { 1 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -2, 9, 1, -1, 300, -4 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -2, 9, 1, -1, 300, -4, 5 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -1 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -1, -2 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -2, -1 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -1, -2, -3 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -1, -2, -3, 4 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -2, 1, 0, -3 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { 1, -1, 0 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(maxSubArray(nums));

		nums = new int[] { -2, -1, 3, 4, 5, 6 };
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (sum >= 0) {
				sum += nums[i];
			} else {
				sum = nums[i];
			}
			ans = Math.max(sum, ans);
		}

		return ans;

	}

}

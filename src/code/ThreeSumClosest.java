package code;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		ThreeSumClosest threeSumClosest = new ThreeSumClosest();

		System.out.println(threeSumClosest.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
		System.out.println(threeSumClosest.threeSumClosest(new int[] { 0, 0, 0 }, 1));
		System.out.println(threeSumClosest.threeSumClosest(new int[] { 1, 2, 4, 4, 5, 6, 7 }, 6));
		System.out.println(threeSumClosest.threeSumClosest(new int[] { 1, 2, 4, 4, 5, 6, 7 }, 9));
		System.out.println(threeSumClosest.threeSumClosest(new int[] { 4, 0, 5, -5, 3, 3, 0, -4, -5 }, -2));
		System.out.println(threeSumClosest.threeSumCloses2(new int[] { 4, 0, 5, -5, 3, 3, 0, -4, -5 }, -2));
		System.out.println(threeSumClosest.threeSumClosest(new int[] { 0, 3, 97, 102, 200 }, 300));

	}

	public int threeSumCloses2(int[] nums, int target) {
		Arrays.sort(nums);
		int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum with the sum of the first three elements

		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];

				if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
					closestSum = sum; // Update closest sum if the current sum is closer to the target
				}

				if (sum < target) {
					j++; // Increment j to increase the sum
				} else {
					k--; // Decrement k to decrease the sum
				}
			}
		}

		return closestSum;
	}

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);

		int closestSum = nums[0] + nums[1] + nums[2];

		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];

				if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
					closestSum = sum; // Update closest sum if the current sum is closer to the target
				}

				if (sum < target) {
					j++; // Increment j to increase the sum
				} else {
					k--; // Decrement k to decrease the sum
				}

				if (sum < target)
					j++;
				else
					k--;
			}

		}

		return closestSum;
	}

}

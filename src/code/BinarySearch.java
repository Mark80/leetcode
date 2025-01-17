package code;

public class BinarySearch {
	public int binarySearch(int[] nums, int target) {
		if (nums.length == 0)
			return -1;
		int min = 0;
		int max = nums.length - 1;
		int middle;

		while (min <= max) {
			middle = (min + max) / 2;
			int value = nums[middle];
			if (value == target) {
				return middle;
			}
			if (value < target) {
				min = middle + 1;

			} else {
				max = middle - 1;
			}
		}

		return -1;
	}
}

package code;

public class FindFirstAndLast {

	public static void main(String[] args) {
		FindFirstAndLast findFirstAndLast = new FindFirstAndLast();

		int[] nums = { 1, 2, 3 };

		ArrayPrinter.print(findFirstAndLast.searchRange(nums, 2));

		nums = new int[] { 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9 };
		ArrayPrinter.print(findFirstAndLast.searchRange(nums, 4));

		//		ArrayPrinter.print(nums);
		//		System.out.println(findFirstAndLast.binarySearch(nums, 3));
		//
		//		nums = new int[] { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
		//		ArrayPrinter.print(nums);
		//		System.out.println(findFirstAndLast.binarySearch(nums, 8));
		//
		//		nums = new int[] { 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
		//		ArrayPrinter.print(nums);
		//		System.out.println(findFirstAndLast.binarySearch(nums, 5));
		//
		//		nums = new int[] { 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
		//		ArrayPrinter.print(nums);
		//		System.out.println(findFirstAndLast.binarySearch(nums, 9));
		//
		nums = new int[] { 1 };
		ArrayPrinter.print(nums);
		System.out.println(findFirstAndLast.binarySearch(nums, 1));
		ArrayPrinter.print(findFirstAndLast.searchRange(nums, 1));

		//
		//		nums = new int[] { 1, 2, 2, 32, 45, 64, 75 };
		//		ArrayPrinter.print(nums);
		//		System.out.println(findFirstAndLast.binarySearch(nums, 3));
		//		System.out.println(findFirstAndLast.binarySearch(nums, 2));
		//		System.out.println(findFirstAndLast.binarySearch(nums, 64));
		//		System.out.println(findFirstAndLast.binarySearch(nums, 75));
		//		System.out.println(findFirstAndLast.binarySearch(nums, 32));
		//
		//		nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		//		ArrayPrinter.print(nums);
		//		System.out.println(findFirstAndLast.binarySearch(nums, 4));
		//		System.out.println(findFirstAndLast.binarySearch(nums, 8));
		//		System.out.println(findFirstAndLast.binarySearch(nums, 1));
		//		System.out.println(findFirstAndLast.binarySearch(nums, 2));

	}

	public int[] searchRange(int[] nums, int target) {
		int i = binarySearch(nums, target);
		if (i == -1)
			return new int[] { -1, -1 };

		int min = i;
		int max = i;

		while ( min >= 0 && nums[min] == target) {
			if (nums[min] == target)
				min--;
		}

		while ( max <= nums.length - 1 &&  nums[max] == target) {
			if (nums[max] == target)
				max++;
		}

		return new int[] { min + 1, max - 1 };
	}

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

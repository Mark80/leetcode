package code;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		NextPermutation nextPermutation = new NextPermutation();
		int[] nums = { 1, 2, 3 }; // 1,3,2
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 1, 3, 2 };  //2,1,3
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 3, 2, 1 }; //1,2,3
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 1, 1, 5 }; // 1,5,1
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);



		nums = new int[] { 4, 2, 0, 2, 3, 2, 0 }; // [4,2,0,3,0,2,2]
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 0, 2, 4, 1 }; //[0,4,1,2]

		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 2, 3, 0, 2, 4, 1 }; // [2,3,0,4,1,2]
		// [3,0,1,2,2,4]
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 1, 5, 6, 5, 5 };
		//		{
		//			5, 1, 5, 5, 6
		//		}
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 1, 5, 6, 4, 5 };
		//		{
		//			4, 1, 5, 5, 6
		//		}
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

		nums = new int[] { 1, 54, 6, 5, 5 };
		nextPermutation.nextPermutation(nums);
		ArrayPrinter.print(nums);

	}


	public void nextPermutation(int[] nums) {
		if (nums.length == 1) {
			return;
		}

		int highIndex = nums.length - 2;




	}

	private static void swap(int[] nums, int lastIndex, int findIndex) {
		int tmp = nums[lastIndex];
		nums[lastIndex] = nums[findIndex];
		nums[findIndex] = tmp;
	}

}

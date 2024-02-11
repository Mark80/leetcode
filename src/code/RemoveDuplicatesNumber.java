package code;

public class RemoveDuplicatesNumber {

	public static void main(String[] args) {
		var array = new int[] { 1, 1, 2 };
		System.out.println(removeDuplicates(array));
		print(array);

		array = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(array));
		print(array);

		array = new int[] {1};
		System.out.println(removeDuplicates(array));
		print(array);
	}

	static void print(int[] array) {
		System.out.print("[ ");
		for (int j : array) {
			System.out.print(j + " ,");
		}
		System.out.print(" ]");

		System.out.println();
	}

	public static int removeDuplicates(int[] nums) {
		int[] result = new int[nums.length];

		if (nums.length == 1) {
			return 0;
		}

		int j = 1;
		var lastValue = nums[0];
		result[0] = lastValue;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != lastValue) {
				result[j] = nums[i];
				lastValue = nums[i];
				j++;
			}
		}

		System.arraycopy(result, 1, nums, 1, nums.length - 1);

		return j;

	}

}

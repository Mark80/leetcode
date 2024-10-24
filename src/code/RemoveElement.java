package code;

public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement removeElement = new RemoveElement();

		int[] nums = { 3, 2, 2, 3 };
		System.out.println(removeElement.removeElement(nums, 3));
		ArrayPrinter.print(nums);

		nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement.removeElement(nums, 2));
		ArrayPrinter.print(nums);

		nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement.removeElement(nums, 4));
		ArrayPrinter.print(nums);

		nums = new int[] {};
		System.out.println(removeElement.removeElement(nums, 4));
		ArrayPrinter.print(nums);

		nums = new int[] {3};
		System.out.println(removeElement.removeElement(nums, 4));
		ArrayPrinter.print(nums);

		nums = new int[] {4};
		System.out.println(removeElement.removeElement(nums, 4));
		ArrayPrinter.print(nums);
	}

	public int removeElement(int[] nums, int val) {
		if (val > 50)
			return nums.length;
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			if (nums[low] == val) {
				nums[low] = nums[high];
				nums[high] = -1;
				high--;
			} else {
				low++;
			}

		}

		return high + 1;
	}

}

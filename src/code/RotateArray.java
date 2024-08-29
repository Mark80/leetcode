package code;

public class RotateArray {

	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();

		var array = new int[]{1,2,3,4,5,6,7};
		rotateArray.rotate(array, 3);
		ArrayPrinter.print(array);

		array = new int[]{-1,-100,3,99};
		rotateArray.rotate(array, 2);
		ArrayPrinter.print(array);

	}


	public void rotate(int[] nums, int k) {
		int[] ints = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int index = (i + k) % nums.length;
			ints[index] = nums[i];
		}
		System.arraycopy(ints, 0, nums, 0, nums.length);
	}
}


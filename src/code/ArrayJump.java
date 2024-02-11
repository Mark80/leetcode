package code;

public class ArrayJump {

	public static void main(String[] args) {
		var nums = new int[]{2,3,1,1,4};
		System.out.println("true: " + canJump(nums, 0));

		nums = new int[]{3,2,1,0,4};
		System.out.println("false: " + canJump(nums, 0));

		 nums = new int[]{2,5,0,0};
		System.out.println("true: " + canJump(nums));

		nums = new int[]{2,5,0,0,0,0,0,0,0};
		System.out.println("false: " + canJump(nums));

		nums = new int[]{2,5,0,0,0,0,3,0,0};
		System.out.println("true: " + canJump(nums));

		nums = new int[]{7,0,0,0,0,0,0,0,0};
		System.out.println("false: " + canJump(nums));

		nums = new int[]{7,0,0,0,0,0,0,10,0};
		System.out.println("true: " + canJump(nums));

		nums = new int[]{2,0,2,0,2,0,2,0,0};
		System.out.println("true: " + canJump(nums));

		nums = new int[]{100};
		System.out.println("true: " + canJump(nums));

		nums = new int[]{0,100};
		System.out.println("false: " + canJump(nums));

		nums = new int[]{9,8,7,6,5,4,3,2,1,0,0};
		System.out.println("false: " + canJump(nums));

		nums = new int[]{0};
		System.out.println("true: " + canJump(nums));
	}

	private static boolean isReachable(int[] nums){
		if(nums.length == 1)
			return true;
		final int lastIndex = nums.length - 1;
		boolean result = false;
		for (int i = lastIndex - 1; i >=0 ; i--) {
			int value = nums[i];
			if(i + value >= lastIndex){
				return true;
			}
		}
		return result;
	}

	public static boolean canJump(int[] nums) {
		return isReachable(nums) && canJump(nums, 0);
	}


	public static boolean canJump(int[] nums, int currentIndex) {
       final int lastIndex = nums.length - 1;

	   if (currentIndex == lastIndex || nums[currentIndex] >= lastIndex - currentIndex)
		   return true;

		for (int jump = 1; jump <= nums[currentIndex]; jump++) {
			int nextIndex = currentIndex + jump;
			if(nextIndex == lastIndex) {
				return true;
			}
			if(nextIndex < lastIndex){
				boolean c = canJump(nums, nextIndex);
				if(c){
					return c;
				}
			} else {
				return true;
			}
		}

		return false;
	}



}

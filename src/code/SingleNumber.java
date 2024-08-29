package code;

import java.util.HashSet;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		HashSet<Integer> intervals = new HashSet<>();
		for (int n: nums) {
			if(intervals.contains(n))
				intervals.remove(n);
			else
				intervals.add(n);
		}
		return intervals.iterator().next();
	}

}

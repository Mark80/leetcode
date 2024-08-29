package code;

import java.util.HashSet;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> intervals = new HashSet<>();
		for (int n : nums) {
			boolean added = intervals.add(n);
			if(!added)
				return true;
		}
		return false;
	}

}

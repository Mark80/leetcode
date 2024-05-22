package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum0 {

	public static void main(String[] args) {

		System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
		System.out.println(threeSum(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		nums = Arrays.stream(nums).sorted().toArray();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		Set<List<Integer>> result = new HashSet<>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (nums[i] > nums[i - 1])) {
				for (int j = i + 1; j < nums.length - 1; j++) {
					var ps = nums[i] + nums[j];
					Integer diffIndex = map.get(-ps);
					if (diffIndex != null && i != diffIndex && j != diffIndex) {
						var sortedTriple = Stream.of(nums[i], nums[j], nums[diffIndex]).sorted().collect(Collectors.toList());
						result.add(sortedTriple);
					}
				}
			}
		}

		return new ArrayList<>(result);

	}

}

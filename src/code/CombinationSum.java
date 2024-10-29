package code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSum {

	public static void main(String[] args) {
		CombinationSum combinationSum = new CombinationSum();
		int[] candidates = new int[] { 1, 2, 3 };
		System.out.println(combinationSum.combinationSum(candidates, 3));

		candidates = new int[] { 2, 3, 7 };
		System.out.println(combinationSum.combinationSum(candidates, 7));

		candidates = new int[] { 2, 3, 5 };
		System.out.println(combinationSum.combinationSum(candidates, 8));

		candidates = new int[] { 2 };
		System.out.println(combinationSum.combinationSum(candidates, 1));

		candidates = new int[] { 2, 3, 5 };
		System.out.println(combinationSum.combinationSum(candidates, 9));

		candidates = new int[] { 8, 10, 6, 3, 4, 12, 11, 5, 9 };
		System.out.println(combinationSum.combinationSum(candidates, 28));

		candidates = new int[] { 7 };
		System.out.println(combinationSum.combinationSum(candidates, 7));

	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < candidates.length; i++) {
			result.addAll(combinationSum(candidates, target, i));
		}
		return result;
	}

	private List<List<Integer>> combinationSum(int[] candidates, int target, int index) {
		var candidate = candidates[index];
		if (target - candidate == 0) {
			List<List<Integer>> result = new ArrayList<>();
			ArrayList<Integer> list = new ArrayList<>();
			list.add(candidate);
			result.add(list);
			return result;
		} else if (target - candidate > 0) {
			List<List<Integer>> result = new ArrayList<>();
			for (int i = index; i < candidates.length; i++) {
				result.addAll(combinationSum(candidates, (target - candidate), i));
			}
			return result.stream().peek(l -> l.add(candidate)).collect(Collectors.toList());
		} else {
			return List.of();
		}

	}

}

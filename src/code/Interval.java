package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interval {

	public static void main(String[] args) {

//		var intervals = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
//		print(merge(intervals));
//
//		intervals = new int[][] { { 1, 4 }, { 4, 6 } };
//		print(merge(intervals));
//
//		intervals = new int[][] { { 1, 4 }, { 5, 6 } };
//		print(merge(intervals));
//
//		intervals = new int[][] { { 1, 4 } };
//		print(merge(intervals));
//
//		intervals = new int[][] { { 1, 4 }, { 0, 4 } };
//		print(merge(intervals));
//
//		intervals = new int[][] { { 1, 4 }, { 2, 3 } };
//		print(merge(intervals));
//
//		intervals = new int[][] { { 1, 4 }, { 0, 2 }, { 3, 5 } };
//		print(merge(intervals));

		int[][] intervals = new int[][] { {1,3},{6,9} };
		int[] newInterval = new int[]{2,5};
		print(insert(intervals, newInterval));

		intervals = new int[][] { {1,2},{3,5},{6,7},{8,10}, {12, 16} };
		newInterval = new int[]{4,8};
		print(insert(intervals, newInterval));

	}

	static void print(int[][] array) {
		for (int[] subArray : array) {
			printInterval(subArray);
		}
		System.out.println();
	}

	public static int[][] insert(int[][] intervals, int[] newInterval) {
		var total = new int[intervals.length + 1][2];
		System.arraycopy(intervals, 0, total, 0, intervals.length);
		total[intervals.length] = newInterval;

		return merge(total);
	}

	private static void printInterval(int[] subArray) {
		System.out.print("[" + subArray[0] + " , " + subArray[1] + "]");
	}

	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));


		List<int[]> list = new ArrayList<>();
		if (intervals.length == 1) {
			list.add(intervals[0]);
			return list.toArray(int[][]::new);
		}
		int j = 1;
		int lastIntervalIndex = 0;
		list.add(intervals[0]);
		while (j < intervals.length) {
			var sub1 = list.get(lastIntervalIndex);
			var sub2 = intervals[j];
			var r = merge(sub1, sub2);
			if (r != null) {
				list.remove(lastIntervalIndex);
				list.add(lastIntervalIndex, r);
			} else {
				lastIntervalIndex++;
				list.add(lastIntervalIndex, sub2);
			}
			j++;
		}

		return list.toArray(int[][]::new);
	}

	static int[] merge(int[] intervals1, int[] intervals2) {
		if (intervals2[0] <= intervals1[1])
			return new int[] { intervals1[0], Math.max(intervals2[1], intervals1[1]) };
		else
			return null;
	}

}

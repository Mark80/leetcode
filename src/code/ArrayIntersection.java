package code;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersection {

	public static void main(String[] args) {
		ArrayIntersection arrayIntersection = new ArrayIntersection();

		int[] array1= new int[]{1,2,2,1};
		int[] array2= new int[]{2,2};
		ArrayPrinter.print(arrayIntersection.intersect(array1,array2));

		array1= new int[]{4,9,5};
		array2= new int[]{9,4,9,8,4};
		ArrayPrinter.print(arrayIntersection.intersect(array1,array2));
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		var map1 = new HashMap<Integer, Integer>();
		var map2 = new HashMap<Integer, Integer>();

		for (int value : nums1) {
			if (map1.containsKey(value)) {
				Integer integer = map1.get(value);
				map1.put(value, integer + 1);
			} else
				map1.put(value, 1);
		}

		for (int value : nums2) {
			if (map2.containsKey(value)) {
				Integer integer = map2.get(value);
				map2.put(value, integer + 1);
			} else
				map2.put(value, 1);
		}

		ArrayList<Integer> list = new ArrayList<>();

		for (int value : map1.keySet()) {
			if (map2.containsKey(value)) {
				int min = Math.min(map1.get(value), map2.get(value));
				for (int i = 0; i < min; i++) {
					list.add(value);
				}
			}
		}

		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			array[i] = list.get(i);
		return array;

	}

}

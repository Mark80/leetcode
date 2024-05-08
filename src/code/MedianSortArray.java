package code;

public class MedianSortArray {

	public static void main(String[] args) {

//		System.out.println(findIndexGreater(4, new int[] { 1, 2, 3, 5, 6, 7, 8, 9 }));
//		System.out.println(findIndexGreater(4, new int[] { 1, 2, 3, 5, 6, 7, 8, 9 }));
//		System.out.println(findIndexGreater(2, new int[] { 1, 3, 5, 6, 7, 8, 9 }));
//		System.out.println(findIndexGreater(10, new int[] { 1, 3, 5, 6, 7, 8, 9 }));
//		System.out.println(findIndexGreater(10, new int[] { 1 }));
//		System.out.println(findIndexGreater(1, new int[] { 2, 3, 8, 20 }));
		//System.out.println(distanceFromMid( new int[] { 1,2,3,4,5 }, new int[] { 5,7,9 }));
		//System.out.println(distanceFromMid( new int[] { 1,2,3,4,5 }, new int[] { 5,7,9 }));

	}

	static int median(int[] array1,int[] array2){
		var totalDistance = (array1.length + array2.length -2) / 2;
		int d = distanceFromMid(array1, array2,(array1.length - 1) / 2);
		return -1;
	}

	static int distanceFromMid(int[] array1,int[] array2, int mid){
		var value = array1[mid];
		var indexSecond = findIndexGreater(value, array2);
		return  mid + array2.length + indexSecond;
	}

	static int findIndexGreater(int value, int[] array) {
		int mid = (array.length - 1) / 2;

		while (mid < (array.length - 1) && mid > 0) {
			if (array[mid] >= value && array[mid - 1] < value) {
				return mid;
			} else if (array[mid] > value) {
				mid = mid / 2;
			} else {
				mid = mid + (array.length - 1) / 2;
			}
		}
		return mid;

	}

}

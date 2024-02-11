import static code.SpiralMatrix.spiralOrder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

	public static void main(String[] args) {
		var matrix1X1 = new int[][]{{1}};
		System.out.println(">>>>>>>>>><" + spiralOrder(matrix1X1));


		var matrix1X2 = new int[][]{{1 ,2}};
		System.out.println(">>>>>>>>>><" + spiralOrder(matrix1X2));

		var matrix2X1 = new int[][]{{1} ,{2}};
		System.out.println(">>>>>>>>>><" + spiralOrder(matrix2X1));

		var matrix2X2 = new int[][]{
				{1, 2},
				{3, 4}
		};
		System.out.println(">>>>>>>>>><" + spiralOrder(matrix2X2));

		var matrix3X3 = new int[][]{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		System.out.println(">>>>>>>>>><" + spiralOrder(matrix3X3));

		var matrix4X3 = new int[][]{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		System.out.println(">>>>>>>>>><" + spiralOrder(matrix4X3));

		var matrix4X4 = new int[][]{

				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println(">>>>>>>>>><" + spiralOrder(matrix4X4));

	}
}
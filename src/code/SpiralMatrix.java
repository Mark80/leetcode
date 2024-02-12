package code;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {
//		printMatrix(generateMatrix(3));
		printMatrix(generateMatrix(1));
		printMatrix(generateMatrix(5));

	}

	static void printMatrix(int[][] matrix) {
		System.out.print("[ ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < matrix.length; j++) {
				System.out.print( matrix[i][j] + " ,");
			}
			System.out.print(" ]");
		}
		System.out.print(" ]");
		System.out.println();

	}

	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = 1000;
			}
		}

		var direction = "R";

		int matrixDim = n * n;

		int v = 1;
		int col = 0;
		int row = 0;

		for (int i = 0; i < matrixDim; i++) {
			if (direction.equals("R")) {
				matrix[row][col] = v;
				v++;
				if (col == n - 1 || matrix[row][col + 1] != 1000) {
					direction = "D";
					row++;
					continue;
				} else {
					col++;
				}
			}

			if (direction.equals("D")) {
				matrix[row][col] = v;
				v++;
				if (row == n - 1 || matrix[row + 1][col] != 1000) {
					direction = "L";
					col--;
					continue;
				} else {
					row++;
				}
			}

			if (direction.equals("L")) {
				matrix[row][col] = v;
				v++;
				if (col == 0 || matrix[row][col - 1] != 1000) {
					direction = "U";
					row--;
					continue;
				} else {
					col--;
				}
			}

			if (direction.equals("U")) {
				matrix[row][col] = v;
				v++;
				if (row == 0 || matrix[row - 1][col] != 1000) {
					direction = "R";
					col++;
				} else {
					row--;
				}
			}
		}

		return matrix;
	}

	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
		var dimX = matrix[0].length - 1;
		var dimY = matrix.length - 1;

		var direction = "R";

		int row = 0;
		int col = 0;

		var result = new ArrayList<Integer>();

		for (int k = 0; k < matrix[0].length * matrix.length; k++) {
			int v = matrix[row][col];
			matrix[row][col] = -101;
			result.add(v);

			if (direction.equals("R")) {
				if (col == dimX || matrix[row][col + 1] == -101) {
					direction = "D";
					row++;
					continue;
				} else {
					col++;
				}
			}

			if (direction.equals("D")) {
				if (row == dimY || matrix[row + 1][col] == -101) {
					direction = "L";
					col--;
					continue;
				} else {
					row++;
				}
			}

			if (direction.equals("L")) {
				if (col == 0 || matrix[row][col - 1] == -101) {
					direction = "U";
					row--;
					continue;
				} else {
					col--;
				}
			}

			if (direction.equals("U")) {
				if (row == 0 || matrix[row - 1][col] == -101) {
					direction = "R";
					col++;
				} else {
					row--;
				}
			}
		}
		return result;
	}
}

package code;

import java.util.ArrayList;

public class SpiralMatrix {
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

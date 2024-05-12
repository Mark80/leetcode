package code;

public class ZizZag {

	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
		System.out.println(convert("PAYPALISHIRINGY", 4));
		System.out.println(convert("PAYPALISHIRING", 1));
		System.out.println(convert("PAYPALISHIRING", 2));
		System.out.println(convert("PAYPAL", 5));
		System.out.println(convert("A", 1));
		System.out.println(convert("A", 2));
		System.out.println(convert("AB", 3));
		System.out.println(convert("ABC", 2));
	}

	static String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		int numOfLetterInTheFirstRow = s.length() / numRows;
		int numColomuns = ((numOfLetterInTheFirstRow) * (numRows - 1)) + 1;

		// System.out.println(numColomuns);

		String[][] matrix = new String[numRows][numColomuns];

		String direction = "DOWN";

		int col = 0;
		int row = 0;

		char[] letters = s.toCharArray();

		for (char letter : letters) {
			// printMatrix(matrix);
			matrix[row][col] = String.valueOf(letter);
			if (row == numRows - 1) {
				direction = "DIA";
			}
			if (row == 0) {
				direction = "DOWN";
			}
			if (direction.equals("DOWN")) {
				row++;
			}
			if (direction.equals("DIA")) {
				row--;
				col++;
			}
		}
		StringBuilder r = new StringBuilder();

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColomuns; j++) {
				if (matrix[i][j] != null) {
					r.append(matrix[i][j]);
				}
			}

		}

		return r.toString();

	}

	static void printMatrix(String[][] matrix) {
		for (String[] chars : matrix) {
			System.out.println();
			for (int j = 0; j < matrix[0].length; j++) {
				if (chars[j] == null) {
					System.out.print("  ");
				} else
					System.out.print(chars[j] + " ");
			}
		}
		System.out.println();

	}

}

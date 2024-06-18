package code;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		ValidSudoku validSudoku = new ValidSudoku();

		var board = new char[][] {
				new char[] { '5', '3', '.', '.', '7', '.', '.', '.', '.' }
				, new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' }
				, new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' }
				, new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' }
				, new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' }
				, new char[] { '7', '.', '.', '.', '2', '.', '.', '.', '6' }
				, new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' }
				, new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' }
				, new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		};
		System.out.println(validSudoku.isValidSudoku(board));

		board = new char[][] {
				new char[] { '5', '3', '.', '.', '7', '.', '.', '.', '.' }
				, new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' }
				, new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' }
				, new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' }
				, new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' }
				, new char[] { '7', '.', '.', '.', '2', '2', '.', '.', '6' }
				, new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' }
				, new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' }
				, new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		};
		System.out.println(validSudoku.isValidSudoku(board));

		board = new char[][] {
				new char[] { '5', '3', '.', '.', '7', '.', '.', '.', '.' }
				, new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' }
				, new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' }
				, new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' }
				, new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' }
				, new char[] { '8', '.', '.', '.', '2', '.', '.', '.', '6' }
				, new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' }
				, new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' }
				, new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		};
		System.out.println(validSudoku.isValidSudoku(board));


		board = new char[][] {
				  new char[] { '5', '3', '.', '.', '7', '.', '.', '1', '.' }
				, new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' }
				, new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' }
				, new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' }
				, new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '.' }
				, new char[] { '7', '.', '.', '.', '2', '.', '.', '.', '6' }
				, new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' }
				, new char[] { '.', '.', '2', '4', '1', '9', '.', '.', '5' }
				, new char[] { '.', '2', '.', '.', '8', '.', '.', '7', '9' }
		};
		System.out.println(validSudoku.isValidSudoku(board));

	}

	public boolean isValidSudoku(char[][] board) {
		return checkRows(board) && checkColumns(board) && checkSquare(board);
	}

	boolean checkSquare(char[][] board) {

		for (int centerRow = 1; centerRow < 9; centerRow = centerRow + 3) {
			for (int centerCol = 1; centerCol < 9; centerCol = centerCol + 3) {
				//System.out.println(centerRow + "," + centerCol);
				char[] toCheck = new char[] {
						board[centerRow][centerCol],
						board[centerRow - 1][centerCol - 1],
						board[centerRow + 1][centerCol + 1],
						board[centerRow - 1][centerCol + 1],
						board[centerRow + 1][centerCol - 1],
						board[centerRow + 1][centerCol],
						board[centerRow - 1][centerCol],
						board[centerRow][centerCol + 1],
						board[centerRow][centerCol - 1],
				};

				boolean check = check(toCheck);
				if(!check){
					return false;
				}
			}
		}

		return true;

	}

	boolean checkColumns(char[][] board) {
		for (int i = 0; i < 9; i++) {
			char[] toCheck = new char[] {
					board[0][i],
					board[1][i],
					board[2][i],
					board[3][i],
					board[4][i],
					board[5][i],
					board[6][i],
					board[7][i],
					board[8][i]
			};
			boolean check = check(toCheck);
			if (!check) {
				return false;
			}
		}
		return true;
	}

	boolean checkRows(char[][] board) {
		for (char[] row : board) {
			boolean valid = check(row);
			if (!valid)
				return false;

		}
		return true;
	}

	boolean check(char[] toCheck) {
		Set<Character> cs = new HashSet<>();
		for (char c : toCheck) {
			if (cs.contains(c) && c != '.')
				return false;
			else
				cs.add(c);
		}

		return true;
	}

}

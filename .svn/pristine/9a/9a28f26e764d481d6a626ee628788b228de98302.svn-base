package lab05;

import java.util.Scanner;

public class WarringHeirs {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		// record n, r, c, and k
		String line = scr.nextLine();
		String[] tokens = line.split(" ");

		int numHeirs = Integer.parseInt(tokens[0]);
		int row = Integer.parseInt(tokens[1]);
		int col = Integer.parseInt(tokens[2]);
		int numBattles = Integer.parseInt(tokens[3]);

		// map the field into 2d array
		int[][] field = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				field[i][j] = scr.nextInt();
			}
		}
		
		// battle for k times
		int[][] curState = field;
		for (int i = 0; i < numBattles; i++) {
			int[][] newState = battle(curState, numHeirs);
			curState = newState;
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(curState[i][j] + " ");
			}
			System.out.println();
		}
		scr.close();
	}
	
	private static int[][] battle(int[][] curState, int numHeirs) {
		int row = curState.length;
		int col = curState[0].length;
		
		int[][] copy = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				copy[i][j] = curState[i][j];
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				attack(curState, copy, i, j, 0, numHeirs);
				attack(curState, copy, i, j, 1, numHeirs);
				attack(curState, copy, i, j, 2, numHeirs);
				attack(curState, copy, i, j, 3, numHeirs);
			}
		}
		
		return copy;
	}

	private static void attack(int[][] field, int[][] copy, int row, int col, int dir,
			int lastHeir) {
		int cur = field[row][col];
		lastHeir--;
		int oppRow = row;
		int oppCol = col;

		if (dir == 0) { // north
			oppRow = row - 1;
		} else if (dir == 1) { // east
			oppCol = col + 1;
		} else if (dir == 2) { // south
			oppRow = row + 1;
		} else { // west
			oppCol = col - 1;
		}

		if (oppRow >= 0 && oppCol >= 0 && oppRow < copy.length
				&& oppCol < copy[row].length) {
			int opp = field[oppRow][oppCol];
			if (cur == lastHeir && opp == 0 || cur == opp - 1) {
				copy[oppRow][oppCol] = cur;
			}
		}
	}

}

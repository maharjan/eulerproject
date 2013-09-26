package com.pj.eulerproject;

public class Problem18 {
	/**
	 * <p>Move from top to bottom, such that compare adjacent value and follow the
	 * biggest number.</p>
	 * 
	 */
	public void solve() {
		int row, column, topRow = 14;
		int[][] triangle = {
				{ 75 },
				{ 95, 64 },
				{ 17, 47, 82 },
				{ 18, 35, 87, 10 },
				{ 20, 04, 82, 47, 65 },
				{ 19, 01, 23, 75, 3, 34 },
				{ 88, 02, 77, 73, 7, 63, 67 },
				{ 99, 65, 4, 28, 6, 16, 70, 92 },
				{ 41, 41, 26, 56, 83, 40, 80, 70, 33 },
				{ 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 },
				{ 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 },
				{ 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 },
				{ 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 },
				{ 63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 },
				{ 04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23 } };

		for (row = topRow - 1; row >= 0; row--) {
			for (column = 0; column <= row; column++) {
				triangle[row][column] += Math.max(triangle[row + 1][column], triangle[row + 1][column + 1]);
			}
		}
		System.out.println(triangle[0][0]);
	}

	public static void main(String[] args) {
		Problem18 eighteen = new Problem18();
		eighteen.solve();
	}
}

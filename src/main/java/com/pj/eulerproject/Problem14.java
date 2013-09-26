package com.pj.eulerproject;

public class Problem14 {
	private void solve() {
		long longestChain = 0;
		long chainStarter = 0;
		long temp = 0;

		for (int i = 1; i < 1000000; i++) {
			temp = evenOddChecker(i);
			if (temp > longestChain) {
				longestChain = temp;
				chainStarter = i;
			}
		}
		System.out.printf("The longest chain is %d produced by %d", longestChain, chainStarter);
	}

	private long evenOddChecker(long number) {
		long counter = 1;
		do {
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = (3 * number) + 1;
			}
			counter++;
		} while (number > 1);
		return counter;
	}

	public static void main(String[] args) {
		Problem14 fourtheen = new Problem14();
		fourtheen.solve();
	}
}

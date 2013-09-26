package com.pj.eulerproject;

public class Problem17 {
	private String[] basic = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public void solve() {
		int totalWords = 0;
		for (int i = 1; i <= 1000; i++) {
			totalWords += converter(i);
		}
		System.out.printf("Total worlds used in between 1 and 1000 %d", totalWords);
	}

	public int converter(int z) {
		int i = z;
		int counter = 0;
		String temp;

		if (i == 1000) {
			counter += 11;
		}
		if (i >= 100 && i < 1000) {
			temp = Integer.toString(i);
			i = Integer.parseInt(temp.substring(1, temp.length()));
			temp = temp.substring(0, 1);
			temp = basic[Integer.parseInt(temp)];
			counter += temp.length();
			counter += 7;
			if (i != 0) {
				counter += 3;
			}
		}

		if (i >= 20 && i <= 99) {
			temp = Integer.toString(i);
			i = Integer.parseInt(temp.substring(1, temp.length()));
			temp = temp.substring(0, 1);
			temp = tens[Integer.parseInt(temp) - 2];
			counter += temp.length();
		}
		if (i >= 10 && i <= 19) {
			temp = Integer.toString(i);
			temp = temp.substring(1, temp.length());
			temp = teens[Integer.parseInt(temp)];
			counter += temp.length();
		}
		if (i >= 1 && i <= 9) {
			counter += basic[i].length();
		}
		System.out.printf("Text length count for %d is %d", z, counter);
		System.out.println();
		return counter;
	}

	public static void main(String[] args) {
		Problem17 seventeen = new Problem17();
		seventeen.solve();
	}
}

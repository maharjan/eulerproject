package com.pj.eulerproject;

public class Problem10 {

	public void execute() {
		// long sum = 0;
		// int end = 2000000;
		// for (int i = 2; i < end; i++) {
		// if (primeCheck(i)) {
		// sum += i;
		// }
		// }
		// System.out.println("SUM " + sum);
		// }
		//
		// private boolean primeCheck(int count) {
		// boolean result = true;
		// for (int j = 2; j < Math.round(Math.sqrt(count)) && result; j++) {
		// result = !(count % j == 0);
		// }
		// return result;
		// }

		long sum = 0;
		int n = 2000000;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isPrime(long n) {
		boolean isPrime = true;
		for (int i = 2; i <= Math.round(Math.sqrt(n)) && isPrime; i++) {
			isPrime = !(n % i == 0);
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Problem10 ten = new Problem10();
		System.out.println("Starting ...");
		ten.execute();
	}
}

package com.pj.eulerproject;

import java.math.BigDecimal;

public class Problem16 {

	public void solve() {
		double result = Math.pow(2, 1000);
		long sum = 0;
		
		String n = new BigDecimal(result).toString();

		for (int i = 0; i < n.length(); i++) {
			sum += new Long(n.substring(i, i + 1));
		}
		System.out.println("SUM " + sum);
	}

	public static void main(String[] args) {
		Problem16 sixteen = new Problem16();
		sixteen.solve();
	}
}

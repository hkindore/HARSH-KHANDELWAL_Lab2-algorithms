package com.paymoney.service;

import java.util.Scanner;

public class TransactionTarget {

	public void Target(int targetNo, int[] a) {
		int i = 0;
		boolean status = false;
		Scanner sc = new Scanner(System.in);
		while (targetNo-- != 0) {
			System.out.println("Enter the value of target:");
			int targetValue = sc.nextInt();
			int sum = 0;
			for (i = 0; i < a.length; i++) {
				sum = sum + a[i];
				if (targetValue <= sum) {
					status = true;
					System.out.println("Target achieved after " + (i + 1) + " transaction");
					break;
				}
			}
		}
		if (status == false) {
			System.out.println("Given target is not achieved!!");
			sc.close();
		}
	}
}
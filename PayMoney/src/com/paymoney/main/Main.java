package com.paymoney.main;

import java.util.Scanner;

import com.paymoney.service.TransactionTarget;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array:");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the values of array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved:");
		int targetNo = sc.nextInt();

		TransactionTarget targetCheck = new TransactionTarget();
		targetCheck.Target(targetNo, a);
		sc.close();
	}
}

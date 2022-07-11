package com.traverler.main;

import java.util.Scanner;

import com.traveler.service.MergeSort;
import com.traveler.service.MinNotes;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MinNotes minNotes = new MinNotes();
		MergeSort mergeSort = new MergeSort();

		System.out.println("Enter the number of currency denominations");
		int n = sc.nextInt();

		int[] notes = new int[n];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < n; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		mergeSort.PerformM(notes, 0, n - 1);
		minNotes.CountingNotes(notes, amount);
		sc.close();
	}

}
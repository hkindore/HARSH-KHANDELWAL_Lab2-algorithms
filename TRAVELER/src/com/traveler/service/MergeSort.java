package com.traveler.service;

public class MergeSort {
	public void PerformM(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			PerformM(arr, left, mid);
			PerformM(arr, mid + 1, right);

			Merging(arr, left, mid, right);
		}
	}

	public void Merging(int[] arr, int left, int mid, int right) {
		int len1 = mid - left + 1;
		int len2 = right - mid;

		int leftarr[] = new int[len1];
		int rightarr[] = new int[len2];

		for (int i = 0; i < len1; i++) {
			leftarr[i] = arr[left + i];
		}
		for (int j = 0; j < len2; j++) {
			rightarr[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;

		while (i < len1 && j < len2) {
			if (leftarr[i] >= rightarr[j]) {
				arr[k] = leftarr[i];
				i++;
			} else {
				arr[k] = rightarr[j];
				j++;
			}
			k++;
		}
		while (i < len1) {
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		while (i < len2) {
			arr[k] = rightarr[j];
			j++;
			k++;
		}
	}
}

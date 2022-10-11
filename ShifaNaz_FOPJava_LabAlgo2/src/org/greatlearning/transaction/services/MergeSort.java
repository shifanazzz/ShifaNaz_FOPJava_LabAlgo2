package org.greatlearning.transaction.services;

public class MergeSort {
	void merge(int a[], int left, int mid, int right) {
		// Find sizes of the two sub arrays
		int s1 = mid - left + 1;
		int s2 = right - mid;

		// creation of temporary arrays
		int leftArr[] = new int[s1];
		int rightArr[] = new int[s2];

		// copy data into left and right array
		for (int i = 0; i < s1; i++) {
			leftArr[i] = a[left + i];
		}
		for (int j = 0; j < s2; j++) {
			rightArr[j] = a[mid + 1 + j];
		}

		// initial indexes of first and second sub array
		int i = 0;
		int j = 0;

		// Initial index of merged sub-array
		int k = left;

		while (i < s1 && j < s2) {
			if (leftArr[i] >= rightArr[j]) {
				a[k] = leftArr[i];
				i++;
			} else {
				a[k] = rightArr[j];
				j++;
			}
			k++;
		}

		// Copy remianing elements of left and right array
		while (i < s1) {
			a[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < s2) {
			a[k] = rightArr[j];
			j++;
			k++;
		}

	}

	// Sorting in Descending order
	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(notes, left, mid);
			sort(notes, mid + 1, right);
			merge(notes, left, mid, right);
		}
	}

}

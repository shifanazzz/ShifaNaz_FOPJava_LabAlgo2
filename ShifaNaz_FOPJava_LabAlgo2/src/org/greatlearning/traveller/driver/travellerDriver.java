package org.greatlearning.traveller.driver;

import java.util.Scanner;

import org.greatlearning.transaction.services.*;

public class travellerDriver {

	public static void main(String[] args) {
		// Object creation of service classes
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of currency denominations : ");
		int size = scan.nextInt();
		if (size == 0) {
			System.out.println("Size of currency denominations cannot be 0");
			return;
		}
		System.out.println("Enter the currency denominations : ");
		int a[] = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			a[i] = scan.nextInt();
		}
		System.out.print("Enter the amount you want to pay : ");
		int amount = scan.nextInt();
		mergeSort.sort(a, 0, a.length - 1);
		notesCount.notesCount(a, amount);

	}

}

package org.greatlearning.transaction.driver;
import java.util.Scanner;

public class DriverTransaction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = scan.nextInt();
		int a[] = new int[size];

		// Read values of array
		System.out.println("Enter the values of array");
		for (int i = 0; i < a.length; i++)
			a[i] = scan.nextInt();

		System.out.println("Enter the total no of targets that needs to be achieved ");
		int targetNo = scan.nextInt();

		while (targetNo != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target: ");
			target = scan.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += a[i];
				if (sum > target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}

			}
			if (flag == 0)
				System.out.println("Target not achieved");
			targetNo--;

		}

	}

}

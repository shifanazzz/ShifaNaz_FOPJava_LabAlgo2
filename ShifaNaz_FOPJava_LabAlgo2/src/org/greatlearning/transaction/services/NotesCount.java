package org.greatlearning.transaction.services;

public class NotesCount {
	public void notesCount(int notes[], int amount) {
		int a[] = new int[notes.length];
		if(amount ==0)
		{
			System.out.println("Amount entered is 0. Try again!");
			return;
		}
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					a[i] = amount / notes[i];
					amount = amount - a[i] * notes[i];
				}

			}
			if (amount > 0)
				System.out.println("Exact amount cant be given with the highest denomination");
			else {
				System.out.println("Your payment approach in order to give min number of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (a[i] != 0) {
						System.out.println(notes[i] + " : " + a[i]);
					}
				}
			}
		} catch (ArithmeticException e) 
		{
			System.out.println(e + "Notes of denominations 0 is invalid");

		}
	}

}

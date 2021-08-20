package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt();

		Rent[] vect = new Rent[9];

		for (int i = 0; i < quantity; i++) {

			sc.nextLine();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();

			vect[room] = new Rent(name, email);
		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < vect.length; i++) {

			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i].getName() + ", " + vect[i].getEmail());
			}

		}

		sc.close();

	}

}


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		Integer n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			Integer room = sc.nextInt();
			vect[room] = new Rent(room, name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				Rent alug = new Rent(vect[i].getRoom(),
                                                     vect[i].getName(),
                                                     vect[i].getEmail());
				System.out.println(alug);
			}
		}
		sc.close();
	}
}
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class Rental {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rooms =10;
		Room[] room = new Room[rooms];
		
		System.out.print("How many rooms will be rented: ");	
		int rentals = sc.nextInt();
		System.out.println();
		
		for (int r=1; r<=rentals; r++) {

			System.out.println("Rent #" + r + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email= sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			System.out.println();
			room[roomNumber]= new Room(name,email,roomNumber);				
		}
		
		System.out.println("Busy Rooms: ");
		for (int r=0; r<rooms; r++) {
			if (room[r] != null) {
				System.out.println(r + ": " + room[r]);
			}	
		}
	sc.close();	
	}

}

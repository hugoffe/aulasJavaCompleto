package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class ProgramArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product2[] vect = new Product2[n]; 
		
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product2(name, price);
		}
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Product Name: " + vect[i].getName());
			System.out.printf("Product Price: %.2f%n ", vect[i].getPrice());
		}
		
		double sum = 0.0;
		
		for (int i=0; i<vect.length; i++) {	
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Product average price: %.2f%n", avg);
		
		sc.close();
	}

}

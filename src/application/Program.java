package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// ENTIDADE PRODUTO
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
//		System.out.print("Quantity in Stock: ");
//		int quantity = sc.nextInt();

		Product product = new Product(name,price);	
		
		product.setName("Computer");
		System.out.println("Product Update name: " + product.getName());
		product.setPrice(15000);
		System.out.println("Product Update price: "+ product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to add in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println();
		
 		System.out.println("Updated data: " + product);
 		System.out.println();
 		
 		System.out.print("Enter the number of products to remove from stock: ");
 		product.removeProducts(sc.nextInt());
 		System.out.println();
 		
 		System.out.println("Updated data: " + product);
 		
		//Entidade Rectangle
		
//		System.out.println("Enter Rectangle width and height: ");
//		Rectangle rectangle = new Rectangle();
//
//		rectangle.width = sc.nextDouble();
//		rectangle.height = sc.nextDouble();
//
//		System.out.println("AREA = " + rectangle.area());
//		System.out.println("PERIMETER = " + rectangle.perimeter());
//		System.out.println("DIAGONAL = " + rectangle.diagonal());
	
		// Entity Employee
		
//		Employee employee = new Employee();
//		double increasePercentage;
//		
//		System.out.print("Name        : ");
//		employee.name = sc.nextLine();
//		System.out.print("Gross salary: ");
//		employee.grossSalary = sc.nextDouble();
//		System.out.print("Tax         : ");
//		employee.tax = sc.nextDouble();
//		
//		System.out.println();
//		System.out.println("Employee: " + employee);
//		
//		System.out.println();
//		System.out.print("Which percentage to increase salary? ");
//		increasePercentage = sc.nextDouble();
//		employee.increaseSalary(increasePercentage);
//		
//		System.out.println();
//		System.out.println("Update data: " + employee);
		
		
		// Entity Student
			
//		Student st = new Student();
//		
//		st.name = sc.nextLine();
//		st.gradeS1 = sc.nextDouble();
//		st.gradeS2 = sc.nextDouble();
//		st.gradeS3 = sc.nextDouble();
//		
//		st.minGrade = 60.00;
//		
//		
//		System.out.println("FINAL GRADE = " + String.format("%.2f", st.finalGrade()));
//		
//		
//		if (st.success(st.minGrade) == "PASSED") {
//			System.out.print(st.success(st.minGrade));
//		}
//		else {
//			System.out.println(st.success(st.minGrade));
//			System.out.println("MISSING " + String.format("%.2f", st.missingPoints()) + " POINTS");
//		}
		
		// Membro Estático - Circumferência
		// declarado na main() 	public static final double PI = 3.14159;
//		
//		
//		System.out.print("Enter radius: ");
//		double radius = sc.nextDouble();
//		
//		double c = Calculator.circumference(radius);
//		
//		double v = Calculator.volume(radius);
//		
//		System.out.printf("Circunference: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.5f%n", Calculator.PI);
		
//		//Membro Estático - parte II - CurrencyConverter
//		
//	
//		System.out.print("What is the dollar price? ");
//		double dollarPrice = sc.nextDouble();
//
//		System.out.print("How many dollars will be bought? ");
//		double dollarAmount = sc.nextDouble();
//		
//		System.out.printf("Amount to be paid ir Reais = %.2f", CurrencyConverter.dollar(dollarPrice, dollarAmount) );
//		
	sc.close();
		
	}

}

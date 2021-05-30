package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;
				
	// ENTIDADE Banco
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder =sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(number, holder, initialDeposit);
			}
		else {
			account = new BankAccount(number, holder);
		}
		System.out.println();

		

		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update Account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update Account data: ");
		System.out.println(account);
		System.out.println();		
		
	sc.close();
	
	}
	
	
}

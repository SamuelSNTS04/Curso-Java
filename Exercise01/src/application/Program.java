package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char y_or_n = sc.next().charAt(0);
		
		if(y_or_n == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDep = sc.nextDouble();
			account = new Account(number, initialDep, name);
		}else {
			account = new Account(number, name);
		}
		
		System.out.printf("\nAccount data:\n");
		System.out.println(account);
		
		System.out.printf("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.printf("Updated account data:\n");
		System.out.println(account);
		
		System.out.printf("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.printf("Updated account data:\n");
		System.out.println(account);
		
		sc.close();
	}
}

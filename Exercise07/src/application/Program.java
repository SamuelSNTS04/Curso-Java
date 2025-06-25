package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data:\n", i);
			System.out.print("Individual or company (i/c)? ");
			char compOrIndiv = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();

			if (compOrIndiv == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();

				list.add(new Company(name, annualIncome, numberOfEmployee));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;

		for (TaxPayer taxes : list) {
			System.out.println(taxes);
			sum += taxes.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}

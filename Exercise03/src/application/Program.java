package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Emplyoee #%d:\n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmp = sc.nextInt();
		
		Employee result = list.stream().filter(x -> x.getId() == idEmp).findFirst().orElse(null);
		
		if(result == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			result.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee listResponse : list) {
			System.out.println(listResponse);
		}
		
		sc.close();
	}

}

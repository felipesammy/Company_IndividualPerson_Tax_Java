package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			System.out.println("Tax payer #"+ i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(c == 'i') {
				System.out.print("Health expenditures: ");
				double healthexpeditures = sc.nextDouble();
				list.add(new IndividualPerson(name, anualIncome, healthexpeditures));
			}
			else if(c == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new CompanyPerson(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		double sum =0.0;
		for(Person c:list) {
			System.out.println(c.getName() 
					+ ": $ " + String.format("%.2f",c.tax()));
			sum = sum +c.tax();		
			}
		
		System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();

	}

}

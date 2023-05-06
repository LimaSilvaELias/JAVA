package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there initial deposit (y/n)? ");
		String confirm = sc.nextLine();

		if (confirm.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			Account acc = new Account(number, holder, initialDeposit);

			System.out.println();
			System.out.println("Account data:");
			System.out.print("Account " + acc);

			System.out.println();
			System.out.print("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			acc.Deposit(deposit);

			System.out.println();
			System.out.println("Update account data: ");
			System.out.print("Account: " + acc);

			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double withdraw = sc.nextDouble();
			acc.Withdraw(withdraw);
			System.out.println("Update account data: ");
			System.out.print("Account: " + acc);
		} else {
			System.out.println();
			Account acc = new Account(number, holder);

			System.out.println("Update account data: ");
			System.out.print("Account: " + acc);
			
			System.out.println();
			System.out.println();
			System.out.print("Enter a deposit value: ");
			
			double deposit = sc.nextDouble();
			acc.Deposit(deposit);
			System.out.println("Update account data: ");
			System.out.print("Account: " + acc);
			
			System.out.println();
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double withdraw = sc.nextDouble();
			acc.Withdraw(withdraw);
			System.out.println("Update account data: ");
			System.out.print("Account: " + acc);

		}
		sc.close();
	}

}

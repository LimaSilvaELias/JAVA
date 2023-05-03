package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Main4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		cc.bought = sc.nextDouble();
		System.out.print(cc.toString());
		
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		System.out.println("\nSOMA: "+soma);
		
		double avg = soma / n;
		System.out.println("MEDIA: "+ avg);
		
		
		sc.close();
	}

}

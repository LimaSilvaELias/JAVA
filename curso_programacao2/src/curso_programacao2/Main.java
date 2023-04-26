package curso_programacao2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		char w;
		x = sc.next();
		System.out.println("Voce digitou: "+x);
		
		y = sc.nextInt();
		System.out.println("Voce digitou: "+y);
		
		
		z = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f%n",z);
		
		w = sc.next().charAt(0);
		System.out.println("Voce digitou: "+w);
		sc.close();
	}

}

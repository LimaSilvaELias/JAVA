import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		
		double F = 9.0 * C / 5.0 + 32;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.println("Deseja repetir (s/n): ");
		char resp = sc.next().charAt(0);

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C2 = sc.nextDouble();
			double F2 = 9.0 * C2 / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n): ");
		} while (resp != 'n');

	}

}

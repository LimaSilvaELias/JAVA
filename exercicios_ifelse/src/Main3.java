import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		System.out.println("Digite dois valores inteiro: ");
		A = sc.nextInt();
		B = sc.nextInt();

		int m = (B / A) * A;
		

		if (m == B) {
			System.out.println("Sao multiplos");
		} else if (m == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Não são multiplos");
		}

	}

}

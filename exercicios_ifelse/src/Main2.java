import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite um numero: ");
		x = sc.nextInt();
		int par = x % 2;
		if(par == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("Impar");
		}

	}

}

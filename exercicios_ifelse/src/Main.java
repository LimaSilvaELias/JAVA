import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite um numero: ");
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("NEGATIVO");
		}else if(x >0) {
			System.out.println("NAO NEGATIVO");
		} else if(x == 0) {
			System.out.println("NAO NEGATIVO");
		}
		
		
	}

}

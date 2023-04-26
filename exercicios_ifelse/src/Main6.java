import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor:");
		valor = sc.nextInt();
		
		if(valor < 0.0 || valor > 100) {
			System.out.println("Fora de intervalo");
		}else if(valor <= 25) {
			System.out.println("Intervalo (0,25)");
		} else if( valor <=50) {
			System.out.println("Intervalo (25,50)");
		} else if(valor <=75) {
			System.out.println("Intervalor (50,75)");
		}else {
			System.out.println("Intervalo (75,100)");
		}
	}

}

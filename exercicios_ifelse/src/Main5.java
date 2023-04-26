import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco;
		int qntd, cod;
		System.out.println("Digite o codigo do produto: ");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		qntd = sc.nextInt();
		
		double total;
		if(cod == 1) {
			preco = 4.00;
			total = preco * qntd;
			System.out.println("Total: R$ "+total);
		}else if(cod == 2) {
			preco = 4.50;
			total = preco * qntd;
			System.out.println("Total: R$ "+total);
		}else if(cod == 3) {
			preco = 5.00;
			total = preco * qntd;
			System.out.println("Total: R$ "+total);
		}else if(cod == 4) {
			preco = 2.00;
			total = preco * qntd;
			System.out.println("Total: R$ "+total);
		}else if(cod == 5) {
			preco = 1.50;
			total = preco * qntd;
			System.out.println("Total: R$ "+total);
		}
		
		
	}

}

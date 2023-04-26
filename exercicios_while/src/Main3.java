import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		int pref = sc.nextInt();
		
		while(pref != 4) {
			if(pref == 1) {
				alcool += 1;
			}else if(pref == 2) {
				gasolina += 1;
			}else if(pref == 3) {
				diesel += 1;
			}
			pref = sc.nextInt();
			}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ diesel);
		}
	}



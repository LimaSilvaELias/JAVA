import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hrIni, hrFin;
		System.out.println("Hora inicial: ");
		hrIni = sc.nextInt();
		System.out.println("Hora final: ");
		hrFin = sc.nextInt();
		
		int duracao;
		if(hrIni < hrFin) {
			duracao = hrFin - hrIni;
		}else {
			duracao = 24-hrIni+hrFin;
		}
		System.out.println("O jogo durou"+duracao+"Hora(s)");
		}

	}



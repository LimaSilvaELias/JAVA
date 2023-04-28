package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto product = new Produto();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: "+product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "+product);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.ReturnProducts(quantity);
		System.out.println();
		System.out.println("Update data: "+product);
		
		
		sc.close();
	}

}

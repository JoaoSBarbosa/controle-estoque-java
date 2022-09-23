package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// Declaração de variáveis

		Product product = new Product(); // instanciado o objeto product ( referência para o Product

		System.out.println("Enter product data:");
		
		/* Lendo cada dado de entrada e inserindo na classe product em seu respectivo 
		   atributo. Ao final de casa inserção cria-se um objeto na classe product 
		 */
		System.out.print("Name: ");
		product.nome = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		

		sc.close();

	}

}

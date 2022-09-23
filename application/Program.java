package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// Declara��o de vari�veis

		Product product = new Product(); // instanciado o objeto product ( refer�ncia para o Product

		System.out.println("--Enter product data: ");
		System.out.println();

		/*
		 * Lendo cada dado de entrada e inserindo na classe product em seu respectivo
		 * atributo. Ao final de casa inser��o cria-se um objeto na classe product
		 */
		
		// Entrada de dados- Grava��o inicial
		System.out.print("Name: ");
		product.nome = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		// Exibindo os dados
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println("\n                       **                                      ");
		

		System.out.println();
		
		// Entrada de novos dados ( Somando mais produtos)
		System.out.print("--Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		// Exibindo a atualiza��o
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println("\n                          **                                  ");

		// Sa�da de dados - Remo��o de produtos
		System.out.print("--Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		// Exibindo a atualiza��o
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println("\n                          **                                  ");
		sc.close();

	}

}

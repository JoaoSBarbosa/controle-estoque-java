package entities;

public class Product {

	// Atributos
	public String nome;
	public double price;
	public int quantity;

	// M�todos
	public double totalValueInStock() {
		return price * quantity;

	}

	public void addProducts(int quantity) {

		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;
	}
	
	/* Como a Classe Product tamb�m � uma classe Object, 
	   estou aqui sobrepondo a fun��o toString padr�o quem vem no Objetc 
	   assim sendo poss�vel implementar uma vers�o toString
	   */
	public String toString() { 
		return  nome
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		
	}
}

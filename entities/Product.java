package entities;

public class Product {

	// Atributos
	public String nome;
	public double price;
	public int quantity;

	// Métodos
	public double totalValueInStock() {
		return price * quantity;

	}

	public void addProducts(int quantity) {

		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;
	}
	
	/* Como a Classe Product também é uma classe Object, 
	   estou aqui sobrepondo a função toString padrão quem vem no Objetc 
	   assim sendo possível implementar uma versão toString
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

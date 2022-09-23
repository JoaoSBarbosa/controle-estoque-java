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
}

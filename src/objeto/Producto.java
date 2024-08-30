package objeto;

import java.time.LocalDate;

public class Producto {

	// VARIABLES

	private int id;
	private String name;
	private int stock;
	private String typeUnit;
	private LocalDate expirationDate;
	private double price;

	// CONSTRUCTOR

	public Producto(int id, String name, int stock, String typeUnit, LocalDate expirationDate, double price) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.typeUnit = typeUnit;
		this.expirationDate = expirationDate;
		this.price = price;
	}

	// GETTER & SETTER

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTypeUnit() {
		return typeUnit;
	}

	public void setTypeUnit(String typeUnit) {
		this.typeUnit = typeUnit;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}

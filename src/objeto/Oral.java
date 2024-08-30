package objeto;

import java.time.LocalDate;

public class Oral extends Producto {

	// ATRIBUTOS

	private int dosis;
	private TipoIngestion typeIngesting;

	// CONSTRUCTOR

	public Oral(int id, String name, int stock, String typeUnit, LocalDate expirationDate, double price, int dosis,
			TipoIngestion typeIngesting) {
		super(id, name, stock, typeUnit, expirationDate, price);
		this.dosis = dosis;
		this.typeIngesting = typeIngesting;
	}

	// GETTER & SETTER

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public TipoIngestion getTypeIngesting() {
		return typeIngesting;
	}

	public void setTypeIngesting(TipoIngestion typeIngesting) {
		this.typeIngesting = typeIngesting;
	}

}

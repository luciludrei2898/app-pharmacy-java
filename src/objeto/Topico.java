package objeto;

import java.time.LocalDate;

public class Topico extends Producto {

	// ATRIBUTOS

	private String pao;
	private TipoConsistencia consistency;
	private String aplication;

	// CONSTRUCTOR

	public Topico(int id, String name, int stock, String typeUnit, LocalDate expirationDate, double price, String pao,
			TipoConsistencia consistency, String aplication) {
		super(id, name, stock, typeUnit, expirationDate, price);
		this.pao = pao;
		this.consistency = consistency;
		this.aplication = aplication;
	}

	// GETTER & SETTER

	public String getPao() {
		return pao + "M";
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public TipoConsistencia getConsistency() {
		return consistency;
	}

	public void setConsistency(TipoConsistencia consistency) {
		this.consistency = consistency;
	}

	public String getAplication() {
		return aplication;
	}

	public void setAplication(String aplication) {
		this.aplication = aplication;
	}

}

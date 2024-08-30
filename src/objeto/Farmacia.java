package objeto;

import java.util.ArrayList;

public class Farmacia {

	// ATRIBUTOS

	private String name;
	private int id;
	private Direccion adress;
	private ArrayList<Producto> productListFarmacia = new ArrayList<>();

	// CONSTRUCTOR

	public Farmacia(String name, int id, Direccion adress) {
		this.name = name;
		this.id = id;
		this.adress = adress;
	}

	// GETTER & SETTER

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Direccion getAdress() {
		return adress;
	}

	public void setAdress(Direccion adress) {
		this.adress = adress;
	}

	public ArrayList<Producto> getProductListFarmacia() {
		return productListFarmacia;
	}

	public void setProductListFarmacia(ArrayList<Producto> productListFarmacia) {
		this.productListFarmacia = productListFarmacia;
	}

	// METODO ADD PRODUCTOS

	public void addProducto(Producto producto) {

		productListFarmacia.add(producto);

	}

	// MOSTRAR PRODUCTOS FARMACEUTICOS

	public void showProducts() {

		for (int i = 0; i < productListFarmacia.size(); i++) {

			System.out.println("\n [ " + i + " ] " + productListFarmacia.get(i).getName().toUpperCase() + " - "
					+ productListFarmacia.get(i).getPrice() + " euros.");
			System.out.println(" Fecha de caducidad: " + productListFarmacia.get(i).getExpirationDate() + ". ");

			if (productListFarmacia.get(i).getClass() == Topico.class) {

				System.out.println(" PAO: " + ((Topico) productListFarmacia.get(i)).getPao() + ". ");
				System.out.println(" Consistencia: " + ((Topico) productListFarmacia.get(i)).getConsistency() + ". ");
				System.out.println(" Aplicacion: " + ((Topico) productListFarmacia.get(i)).getAplication() + ". ");

			} else if (productListFarmacia.get(i).getClass() == Oral.class) {

				System.out.println(" Dosis maxima: " + ((Oral) productListFarmacia.get(i)).getDosis() + " "
						+ productListFarmacia.get(i).getTypeUnit() + ". ");
				System.out.println(
						" Instrucciones de ingesta: " + ((Oral) productListFarmacia.get(i)).getTypeIngesting() + ". ");

			}
		}

	}

}

package main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

import objeto.Direccion;
import objeto.Farmacia;
import objeto.Oral;
import objeto.Producto;
import objeto.TipoConsistencia;
import objeto.TipoIngestion;
import objeto.Topico;

public class Main {

	public static void main(String[] args) {

		// OBJETO SCANNER
		Scanner sc = new Scanner(System.in);

		// VARIABLES TIEMPO
		LocalDate time = LocalDate.of(2025, Month.JUNE, 24);
		LocalDate time2 = LocalDate.of(2026, Month.DECEMBER, 15);
		LocalDate time3 = LocalDate.of(2028, Month.MAY, 28);
		LocalDate time4 = LocalDate.of(2024, Month.DECEMBER, 30);
		LocalDate time5 = LocalDate.of(2026, Month.APRIL, 26);

		// CREAMOS LOS PRODUCTOS
		// TOPICOS
		Topico vaporub = new Topico(1, "VapoRub", 300, "Gramos", time, 9.41, "12", TipoConsistencia.POMADA,
				"Aplicar una fina capa de pomada sobre el pecho, cuello y espalda");
		Topico zenavan = new Topico(2, "Zenavan", 150, "Gramos", time2, 5.46, "12", TipoConsistencia.CREMA,
				"Aplicar 3 o 4 veces al dia una porcion de 5 a 10 cm de gel");
		Topico fisiocrem = new Topico(3, "FisioCrem", 200, "Mililitros", time3, 20.24, "12", TipoConsistencia.BALSAMO,
				"Se aconsejan 3 o 4 aplicaciones al dia sobre la zona indicada realizando un masaje para favorecer la absorcion");

		// ORALES
		Oral ibuprofeno = new Oral(4, "Ibuprofeno", 600, "Gramos", time4, 6.50, 20, TipoIngestion.ALIMENTO);
		Oral omeprazol = new Oral(5, "Omeprazol", 350, "Gramos", time5, 7.40, 20, TipoIngestion.AYUNAS);

		// CREAMOS LA DIRECCION DE LA FARMACIA
		Direccion adressFarmacia = new Direccion("Parla", "Calle de Getafe", "17", "Local", "32");

		// CREAMOS LA FARMACIA, CON NOMBRE, ID Y ADRESS, SIN PRODUCTO
		Farmacia farmaciaRubio = new Farmacia("Farmacia Rubio Munino", 1, adressFarmacia);

		// METEMOS LOS PRODUCTOS EN EL ARRAY LIST DE LOS PRODUCTOS DE LA FARMACIA
		farmaciaRubio.addProducto(omeprazol);
		farmaciaRubio.addProducto(fisiocrem);
		farmaciaRubio.addProducto(ibuprofeno);
		farmaciaRubio.addProducto(zenavan);
		farmaciaRubio.addProducto(vaporub);

		// VARIABLES DEL MENU
		int optionOperation = 0; // VARIABLE DE LA OPCION PRINCIPAL DEL MENU
		int optionOperationFinal = 0; // VARIABLE FINAL COMPRA
		boolean flagBuy = false; // VARIABLE PARA SEGUIR PIDIENDO PRODUCTOS
		int continueBuy = 0;
		int chosenProduct = 0; // VARIABLE PARA ELEGIR EL PRODUCTO
		double totalPrice = 0;
		String nameFarmacia = farmaciaRubio.getName().toUpperCase(); // NOMBRE DE LA FARMACIA EN MAYUSCULAS

		do {

			// MENU OPERACION
			System.out.print("\n" + " === FARMACIA " + nameFarmacia + " ===" + "\n"
					+ "\n Seleccione a continuacion la operacion que desea realizar: " + "\n"
					+ " \n [1] VER MEDICAMENTOS. \n" + " \n [2] HACER PEDIDO. \n"
					+ " \n [3] INFORMACION DE LA TIENDA. \n " + "\n [4] EXIT. \n" + " \n >>> ");

			optionOperation = sc.nextInt();

			switch (optionOperation) {
			case 1:
				System.out.println("\n" + " === MEDICAMENTOS ===" + "\n");
				farmaciaRubio.showProducts();
				break;
			case 2:
				// MOSTRAMOS DE NUEVO LOS PRODUCTOS
				System.out.println("\n" + " === MEDICAMENTOS  ===" + "\n");
				farmaciaRubio.showProducts();

				// CREAMOS UN ARRAYLIST DE PEDIDO
				ArrayList<Producto> pedidoFarmacia = new ArrayList<>();

				// HACEMOS EL BUCLE PARA PREGUNTAR CONSTANTEMENTE AL USUARIO SI QUIERE SEGUIR
				// COMPRANDO

				while (flagBuy == false) {
					System.out.print(" \n >>> Introduzca el numero del medicamento que desea pedir: ");
					chosenProduct = sc.nextInt();

					pedidoFarmacia.add(farmaciaRubio.getProductListFarmacia().get(chosenProduct));

					System.out.print(" \n ¿Desea seguir comprando? [ 1 ] SI. [ 2 ] NO.  : ");
					continueBuy = sc.nextInt();

					if (continueBuy == 2) {
						flagBuy = true;
					}
				}

				// LE MOSTRAMOS EL TICKET DE LO QUE HA PEDIDO
				System.out.println("\n === TICKET DE COMPRA === \n");

				// FOR QUE RECORRE EL ARRAYLIST QUE HEMOS CREADO
				for (int i = 0; i < pedidoFarmacia.size(); i++) {
					System.out.println(" >>> " + pedidoFarmacia.get(i).getName());
				}

				// PONEMOS DE NUEVO EL PRECIO A 0
				totalPrice = 0;

				// HACEMOS UN FOR QUE IMPRIME EL PRECIO TOTAL
				for (int i = 0; i < pedidoFarmacia.size(); i++) {
					totalPrice += pedidoFarmacia.get(i).getPrice();
				}

				// IMPRIMOS EL PRECIO
				System.out.println("\n PRECIO TOTAL: " + totalPrice + " euros.");
				System.out.print(" \n ¿DESEA FINALIZAR LA COMPRA? [ 1 ] SI. [ 2 ] NO. : ");
				optionOperationFinal = sc.nextInt();

				if (optionOperationFinal == 1) {

					// COMUNICAMOS QUE EL PEDIDO ESTA HECHO CORRECTAMENTE
					System.out.println("\n" + " === PEDIDO REALIZADO, GRACIAS  ===" + "\n");

				} else if (optionOperationFinal == 2) {

					System.out.println(" PEDIDO ANULADO. GRACIAS. ");
				}
				break;
			case 3:
				// IMPRIMOS INFORMACION DE LA FARMACIA
				System.out.println("\n === INFORMACION DE LA FARMACIA === \n");
				System.out.println(" Nombre: " + farmaciaRubio.getName() + ". ");
				System.out.println(" Via: " + farmaciaRubio.getAdress().getRoad() + ", "
						+ farmaciaRubio.getAdress().getNumber() + ". " + farmaciaRubio.getAdress().getFloor() + " "
						+ farmaciaRubio.getAdress().getLetter() + ". ");
				System.out.println(" Localidad: " + farmaciaRubio.getAdress().getLocation() + ". ");
				break;
			case 4:
				System.out.println("\n ... ");
				System.out.println(" ..... ");
				System.out.println(" ....... ");
				System.out.println("\n CIERRE DE SESION. ");
				break;
			default:
				System.out.println("\n Error de respuesta. Introduzca de nuevo la opcion a realizar.");
			}

		} while (optionOperation != 4);
		{
			System.out.println("\n" + " \n === HASTA PRONTO ===" + "\n" + " \n Muchas gracias por comprar en "
					+ farmaciaRubio.getName() + ".");
		}

	}

}

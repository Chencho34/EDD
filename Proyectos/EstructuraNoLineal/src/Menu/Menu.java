package Menu;

import ARBOLBINARIO.ArbolBin;
import ARBOLBINARIO.Nodito;
import tools.toolsList;

public class Menu {

	public static void menu() {
		ArbolBin<Integer> arb = new ArbolBin<>();
		
		String op;
		do {
			op = toolsList.boton("Insertar,Recorridos,Buscar,Hojas,Altura,Ver,Salir");

			switch (op) {
				case "Insertar":
	//				toolsList.imprimeMsg("El tipo de T es" + arb.getClass().getName());
					arb.insertarArbol(toolsList.leerInt("Dato"));
					System.out.println("Actualizacion del arbol: \n");
					// arb.imprimirArbol(arb.getRaiz(), " ", false);
					arb.printRecursive(arb.getRaiz(), 0);
					break;

				case "Recorridos":
					toolsList.imprimePantalla(""
							+ "\nPreorden " + arb.preorden(arb.getRaiz()) 
							+ "\nInorden " + arb.inorden(arb.getRaiz()) 
							+ "\nEnorden " + arb.enorden(arb.getRaiz()) 
							+ "\nPosorden " + arb.posorden(arb.getRaiz()));
					break;

				case "Buscar":
					if (arb.arbolVacio()) {
						toolsList.imprimeErrorMsg("Arbol vacio");
					} else {
						int datoBuscar = toolsList.leerInt("Ingresa valor a buscar");
						Nodito resultado = arb.buscarDato(arb.getRaiz(), datoBuscar);

						if (resultado != null) {
							toolsList.imprimePantalla("El dato " + datoBuscar + " se encuentra en el arbol");
						} else {
							toolsList.imprimePantalla("El dato " + datoBuscar + " no se encuentra en el arbol");
						}
					}
					break;

				case "Hojas":
					if (arb.arbolVacio()) {
						toolsList.imprimeErrorMsg("Arbol vacio");
					} else {				
						toolsList.imprimePantalla("Las hojas del arbol son: \n" + arb.imprimirHojas(arb.getRaiz()));
						toolsList.imprimePantalla("Los interiores del arbol son: \n" + arb.imprimirInteriores(arb.getRaiz()));
					}
					break;

				case "Altura":
					if (arb.arbolVacio()) {
						toolsList.imprimeErrorMsg("Arbol vacio");
					} else {
						toolsList.imprimePantalla("La altura del arbol es: \n" + arb.obtenerAltura(arb.getRaiz()));
					}
					break;

				case "Ver":
					if (arb.arbolVacio()) {
						toolsList.imprimeErrorMsg("Arbol vacio");
					} else {
						System.out.println("La estructura del arbol es la siguiente: \n");
						// arb.imprimirArbol(arb.getRaiz(), " ", false);
						arb.printRecursive(arb.getRaiz(), 0);
					}
					break;

				case "Salir":

					break;
				default:
					toolsList.imprimePantalla("Saliendo...");
			}
		} while (!op.equalsIgnoreCase("Salir"));
	}
}

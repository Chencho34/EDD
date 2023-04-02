package Menu;

import ColaEstatica.ColaA;
import MemoriaDinamica.PilaB;
import MemoriaDinamica.PilaC;
import MemoriaDinamica.PilaD;
import PilaEstatica.PilaA;
import tools.toolsList;

public class Menu {
	public static void menu() {
		
//		PilaA<Integer> pila = new PilaA<Integer>((byte) 10);
//		PilaB<Integer> pila = new PilaB<Integer>();		
//		PilaC<Integer> pila = new PilaC<Integer>();		
//		PilaD pila = new PilaD();

		ColaA<Integer> cola = new ColaA<Integer>((byte)10);

		String sel = "";

		do {			
			sel = toolsList.boton("Pop,Push,Peek,Free,Salir");
			switch (sel) {
			case "Pop":
				if (cola.isEmpty()) {
					toolsList.imprimeErrorMsg("Pila vacia");
				} else {
					toolsList.imprimePantalla("Dato eliminado de la cima de la pila: " + cola.pop());
				}
				break;
			case "Push":
				cola.push(toolsList.leerInt("Escribe un dato entero"));
				toolsList.imprimePantalla("Datos de la pila\n" + cola.toString());
				break;
			case "Peek":
				if (cola.isEmpty()) {
					toolsList.imprimeErrorMsg("Esta vacio");
				} else {
					toolsList.imprimePantalla("Dato de la sima de la fila: " + cola.peek());
				}
				break;
			case "Free":
				if (cola.isEmpty()) {
					toolsList.imprimeErrorMsg("Pila vacia");
				} 
//				else {
//					cola.vaciar();
//					toolsList.imprimePantalla("P�la vaciada");
//				}
				break;
			default:
			}
		} while (!sel.equalsIgnoreCase("Salir"));
	}
}
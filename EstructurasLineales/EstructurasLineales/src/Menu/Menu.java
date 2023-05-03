package Menu;
import PilaEstatica.PilaA;

import ColaEstatica.ColaA;
import ColaEstatica.ColaB;
import tools.toolsList;
import MemoriaDinamica.PilaC;
import MemoriaDinamica.PilaB;
public class Menu {
	
public static void menu() {
	
		
//	ColaA  <Integer> cola=new ColaA(0);
	ColaB  <Integer> cola=new ColaB<Integer>();
	String op;
		
		do {
			op=toolsList.boton("pop,push,peek,Free,Salir");
		
			switch (op) {	
			case "pop":
				if (cola.isEmptyCola())toolsList.imprimeErrorMsg("Pila vacia");
				else
					
					toolsList.imprimePantalla("Dato eliminado de la cima de la pila: "+cola.popCola());
				
				break;
			case "push":				
				cola.pushCola(toolsList.leerInt("Escribe un dato entero"));
				toolsList.imprimePantalla("Datos de la pila\n"+cola.toString());
				
				break;
			case "peek":				
				if(cola.isEmptyCola()) toolsList.imprimeErrorMsg("pila vacia");

				else
					toolsList.imprimePantalla("Dato  de la cima de la pila: "+cola.peekCola());
				break;
			case "Free":				
				if (cola.isEmptyCola())toolsList.imprimeErrorMsg("Pila vacia");
				else
					
				     toolsList.imprimePantalla("pila vacia");
				
				break;
				
			default:
				toolsList.imprimePantalla("Saliendo...");
			}
		} while (!op.equalsIgnoreCase("Salir"));
	}
}

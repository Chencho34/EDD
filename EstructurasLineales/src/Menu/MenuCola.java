package Menu;
import ColaEstatica.ColaA;
import ColaEstatica.ColaB;
import ColaEstatica.ColaC;
import ColaEstatica.ColaD;
import tools.toolsList;
public class MenuCola {
	public static void menu() {
		
		
		ColaB  <Integer> cola=new ColaB<Integer>();
		String op;
			
			do {
				op=toolsList.boton("pop,push,peek,Free,Salir");
			
				switch (op) {	
				case "pop":
					if (cola.isEmptyCola())toolsList.imprimeErrorMsg("Cola vacia");
					else
						
						toolsList.imprimePantalla("Dato eliminado de la Cola: "+cola.popCola());
					
					break;
				case "push":				
					cola.pushCola(toolsList.leerInt("Escribe un dato entero"));
					toolsList.imprimePantalla("Datos de la cola\n"+cola.toString());
					
					break;
				case "peek":				
					if(cola.isEmptyCola()) toolsList.imprimeErrorMsg("cola vacia");

					else
						toolsList.imprimePantalla("Dato  de la cima de la cola: "+cola.peekCola());
					break;
				case "Free":				
					if (cola.isEmptyCola())toolsList.imprimeErrorMsg("cola vacia");
					else
						
					     toolsList.imprimePantalla("cola vacia");
					
					break;
					
				default:
					toolsList.imprimePantalla("Saliendo...");
				}
			} while (!op.equalsIgnoreCase("Salir"));
		}
	}



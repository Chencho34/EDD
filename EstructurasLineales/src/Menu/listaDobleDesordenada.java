package Menu;

import DobleLiga.DatosDesordenadosDobleLiga;
import DobleLiga.Nodito;
import tools.toolsList;

public class listaDobleDesordenada {
	 public static void main(String arg[])
	   { 
		   String op;
		   DatosDesordenadosDobleLiga obj = new DatosDesordenadosDobleLiga();
		   
			do {
				op=toolsList.boton("Frente,Final,Busqueda,BusAnterior,Eliminar,Modificar,Ordenar,imprime,Salir");
			
				switch (op) {	
				case "Frente":
					obj.inserFrente(toolsList.leerString("Nombre"));
					toolsList.imprimePantalla("Datos de la lista\n"+ obj.imprimeLista());
					break;
				case "Final":				
					obj.inserFinal(toolsList.leerInt("Escribe un dato entero"));
					toolsList.imprimePantalla("Datos de la pila\n"+ obj.imprimeLista());
					break;
				
				case"imprime":
					toolsList.imprimePantalla("Lista"+obj.imprimeLista());
					break;
					
				default:
					toolsList.imprimePantalla("Saliendo...");
				}
			} while (!op.equalsIgnoreCase("Salir"));
	   }
}

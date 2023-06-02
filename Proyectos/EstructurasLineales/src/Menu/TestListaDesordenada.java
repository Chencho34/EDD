package Menu;
import MemoriaDinamica.Nodo;
import OperacionesListas.DatosDesordenados;
import tools.toolsList;

public class TestListaDesordenada {
   public static void main(String arg[])
   { 
	   String op;
	   DatosDesordenados obj = new DatosDesordenados();
	   
		do {
			op=toolsList.boton("Frente,Final,Busqueda,BusAnterior,Eliminar,Modificar,Ordenar,imprime,Salir");
		
			switch (op) {	
			case "Frente":
				obj.inserFrente(toolsList.leerInt("Escribe un dato entero"));
				toolsList.imprimePantalla("Datos de la pila\n"+ obj.imprimeLista());
				break;
			case "Final":				
				obj.inserFinal(toolsList.leerInt("Escribe un dato entero"));
				toolsList.imprimePantalla("Datos de la pila\n"+ obj.imprimeLista());
				break;
			case "Busqueda":
				if(obj.isListaVacia()) {
					toolsList.imprimeErrorMsg("LISTA VACIA");
				} else {
					Nodo i = obj.busSecLista(toolsList.leerInt("Valor a buscar"));
				
							
					if(i != null) {
						toolsList.imprimeMsg("Dato encontrado\n" + i.getInfo());
						} else {
						toolsList.imprimeErrorMsg("No se encontro el dato");
					}
				}
				break;
				
			case"Ordenar":
				if(obj.isListaVacia()) {
					toolsList.imprimeErrorMsg("LISTA VACIA");
				} else {
					obj.ordenar();
					toolsList.imprimeMsg("Datos ordenados");
				}
				break;
			case "BusAnterior":
				if(obj.isListaVacia()) {
					toolsList.imprimeErrorMsg("LISTA VACIA");
				} else {
					Nodo i = obj.busSecLista(toolsList.leerInt("Valor a buscar"));
					Nodo  antes=obj.BusAnterior(i);
							
					if(i != null) {
						toolsList.imprimeMsg("Dato encontrado" + i.getInfo()+"Dato anterior"+antes.getInfo());
						} else {
						toolsList.imprimeErrorMsg("No se encontro el dato");
					}
				}
			break;
		
			case "Eliminar":
				if(obj.isListaVacia()) {
					toolsList.imprimeErrorMsg("LISTA VACIA");
				} else {
					Nodo i;
					i=obj.busSecLista(toolsList.leerInt("Valor a eliminar"));
					
					if(i != null) {
						obj.eliminaLista(i);
						toolsList.imprimePantalla("Datos Eliminado\n"+ obj.imprimeLista());
						} else {
						toolsList.imprimeErrorMsg("No se encontro el dato");
					}
				}
				
				break;
			case "Modificar":
				if(obj.isListaVacia()) {
					toolsList.imprimeErrorMsg("LISTA VACIA");
				} else {
					Nodo i;
					i=obj.busSecLista(toolsList.leerInt("Valor a modificar"));
					
					if(i != null) {
						obj.modificar(i);
						toolsList.imprimePantalla("Dato modificado\n"+ obj.imprimeLista());
						} else {
						toolsList.imprimeErrorMsg("No se encontro el dato");
					}
				}
				
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
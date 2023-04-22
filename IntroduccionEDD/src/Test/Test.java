package Test;
//import Metodos.DatoSimple;
import Metodos.DatoSimpleOrdenada;
import Tools.toolsList;
import javax.swing.*;
public class Test {
	static byte tam = 10;
    
    public static void main(String[] args) {
        //DatoSimple obj = new DatoSimple(tam);
        String menu2 = "Agregar,Imprimir,Busqueda,Modificar,Eliminar,Salir";
        menu3(menu2);
    }
      
    public static String boton(String menu) {
        String valores[] = menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",JOptionPane.NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
        return (valores[n]);
    }
    
    public static void menu3(String menu) {
        int pos = 0;
//      DatoSimple obj = new DatoSimple(tam);
        DatoSimpleOrdenada obj2 = new DatoSimpleOrdenada(tam);

        String sel = "";
        
        do {
            sel = boton(menu);
            switch(sel) {
                case "Agregar":
                    obj2.agregarOrdenado();
                break;
                case "Imprimir":
                    if(obj2.validaVacio()) {
                        toolsList.imprimeErrorMsg("Arreglo vacio");
                    } else {
                        toolsList.imprimePantalla("Datos del arreglo" + obj2.imprimeOrdenados());
                    }
                break;
                case "Busqueda":
                    if(obj2.validaVacio()) {
                        toolsList.imprimeErrorMsg("Arreglo vacio");
                    } else {
                        pos = obj2.busquedaOrdenada(toolsList.leerInt("Ingrese el valor"));
                        if (pos >= 0) {
                            toolsList.imprimePantalla("Se encuentra en la posicion: " + pos);
                        } else {
                            toolsList.imprimeErrorMsg("Se debe de insertar en la posicion" + pos * (-1));
                        } 
                    }
                break;
                case "Modificar":
                    int dato = 0;
                    
                    if(obj2.validaVacio()) { 
                        toolsList.imprimeErrorMsg("El arreglo esta vacio");
                    } else {
                        dato = toolsList.leerInt("Ingrese el dato a modificar");
                        pos = obj2.busquedaOrdenada(dato);
                    }
                    if(pos >= 0) {
                        obj2.modificaOrdenados(dato);
                        toolsList.imprimePantalla("Dato modificado." + obj2.imprimeOrdenados());
                    } else {
                        toolsList.imprimeErrorMsg("No se encuentra el dato");
                    }
                break;
                case "Eliminar":
					if (obj2.validaVacio()) {
						toolsList.imprimeErrorMsg("Arreglo Vacio");
					} else { 
						pos = obj2.busquedaOrdenada(toolsList.leerInt("Ingrese el valor"));
						if (pos >= 0) {
							toolsList.imprimePantalla("Dato eliminado en la posicion: " + pos);
							obj2.eliminaDato(pos);
						} else {
							toolsList.imprimeErrorMsg("Dato no encontrado");
						}
					}
                break;
                case "Salir":;
                break;
            }
        }
        while(!sel.equalsIgnoreCase("Salir"));
    }
}
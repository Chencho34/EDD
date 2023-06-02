package Metodos;

import java.util.Arrays;

import Tools.toolsList;

public class DatoSimpleOrdenada{	
	
    private Object datosOrdenados[]; //Definir array 
    //private int datosOrdenados[]; //Definir array 

    //private Object datos[] = {12,23,34,45,56,67};
    private byte posicion; //Subindice o Posicion.
    
    //Constructor recibe el tamaño, para demencionar el tama�o.
    public DatoSimpleOrdenada(byte tam) {
        datosOrdenados = new Object[tam];
        posicion = -1; // Subindice, -1 para validar si esta vacio el array.
    }
    
    
    public boolean validaVacio() {
        return (posicion == -1); // Si posicoin == -1 vacio : si no esta lleno.
    }

    public void corrimiento(int pos) {
        for(int i = posicion + 1; i > pos; i--)
            datosOrdenados[i] = datosOrdenados[i - 1];
    }
    
    public void agregarOrdenado() {
        int dato = 0;
        int pos = 0;
        
        if(validaVacio()) {
            datosOrdenados[posicion + 1] = toolsList.leerInt("Ingrese un valor");
            posicion++;
        } else {
            dato = toolsList.leerInt("Escribe el valor a insertar");
            pos = busquedaOrdenada(dato);
            if(pos > 0) {
                toolsList.imprimeErrorMsg("Dato existente");
            } else {
                pos = pos * (-1);
                corrimiento(pos);

                datosOrdenados[pos] = dato;
                posicion++;
            }
        }
    }
    
    public String imprimeOrdenados() {
        String cad = "";
        for (int i = 0; i <= posicion; i++) { 
            cad += i + "[" + datosOrdenados[i] + "]" + "\n";
        }
        return "\n" + cad;
    }
    
    public void modificaOrdenados(int dato) {
        int pos = 0;
        pos = busquedaOrdenada(dato);
        
        if(pos < posicion) {
            if(dato <= (Integer)datosOrdenados[0]) {
                do {
                    pos = pos * (-1);
                    dato = toolsList.leerInt("Ingresa un valor menor a: " + datosOrdenados[pos + 1]);
                } while (dato >= (Integer) datosOrdenados[pos * (-1) + 1]);
                datosOrdenados[pos * (-1)] = dato;   
            } else {
                do {
                    dato = toolsList.leerInt("Ingresa un valor menor a: '" + datosOrdenados[pos + 1] +
                            "'  mayor a: '" + datosOrdenados[pos - 1] + "'");
                } while (dato >= (Integer) datosOrdenados[pos + 1] && dato <= (Integer) datosOrdenados[pos - 1]);
                datosOrdenados[pos] = dato;
            }
        } else {
            do {
                dato = toolsList.leerInt("Ingresa un valor mayor a: " + datosOrdenados[pos - 1]);
            } while (dato <= (Integer) datosOrdenados[pos - 1]);
            datosOrdenados[pos] = dato;
        }
    }
    
    // Busqueda secuencial ordenada
    public int busquedaOrdenada(int dato) {
        byte i = 0;
        
        while (i <= posicion && (Integer)datosOrdenados[i] < dato) {
            i++;
        }
        return (i > posicion || (Integer)datosOrdenados[i] > dato)? - i : i;
    }
    
    public void eliminaDato(int pos) {
        for (int j = pos; j <= posicion; j++) {
            datosOrdenados[j]= datosOrdenados[j+1];
        }
        posicion--;
    }
    
    //Examen
    
    //1. dise�ar un metodo que modifique un valor en arreglo unidimencional que contiene datos ordenados
//   public static void modificarElemento(int arr[], int nuevoValor) {  	
//    	int pos = 0;
//        pos = busquedaOrdenada(nuevoValor);
//        
//        if(nuevoValor < p) {
//            if(nuevoValor <= (Integer)datos[0]) {
//                do {
//                    pos = pos * (-1);
//                    dato = toolsList.leerInt("Ingresa un valor menor a: " + datos[pos + 1]);
//                } while (dato >= (Integer) datos[pos * (-1) + 1]);
//                datos[pos * (-1)] = dato;   
//            } else {
//            do {
//                dato = toolsList.leerInt("Ingresa un valor mayor a: " + datos[pos - 1]);
//            } while (dato <= (Integer) datos[pos - 1]);
//            datos[pos] = dato;
//        }
    
    
    //Metodo que permita agregar datos de tipo entero a un arreglo bidimencional que contiene datos desordenados.
    
    
//    public static int addInt(int array[][]) {
//    	
//    
//    }
    
    public static int[][] eliminarValor(int[][] arreglo, int valorAEliminar) {
        int filas = arreglo.length;
        int columnas = arreglo[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (arreglo[i][j] == valorAEliminar) {
                    int[][] nuevoArreglo = new int[filas - 1][columnas];
                    int contador = 0;
                    for (int k = 0; k < filas; k++) {
                        if (k == i) {
                            continue;
                        }
                        nuevoArreglo[contador] = Arrays.copyOf(arreglo[k], columnas);
                        contador++;
                    }
                    return nuevoArreglo;
                }
            }
        }
        // Si no se encuentra el valor a eliminar, devuelve el arreglo original
        return arreglo;
    }    
}
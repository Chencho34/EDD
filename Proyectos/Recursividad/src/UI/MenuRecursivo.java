package UI;

import javax.swing.JOptionPane;

import Metodos.FuncionIterativa;
import Metodos.FuncionRecursiva;
import toolsList.toolsList;

public class MenuRecursivo {
	
	public static void menu() {
		String sel = "";
		int i, j, digit;

		do {
//			sel = toolsList.desplegable(sel);
			sel = toolsList.desplegableRecursivo();
			
//			sel = desplegable(sel);
			switch (sel) {
			case "funcionIterativa":
				i = toolsList.leerInt("Inicio del contador, ten en centa que se ejecuta hasta el 10");
				toolsList.imprimePantalla(FuncionRecursiva.funcionIterativa(i));
				break;
			case "funcionIterativa2":
				i = toolsList.leerInt("Inicio del contador: ");
				j = toolsList.leerInt("Ingresa limite del contador");
				toolsList.imprimePantalla(FuncionRecursiva.funcionIterativa2(i, j));
				break;
			case "funcionIterativa3":
				i = toolsList.leerInt("Inicio del contador: ");
				j = toolsList.leerInt("Ingresa limite del contador");
				toolsList.imprimePantalla(FuncionRecursiva.funcionIterativa2(i, j));
				break;
			case "tablaDeMultiplicar":
				digit = toolsList.leerInt("Digito de la tabla: ");				
				toolsList.imprimePantalla(FuncionRecursiva.multiplicationTable((byte) digit, (byte) 1));
				break;
			case "printArray":
				int array[] = {1,2,3,4,5,6,7,8,9,0};
				toolsList.imprimePantalla(FuncionRecursiva.printArrayRecursivo(array, 0));
				break;
			case "sumaDiviciones":
				digit = toolsList.leerInt("Ingresa dato");
				int sumaDiviciones = FuncionRecursiva.SumaDivi(digit, 1);
				toolsList.imprimePantalla("La suma de los divisores de " + digit + " es " + sumaDiviciones);
				break;
			case "decimalOctal":
				int decimal = toolsList.leerInt("Dato a convertir:");
				String octal = FuncionRecursiva.decimalToOctalRecursive(decimal);
				toolsList.imprimePantalla(decimal + " a octal es: " + octal);
				break;
			case "potencias":
				digit = toolsList.leerInt("Digito: ");
				int pow = toolsList.leerInt("potencia: ");
				int result = FuncionRecursiva.potencias(digit, pow);
				toolsList.imprimePantalla(digit + " potencia de " + pow + " = " + result);
				break;
			case "binarioDecimal":
				int binario = toolsList.leerInt("Ingresa binario");
				int binarioDecimal = FuncionIterativa.binarioAdecimal(binario);
				toolsList.imprimePantalla(binario + " a decimal: " + binarioDecimal);
				break;
			case "fibonacci":
				int ejecuciones = toolsList.leerInt("Veces en las que se ejecuta:");
				int f1 = toolsList.leerInt("Numero fibonacci");
				int f2 = toolsList.leerInt("Numero fibonacci2");
				toolsList.imprimePantalla(FuncionRecursiva.fibonacci(ejecuciones, f1, f2, 1, 1));
				break;
			case "ordenaBurbuja":
//				int arrayNumbers[] = {12,23,54,56,76,1,2,3,100,98};
//				toolsList.imprimePantalla("Array desordenado: \n" + FuncionRecursiva.printArrayRecursivo(arrayNumbers, 0));
//				String dato1 = FuncionRecursiva.burbujaIntercambio(arrayNumbers, 0, 0);
//				toolsList.imprimePantalla("a" + FuncionRecursiva.printArrayRecursivo(dato, 0));
				break;				
			case "showArray":
				int burbja2[] = {12,23,54,56,76,1,2,3,100};
				toolsList.imprimePantalla(FuncionRecursiva.printArrayRecursivo(burbja2, 0));
				break;
			case "factorial":
				int dato = toolsList.leerInt("Ingresa un dato");
				toolsList.imprimePantalla("Factorial de" + dato + " = " + FuncionRecursiva.factorialRecursive(dato, 1));
				break;
			default:
				JOptionPane.showMessageDialog(null,"Regresando al menu");
				break;
			}
		} while (!sel.equalsIgnoreCase("Volver"));
	}
}

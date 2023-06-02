package UI;
import javax.swing.JOptionPane;

import Metodos.FuncionIterativa;
import toolsList.toolsList;

public class MenuIterativo {
		
	public static void menu() {

		String sel = "";

		do {
			sel = toolsList.desplegableIterativo();
			switch (sel) {
			case "usoDoWhile":
				FuncionIterativa.useDoWhile(toolsList.leerInt("Indica un limite"));
				break;
			case "usoFor":
				FuncionIterativa.useFor(toolsList.leerInt("Indica un limite"));
				break;
			case "usoWhile":
				FuncionIterativa.useWhile(toolsList.leerInt("Indica un limite"));
				break;
			case "tablaDeMultiplicar":
				FuncionIterativa.multiplyTable(toolsList.leerByte("Tabla de multiplicar"));
				break;
			case "printArray":
				int array[] = {1,2,3,4,5,6,7,8,9,0};
				FuncionIterativa.printArray(array);
				break;
			case "sumaDiviciones":
				int sumaDiviciones = FuncionIterativa.SumaDiviciones(toolsList.leerInt("Ingresa dato"));
				toolsList.imprimePantalla("Respuesta: " + sumaDiviciones);
				break;
			case "decimalOctal":
				int decimal = toolsList.leerInt("Dato a convertir:");
				int octal = FuncionIterativa.decimalAOctal(decimal);
				toolsList.imprimePantalla(decimal + " a octal es: " + octal);
				break;
			case "potencias":
				int digit = toolsList.leerInt("Digito: ");
				int pow = toolsList.leerInt("potencia: ");
				int result = FuncionIterativa.potencias(digit, pow);
				toolsList.imprimePantalla(digit + " potencia de " + pow + " = " + result);
				break;
			case "binarioDecimal":
				int binario = toolsList.leerInt("Ingresa binario");
				int binarioDecimal = FuncionIterativa.binarioAdecimal(binario);
				toolsList.imprimePantalla(binario + " a decimal: " + binarioDecimal);
				break;
			case "fibonacci":
				int numeroEjecucion = toolsList.leerInt("Ingresa el numero de veces");
				toolsList.imprimePantalla(FuncionIterativa.fibonacci(numeroEjecucion));
				break;
			case "ordenaBurbuja":
				int burbja4[] = {12,23,54,56,76,1,2,3,100};
				toolsList.imprimePantalla("Array desordenado: " + FuncionIterativa.showArray(burbja4));
				FuncionIterativa.ordenaBurbuja(burbja4);
				toolsList.imprimePantalla("Array ordenado: " + FuncionIterativa.showArray(burbja4));
				break;
			case "showArray":
				int burbja2[] = {12,23,54,56,76,1,2,3,100};
				toolsList.imprimePantalla(FuncionIterativa.showArray(burbja2));
				break;
			case "factorial":
				int dato = toolsList.leerInt("Ingresa un dato");
				toolsList.imprimePantalla("Factorial de" + dato + " = " + FuncionIterativa.factorial(dato));
				break;
			default:
				JOptionPane.showMessageDialog(null,"Regresando al menu");
				break;
			}
		} while (!sel.equalsIgnoreCase("Volver"));
	}
}

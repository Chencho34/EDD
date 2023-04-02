package Metodos;

import toolsList.toolsList;

public class FuncionIterativa {

	public static void useFor(int limit) {
		for (int i = 1; i <= limit; i++) {
			toolsList.imprimePantalla("" + i);
		}
	}

	public static void useDoWhile(int limit) {
		String cad = "";
		int i = 1; 
		do {
			cad += "\nIncremento: " + i;
			i++;
		} while (i <= limit);
		toolsList.imprimePantalla(cad);
	}

	public static void useWhile(int limit) {
		String cad = "";
		int i = 1;
		while (i <= limit){
			cad += "\nIncremento: " + i;
			i++;
		}
		toolsList.imprimePantalla(cad);
	}

	public static void multiplyTable(byte number) {
		String table = "";
		for (int i = 1; i <= 10; i++) {
			table += number + " x " + i + " = " + (number * i) + "\n";
		}
		toolsList.imprimePantalla(table);
	}

	public static void printArray(int array[]) {
		String list = "";
		for (byte i = 0; i < array.length; i++) {
			list += i + "[" + array[i] + "]\n";
			toolsList.imprimePantalla("\n" + list);
		}
	}

	public static int SumaDiviciones(int dato) {
		int i = 1, suma = 0;
		do {
			if (dato % i == 0)
				suma += i;
				i++;
		} while (i < dato);
		return suma;
	}

	public static int decimalAOctal(int decimal) {
		int octal = 0, i = 1;
		while (decimal != 0) {
			octal += (decimal % 8) * i;
			decimal /= 8;
			i *= 10;
		}
		return octal;
	}

	public static int potencias(int digit, int pow) {
		int auxPow = digit;
		for (int i = 1; i < pow; i++) {
			auxPow *= digit;
		}
		return auxPow;
	}

	public static int binarioAdecimal(int binario) {
		int decimal = 0;
		int potencia = 0;
		while (binario != 0) {
			decimal += (binario % 10) * Math.pow(2, potencia);
			binario = binario / 10;
			potencia++;
		}
		return decimal;
	}
	
//	public static void binariodecimal(String num) {
//		int base = 1;
//		int res = 0;
//		for (int i = num.length() - 1; i > 0; i--) {
//			res += base;
//		}
//		base *= 2;
//	}

	public static String fibonacci(int contador) {
		int Fib1 = 0;
		int Fib2 = 1;
		String cad = "";
		int numero = 0;
		for (int i = 1; i <= contador; i++) {
			cad += "\n" + numero;
			numero = Fib1 + Fib2;
			Fib1 = Fib2;
			Fib2 = numero;
		}
		return cad;
	}

	public static void ordenaBurbuja(int datos[]) {
		int i, j, aux;

		for (i = 0; i < datos.length - 1; i++)
			for (j = i + 1; j < datos.length; j++) {
				if (datos[i] < datos[j]) {// canbia el orden mayor o menor
					aux = datos[i];
					datos[i] = datos[j];
					datos[j] = aux;
				}
			}
	}

	public static String showArray(int array[]) {
		String cad = "";
		for (int i = 0; i < array.length; i++) {
			cad += i + "[" + array[i] + "]" + "\n";
		}
		return cad;
	}
	
	public static double factorial(int dato) {
		double factorial = 1, i = 1;
		while(i <= dato) {
			factorial *= i;
			i++;
		}
		return factorial;
	}
	
	public static String decimalOctal(int dato) {
		String octal = "";
		while(dato != 0) {
			octal = dato % 0 + octal;
			dato/= 8;
		}
		return octal;
	}
	
	
	
	
	
	
	
	
	
	
	
}

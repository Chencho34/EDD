package Metodos;
//import toolsList.toolsList;

public class FuncionRecursiva {
	
	public static String funcionIterativa(int n) {
		return (n > 10) 
			? "" 
			: "incremento" + n + "\n" + funcionIterativa(n + 1);
			
	}

	public static String funcionIterativa2(int j, int n) {
		return (j <= n) 
			? "\nIncremento: " + j + funcionIterativa2(j + 1, n) 
			: "";
	}

	public static String funcionIterativa3(int j, int n) {
		return (j <= n) 
			? "\nIncremento" + j + funcionIterativa3(j + 1, n) 
			: "";
	}

	public static String multiplicationTable(byte num, byte i) {
		
		return (i <= 10) 
			? num + "*" + i + "=" + (num * i) + "\n" + multiplicationTable(num, (byte) (i + 1)) 
			: "";
	}

	
	public static String printArrayRecursivo(int[] array, int index) {
	    return (index >= array.length) 
	    	? "" 
	    	: index + "[" + array[index] + "]\n"  + printArrayRecursivo(array, index + 1);
	}

	
	public static int SumaDivi(int dato, int k) {
		int suma = 0;
		if (k < dato) {
			if (dato % k == 0)
				suma += k;
			return suma + SumaDivi(dato, (int) (k + 1));
		}
		return suma;
	}
	


	public static String ordenaBurbuja(int datos[], int i) {
		return (i < datos.length - 1) 
			? burbujaIntercambio(datos, i, i + 1) + ordenaBurbuja(datos, i + 1)
			: "";
	}

//	public static String burbujaIntercambio(int datos[], int i, int j) {
//		int aux = 0;
//		if (j < datos.length) {
//			if (datos[i] > datos[j]) {
//				aux = datos[i];
//				datos[i] = datos[j];
//				datos[j] = aux;
//			}
//			return burbujaIntercambio(datos, i, i + 1);
//		} else {
//			return "";
//		}
//	}
	
	public static String burbujaIntercambio(int datos[], int i, int j) {
		int aux = 0;
		if (j < datos.length) {
			if (datos[i] > datos[j]) {
				aux = datos[i];
				datos[i] = datos[j];
				datos[j] = aux;
			}

		}
		return burbujaIntercambio(datos, i, i + 1);
	}
	
	public static int potencias(int digit, int pow) {
	    return (pow == 0) 
	    	? 1 
	    	: digit * potencias(digit, pow - 1);	    
	}
	
	public static String fibonacci(int contador, int nfib1, int nfib2, int numero, int i){
        return (i<=contador) 
        	? "\n"+ numero+fibonacci(contador, nfib2, (nfib2+nfib1), (nfib1+nfib2), i+1)
        	: "";
    }
	
//	public static void imprimeOctal(int num) {
//		if(num <= 15) {
//			imprimeOctal(num + 1);
////			System.out.printf("%d El numero en octal es:" + num, num);
//			System.out.println("El numero " + num + " en octal es: " + num);
//		}
//	}
	
//	public static String printRecursivo(int j, int i) {
//		if (j <= i) {
//			return "\n" + j + " Octal: " + toOctal(0, 1, j) + printRecursivo(j + 1, i);
//		} else {
//			return "";
//		}
//	}
//	
//	public static int toOctal(int numOctal, int cont, int decimal) {
//			if(decimal != 0) {
//				return toOctal((numOctal + ((decimal % 8) * cont)), cont * 10, decimal / 8);
//			}			
//		return numOctal;
//	}	
	
	
	// DISEÑAR LOS SIGUIENTES METODOS:
	
	// METODO RECURSIVO QUE IMPRIMA DEL 1 AL 15 CON SU CORRESPONDIENTE VALOR EN OCTAL.	
	public static String toOctal(int numero) {
	    return (numero > 0) 
	    	? numero + " en octal: " + Integer.toOctalString(numero) + "\n" + toOctal(numero -1) 
	    	: "";  
	}
	
	// METODO QUE IMPRIMA DEL 1 AL 2O CON SU CORRESPONDIENTE VALOR EN FACTORIAL.
	public static String printFactorial(int numero, long factorial) {
	    return (numero <=  20) 
	    	? numero + "! = " + factorial + "\n" + printFactorial(numero + 1, factorial * (numero + 1)) 
	    	: "";	    
	}
	
	//----CALCULA FACTORIAL----//
	public static double factorialRecursive(int dato, int c) {
		if (dato == 0 || dato == 1) {
			return 1;
		} else {
			return (c <= dato) 
				? c * factorialRecursive(dato, c + 1) 
				: 1;
		}
	}
	
	//----IMPRIME LISTA FACTORIAL 1-15----//
	public static String listFactorial(int i) {
		return (i <= 15) 
			? i + " Factorial:" + factorialRecursive(i, 1) + "\n" + listFactorial(i + 1) 
			: "";
	}
	
	//----CALCULA DECIMAL A OCTAL----//
	public static String decimalToOctalRecursive(int decimal) {
		return (decimal != 0) 
			? Integer.toOctalString(decimal)
			: "";
	}
	
	//----IMPRIME LISTA OCTAL 1-20----//
	public static String listOctalRecursive(int i) {
		return (i <= 20) 
			? i + " Octal: " + decimalToOctalRecursive(i) + "\n" + listOctalRecursive(i + 1) 
			: "";
	}
}

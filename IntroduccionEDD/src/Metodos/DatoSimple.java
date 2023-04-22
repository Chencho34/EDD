package Metodos;

import Tools.toolsList;

public class DatoSimple {

	private Object datos[];
	private byte p;

	public DatoSimple(byte tam) {
		datos = new Integer[tam];
		p = -1;
	}

	public boolean validaVacio() {
		return (p == -1);
	}

	public void almacenarDato() {
		if (p < datos.length) {
			datos[p + 1] = toolsList.leerInt("Escribe un numero");
			p++;
		} else {
			toolsList.imprimeErrorMsg("Array lleno");
		}
	}

	public Object[] arreglo() {
		return datos;
	}

	public String imprimeDatos() {
		String cad = "";
		
		for (int i = 0; i <= p; i++) {
			cad += i + "[" + datos[i] + "]" + "\n";
		}
		return ("\n " + cad);
	}

	public byte busquedaSecuencial(Object val) {
		byte i = 0;

		while (i <= p && !val.equals(datos[i])) {
			i++;
		}
		return (i <= p) ? i : -2;
		// return(i<=p)? i: -2;
	}

	public void eliminaDato(int pos) {
		for (int j = pos; j <= p; j++) {
			datos[j] = datos[j + 1];
		}
		p--;
	}

	public int busquedaOrdenada(int[] datos, int dato) {
		byte i = 0;
		while (i < datos.length && (Integer) datos[i] < dato) {// Menor a mayor
			// while (i > datos.length && datos[i] > dato) Mayor a menor
			i++;
		}
		return (i > datos.length || (Integer) datos[i] > dato) ? -i : i;
	}
}

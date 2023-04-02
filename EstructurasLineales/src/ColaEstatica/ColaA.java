package ColaEstatica;

import tools.toolsList;

public class ColaA<T> {
	private T cola[];
	private byte u;
	
	@SuppressWarnings("unchecked")
	public ColaA(int max) {
		cola = (T[])(new Object[max]);
		u =- 1;
	}
	
	public boolean isEmpty() {
		return (u == -1);
	}
	
	public boolean isSpace() {
		return (u < cola.length-1);
	}
	
	public void push(T dato) {
		if (isSpace()) {
			u++;
			cola[u] = dato;
		} else {
			toolsList.imprimeErrorMsg("Estructura llena");
		}
	}
	
	public T pop() {
		T dato = cola[0];
		// invoca a corrimiento inmediato
		// Metodo de recorrer del tema 1
		
//		for (int i = 0; i <= dato.legth;i++) {
//			dato[i] = dato[i+1];
//		}
		
		u--;
		return dato;
	}
	
	public T peek() {
		return (T)cola[0];
	}
	
	public String toString() {
		return toString(0);
	}
	
	private String toString(int i) {
		return (i <= u)
			? "u ==> " + i + "[" + cola[i] + "]" + toString(i + 1) 
			: "";
	}
}

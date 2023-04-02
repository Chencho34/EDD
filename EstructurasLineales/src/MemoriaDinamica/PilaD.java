package MemoriaDinamica;

import PilaEstatica.PilaTDA;

public class PilaD<T> implements PilaTDA<T> {
	private Nodo pila;
	
	public PilaD() {
		pila = null;
	}
	
	public boolean isEmpty() {
		return (pila == null);
	}
	
	public void vaciar() {
		pila = null;
	}

	public void push(T dato) {
		Nodo tope = new Nodo(dato);
		if (isEmpty()) {
			pila = tope;
		} else {
			tope.sig = pila;
			pila = tope;
		}
	}

	public T pop() {
		T dato = (T) pila.getInfo();
		pila = pila.getSig();
		return dato;
	}
	
	public T peek() {
		return (T) (pila.getInfo());
	}
	
	public String toString() {
		Nodo tope = pila;
		return toString(tope);
	}
	
	private String toString(Nodo i) {
		return (i != null)
			? "Tope ==> " + "[" + i.getInfo() + "]\n" + toString(i.getSig())
			: "";
	}
	
}

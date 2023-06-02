package ARBOLBINARIO;

public class Nodito <T>{
	T info;
	
	public Nodito<T> izq;
	public Nodito<T> der;
	
	public Nodito(T dato) {
		this.info = dato;
		this.izq = null;
		this.der= null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodito<T> getIzq() {
		return izq;
	}

	public void setIzq(Nodito<T> izq) {
		this.izq = izq;
	}

	public Nodito<T> getDer() {
		return der;
	}

	public void setDer(Nodito<T> der) {
		this.der = der;
	}
}

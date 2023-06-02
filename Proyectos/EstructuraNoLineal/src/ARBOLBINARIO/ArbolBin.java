package ARBOLBINARIO;

public class ArbolBin<T> {

	private Nodito raiz;

	public ArbolBin() {
		raiz = null;
	}

	public Nodito getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodito raiz) {
		this.raiz = raiz;
	}

	public boolean arbolVacio() {
		return raiz == null;
	}
	
	public void vaciarArbol() {
		raiz = null;
	}

	public Nodito buscaPadre(Nodito actual, Nodito p) {
		Nodito padre = null;

		while (actual != null) {
			padre = actual;

			if ((int) p.info >= (int) padre.info)
				actual = padre.getDer();
			else
				actual = padre.getIzq();
		}
		return padre;
	}

	public void insertarArbol(T info) {
		Nodito p = new Nodito(info);

		if (arbolVacio()) {
			raiz = p;
		} else {
			Nodito padre = buscaPadre(raiz, p);
			if ((int) p.info >= (int) padre.info)
				padre.setDer(p);
			else
				padre.setIzq(p);
		}
	}

	public String preorden(Nodito r) {
		if (r != null) {
			return r.info + " - " + preorden(r.izq) + " - " + preorden(r.der);
		} else
			return " ";
	}

	public String posorden(Nodito r) {
		if (r != null) {
			return posorden(r.izq) + " - " + posorden(r.der) + " - " + r.info;
		} else
			return " ";
	}

	public String inorden(Nodito r) {
		if (r != null) {
			return inorden(r.izq) + " - " + r.info + " - " + inorden(r.der);
		} else
			return " ";
	}

	public String enorden(Nodito r) {
		if (r != null) {
			return enorden(r.der) + " - " + r.info + " - " + enorden(r.izq);
		} else
			return " ";
	}

	// public Nodito buscarDato (Nodito r, int dato) {
	//
	// while (r != null) {
	// if(r.getInfo().equals(dato)) {
	//
	// return r;
	// } else {
	// if(dato < r.getInfo()) {
	// r = r.getIzq();
	// } else {
	// r = r.getDer();
	// }
	// }
	// }
	// }

	public Nodito buscarDato(Nodito r, int dato) {
		while (r != null) {
			if (r.getInfo().equals(dato)) {
				return r;
			} else {
				int i = (int) r.info;

				if (dato > i) {
					r = r.getDer();
				} else {
					r = r.getIzq();
				}
			}
		}
		return r;
	}

	// public void imprimirArbol(Nodito nodo, String prefijo, boolean esIzquierdo) {
	// if (nodo != null) {
	// System.out.println(prefijo + (esIzquierdo ? "|--" : "|__") + nodo.info);
	// imprimirArbol(nodo.izq, prefijo + (esIzquierdo ? "| " : " "), true);
	// imprimirArbol(nodo.der, prefijo + (esIzquierdo ? "| " : " "), false);
	// }
	// }

	public static void printRecursive(Nodito node, int level) {
		if (node == null) return;
	
		printRecursive(node.der, level + 1);
		
		if (level != 0) {
				for (int i = 0; i < level - 1; i++) {
						System.out.print("|\t");
				}
				System.out.println("|-------" + node.info);
		} else {
				System.out.println(node.info);
		}
		printRecursive(node .izq, level + 1);
}

	public void imprimirArbol(Nodito nodo, String prefijo, boolean esUltimo) {
		if (nodo == null) {
			return;
		}

		imprimirArbol(nodo.der, prefijo + (esUltimo ? "    " : "|   "), false);

		System.out.print(prefijo);
		System.out.print(esUltimo ? "|__" : "|--");
		System.out.println(nodo.info);

		imprimirArbol(nodo.izq, prefijo + (esUltimo ? "|   " : "    "), true);
	}

	// public void imprimirHojas(Nodito nodo) {
	// if (nodo != null) {
	// if (nodo.izq == null && nodo.der == null) {
	// System.out.print(nodo.info + " ");
	// }
	// imprimirHojas(nodo.izq);
	// imprimirHojas(nodo.der);
	// }
	// }

	public String imprimirHojas(Nodito nodo) {
		String cad = "";
		if (nodo != null) {
			if (nodo.izq == null && nodo.der == null) {
				cad = nodo.info + " ";
			}
			return cad + imprimirHojas(nodo.izq) + imprimirHojas(nodo.der);
		} else {
			return "";
		}
	}

	public String imprimirInteriores(Nodito nodo) {
		String cad = "";
		if (nodo != null) {
			
			if (nodo.izq != null || nodo.der != null) {
				if(nodo.info!=raiz.info)
				cad = nodo.info + " ";
			}
			return cad + imprimirInteriores(nodo.izq) + imprimirInteriores(nodo.der);
		} else {
			return "";
		}
	}

	// public int obtenerAltura(Nodito nodo) {
	// if (nodo == null) {
	// return 0;
	// } else {
	// int alturaIzq = obtenerAltura(nodo.izq);
	// int alturaDer = obtenerAltura(nodo.der);
	// return Math.max(alturaIzq, alturaDer) + 1;
	// }
	// }

	public int obtenerAltura(Nodito nodo) {
		return (nodo != null)
				? Math.max(obtenerAltura(nodo.izq), obtenerAltura(nodo.der)) + 1
				: 0;
	}
}

package DobleLiga;

import MemoriaDinamica.Nodo;
import OperacionesListas.Operaciones;

public class DatosDesordenadosDobleLiga <T> implements Operaciones<T>{

	private Nodito puntero;
	private Nodito f;
	
	public DatosDesordenadosDobleLiga() {
		puntero=null;
	}

	@Override
	public boolean isListaVacia() {
		
		return (puntero==null);
	}

	@Override
	public void inserFrente(T dato) {
		Nodito p=new Nodito(dato);
		if (isListaVacia()) puntero=p;
		else {
			p.der=puntero;
			puntero.izq=p;
			puntero=p;
		}
		
	}

	@Override
	public void inserFinal(T dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminaLista(Nodo i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nodo busSecLista(T dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String imprimeLista() {
		String cad="";
		for(Nodito j=f;j!=null;j=j.izq)
			cad+=j.info+"==>";
		cad="\n";
		for(Nodito j=puntero;j!=null;j=j.der)
			cad+=j.info+"==>";
			return cad;
	}

	@Override
	public void vaciarLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nodo BusAnterior(Nodo i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

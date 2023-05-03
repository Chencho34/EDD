package OperacionesListas;

import MemoriaDinamica.Nodo;
import tools.toolsList;

public class DatosDesordenados <T> implements Operaciones<T> {
private Nodo inicio;
private Nodo f;


	public DatosDesordenados() {
		inicio=null;
	}
	@Override
	public boolean isListaVacia() {
		return(inicio==null);
	}

	public void vaciarLista()
	{
		inicio=null;
	}
	
	@Override
	public void inserFrente(T dato) {
		Nodo p=new Nodo(dato);
		if(isListaVacia()) {inicio=p;f=p;}
		else
		{
			p.sig=inicio;
			inicio=p;
		}
	}

	
	@Override
	public void inserFinal(T dato) {
		Nodo p=new Nodo(dato);
		if(isListaVacia()) inicio=p;
		else
		{
			f.sig=p;
		}
		f=p;
	}

	@Override
	public void eliminaLista(Nodo i ) {
		if (i==inicio)
		{
			inicio=inicio.sig;
			i=null;
		}
		else {
			Nodo antes=BusAnterior(i);
			if (i==f) {
				f=antes;
				f.sig=null;
				i=null;
			}
			else {
				antes.sig=i.sig;
				i=null;
			}
		}
		
	}
	public void modificar(Nodo existe) {
		existe.setInfo(toolsList.leerInt("Nuevo valor"));
	}

	@Override
	public Nodo busSecLista(T dato) {
		Nodo i=inicio;
		while (i.sig!=null && dato!=i.getInfo())
		i=i.sig;
		return(i!=null)?i:null;
		
	}

	@Override
	public String imprimeLista() {
		String cad="";
		for (Nodo i=inicio; i!=null;i=i.getSig()) {
			cad+=i.getInfo()+"-->\n";
		}
		return cad;
	}
	
	public Nodo BusAnterior( Nodo i ) {
		Nodo antes = inicio;
		while (i != antes.getSig())
		antes = antes.getSig();
		return antes;
	}
	
	public void ordenar() {
		Nodo aux = new Nodo(0);
		
		Nodo m,n;
	     for (m=inicio; m!=null ;m=m.getSig()) 
	       for(n=m.sig; n!=null ;n=n.getSig()) 
		   if((Integer)m.getInfo()>(Integer)n.getInfo()) { 
		    aux.info=m.info; 
		    m.info=n.info;
		    n.info=aux.info;
		}
	  
	}

//	public Nodo busSecLista(T dato) {
//		Nodo i=inicio;
//		while (i!=null && dato!=i.getInfo());
//		i=i.sig;
//		return(i!=null)?i:null;
//	} 
    
	
}

package ColaEstatica;
import MemoriaDinamica.Nodo;
public class ColaD<T> implements ColaTDA<T> {
	private Nodo cola;
	private Nodo f;
	public ColaD()
	{
		cola=null;
	}
	
	public boolean isEmptyCola()
	{
		return (cola==null);
	}
	
	public void pushCola(T dato) {
		Nodo u=new Nodo(dato);
		if(isEmptyCola())
			      cola=u;
		else
		{
			f.sig=u;
		}
		    f=u;
	}
	
	public T popCola()
	{
		Nodo u=cola;
		T dato=(T) cola.getInfo();
		cola=cola.getSig();
		u=null;
		return dato;
	}
	
	public T peekCola()
	{
		return (T) (cola.getInfo());
	}
	public void freeCola()
	{
		cola=null;
		f=null;
	}
	
	public String toString() {
		Nodo u=cola;
		return toString(u);
	}
	
	private String toString(Nodo i) {
		return (i!=null)?"tope ===>"+"["+i.getInfo()+"]\n"+toString(i.getSig()):"";
	}	
}



}

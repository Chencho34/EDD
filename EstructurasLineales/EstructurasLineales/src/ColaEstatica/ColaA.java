package ColaEstatica;

import tools.toolsList;

public class ColaA<T> implements ColaTDA<T> {

	private T cola[];
	private byte u;
	
	public ColaA(int max)
	{
		cola=(T[]) (new Object [max]);
		u=-1;
	}
	
	public boolean isEmptyCola()
	{
		return (u==-1);
	}
	
	public boolean isSpace()
	{
		return (u<cola.length-1);
	}
	
	public void pushCola(T dato)
	{
		if(isSpace())
		{
			u++;
			cola[u]=dato;
		}
		else 
			toolsList.imprimeErrorMsg("Estructura cola llena");
	}
	
	public T popCola() {
		T dato= cola[0];
		//metodo de corrimiento inmediatos
		// metodo de reccorer del tema 1
		 for(int u= +1; u>cola; u--) {
	            cola[u] = cola[u-1];
	        }
		u--;
		return dato;
	}
	
	public T peekCola() {
		return (T)cola[0];
	}
	
	public String toString() {
		return toString(u);
	}
	
	private String toString(int i) {
		return (i<=0)?"u ==>"+i+"["+cola [i]+"]"+toString(i+1):"";
	}
	
}

package MemoriaDinamica;

import PilaEstatica.PilaTDA;

public class PilaD<T>  implements PilaTDA<T>  {
	private Nodo;
	
    
  public  PilaD() {
	  pila=new Nodo();
	   
  }
  
  
  public void vaciar() {
	  pila=null;
  }
  
 public void push(T dato) {
	 Nodo tope=new Nodo (dato);
	 if (isEmpty())pila=tope;
	 else
	 
	 {tope.sig=pila;
	 pila=tope; 
	 }
 }
 
 public T pop()
 {
	 T dato=(T) pila.getInfo();
	 pila=pila.getSig();
	 return dato;
 }
 
 public  T peek()
 {
	 return (T) (pila.getInfo());
 }
 
 public String toString() {
	 Nodo tope=pila;
	 return toString(tope);
	 
	 private String toString(int i) {
			return (i!=0)?"\n"+"tope ==>"+"["+i.getInfo()+"\n"+toString(i.getSig()):"";
		}
	 
 }
 
}

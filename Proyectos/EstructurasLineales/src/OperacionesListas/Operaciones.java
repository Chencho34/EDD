package OperacionesListas;
import MemoriaDinamica.Nodo;
public interface Operaciones<T> {
	public boolean isListaVacia();
	public void inserFrente(T dato);
	public void inserFinal(T dato);
	public void eliminaLista(Nodo i);
	public Nodo busSecLista(T dato);
	public String imprimeLista();
	public void vaciarLista();
	public Nodo BusAnterior(Nodo i);
}

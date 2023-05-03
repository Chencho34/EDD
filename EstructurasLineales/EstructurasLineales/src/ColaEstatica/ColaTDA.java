package ColaEstatica;

public interface ColaTDA<T> {
	
	public boolean isEmptyCola();
	public void pushCola(T dato);
	public T popCola();
	public T peekCola();

}

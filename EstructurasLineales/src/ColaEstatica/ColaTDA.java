package ColaEstatica;

public interface ColaTDA<T> {
	
	public boolean isEmpty();
	public void push(T dato);
	public T pop();
	public T peek();
}
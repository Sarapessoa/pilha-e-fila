package fila;

public interface Lista<E> {

	public void push(E elemento);

	public void pop();
	
	public boolean isEmpty();
	
	public E peek();

	public void show();

	public int size();

	public void clear();

}

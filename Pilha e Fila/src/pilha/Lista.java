package pilha;

public interface Lista<E> {

	public void push(E elemento);

	public void pop();

	public void show();
	
	public E top();

	public int size();

	public void clear();

}

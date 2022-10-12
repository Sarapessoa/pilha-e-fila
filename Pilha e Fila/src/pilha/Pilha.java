package pilha;

public class Pilha<E> implements Lista<E> {
	
	private No topo;
	private int cont;
	
	public Pilha() {
		topo = null;
		cont = 0;
	}

	@Override
	public void push(E elemento) {
		
		No novo = new No(elemento);
		
		if(topo == null) {
			novo.proximo = null;
			topo = novo;
		}
		else {
			novo.proximo = topo;
			topo = novo;
		}
		
		cont++;
		
	}

	@Override
	public void pop() {
		
		if(topo != null) {
			topo = topo.proximo;
			cont--;
		}
		
	}

	@Override
	public void show() {
		No ponteiro = topo;
		
		while(ponteiro != null) {
			System.out.println(ponteiro.dado);
			ponteiro = ponteiro.proximo;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E top() {
		
		return (E) topo.dado;
	}

	@Override
	public int size() {
		return cont;
	}

	@Override
	public void clear() {
		topo = null;
		cont = 0;
		
	}
	
	private class No {
		Object dado;
		No proximo;
		
		No(Object dado){
			this.dado = dado;
			proximo = null;
		}
	}


}


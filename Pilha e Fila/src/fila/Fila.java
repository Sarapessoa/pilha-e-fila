package fila;

public class Fila<E> implements Lista<E> {
	private No topo;
	private No fim;
	private int cont;
	
	public Fila() {
		topo = null;
		fim = null;
		cont = 0;
	}
	
	//Adicionar elemento no fim da fila

	@Override
	public void push(E elemento) {
		
		No novo = new No(elemento);
		
		if(isEmpty()) {
			novo.proximo = null;
			topo = novo;
			fim = novo;
			
		} else {
			novo.proximo = null;
			fim.proximo = novo;
			fim = novo;
		}
		
		cont++;
		
	}
	
	//Remover elemento do topo da lista

	@Override
	public void pop() {
		
		if(topo != null) {
			topo = topo.proximo;
			cont--;
		}
		
	}
	
	//Verificar se a fila está vazia
	
	@Override
	public boolean isEmpty() {
		
		if(cont == 0) {
			return true;
		}
		
		return false;
		
	}
	
	//Retornar o elemento no Topo da fila
	
	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		
		return (E) topo.dado;
		
	}
	
	//Exibir a fila

	@Override
	public void show() {

		No ponteiro = topo;
		
		while(ponteiro != null) {
			System.out.println(ponteiro.dado);
			ponteiro = ponteiro.proximo;
		}
		
	}
	
	//Retornar o tamanho da fila

	@Override
	public int size() {
		return cont;
	}

	@Override
	public void clear() {
		cont = 0;
		topo = null;
		fim = null;
		
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

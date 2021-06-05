package edu.escuelaing.arsw.lista;

public class Nodo<E> {
	private E data;
	private Nodo<E> next = null;
	private Nodo<E> prior = null;

	/**
	 * Constructor de la clase Nodo.
	 * @param data ingresa la información que se va a almacenar en este nodo.
	 */
	public Nodo(E data) {
		this.data = data;
	}

	/***
	 * Actualiza la información que almacena este nodo.
	 * @param data La nueva información que se va a almacenar en este nodo.
	 */
	public void setData(E data) {
		this.data = data;
	}

	/**
	 * Actualiza cual es el nodo siguiente del nodo actual.
	 * @param next El nuevo nodo siguiente al nodo actual
	 */
	public void setNext(Nodo<E> next) {
		this.next = next;
	}

	/**
	 * Obtiene la información que almacena este nodo.
	 * @return Datos del nodo
	 */
	public E getData() {
		return data;
	}

	/**
	 * Obtiene cual es el nodo siguiente del nodo actual.
	 * @return El nodo siguiente al nodo actual.
	 */
	public Nodo<E> getNext() {
		return next;
	}

	/**
	 * Obtiene el anterior nodo del nodo actual.
	 * @return El anterior nodo del nodo actual.
	 */
	public Nodo<E> getPrior() {
		return prior;
	}

	/**
	 * Actualiza cual es el nodo anterior del nodo actual.
	 * @param prior El nuevo nodo anterior al nodo actual.
	 */
	public void setPrior(Nodo<E> prior) {
		this.prior = prior;
	}
}

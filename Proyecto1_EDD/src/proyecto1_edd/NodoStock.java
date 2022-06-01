/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_edd;

/**
 *
 * @author fabba
 */
public class NodoStock {
    private NodoStock siguiente;
    private Object element;
    private int cantidad;

    public NodoStock(Object element, int cantidad) {
        this.siguiente = null;
        this.element = element;
        this.cantidad = cantidad;
    }

    /**
     * @return the siguiente
     */
    public NodoStock getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoStock siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

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
public class NodoAlmacen {
    private String nombre;
    private ListaStock cosas;
    private NodoAlmacen siguiente;    

    public NodoAlmacen(String nombre, ListaStock cosas) {
        this.nombre = nombre;
        this.cosas = cosas;
        this.siguiente = null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cosas
     */
    public ListaStock getCosas() {
        return cosas;
    }

    /**
     * @param cosas the cosas to set
     */
    public void setCosas(ListaStock cosas) {
        this.cosas = cosas;
    }

    /**
     * @return the siguiente
     */
    public NodoAlmacen getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoAlmacen siguiente) {
        this.siguiente = siguiente;
    }
}

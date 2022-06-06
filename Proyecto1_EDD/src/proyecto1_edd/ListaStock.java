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
public class ListaStock {
    private int size;
    private NodoStock first;
    private NodoStock last;

    public ListaStock() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }
    
    public boolean isVacio(){
        return first == null;
    }
    
    public NodoStock devolverNodo(int ans){
        if(ans != 1){
            NodoStock aux = first;
            for (int i = 0; i < ans; i++) {
                aux = aux.getSiguiente();
            }
            return aux;
        }else{
            return first;
        }
    }
    
    public void imprimir(){
        if(isVacio()){
            System.out.println("La lista está vacía");
        }else{
            NodoStock aux = first;
            System.out.print("\n");
            for(int i = 0; i < size; i++){
                System.out.println((i+1) + ". " + aux.getElement() + ": " + aux.getCantidad());
                aux = aux.getSiguiente();
            }
            System.out.print("\n");
        }
    }
    
    public void insertarFinal(Object dato, int cantidad){
        NodoStock nuevo = new NodoStock(dato, cantidad);
        
        if(isVacio()){
            first = nuevo;
            last = nuevo;
            size++;
        }else{
            last.setSiguiente(nuevo);
            last = nuevo;
            size++;
        }
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the first
     */
    public NodoStock getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(NodoStock first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public NodoStock getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoStock last) {
        this.last = last;
    }
    
    
}

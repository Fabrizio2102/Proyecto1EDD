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
public class ListaAlmacen {
    private int size;
    private NodoAlmacen first;
    private NodoAlmacen last;

    public ListaAlmacen() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }
    
    public boolean isVacio(){
        return first == null;
    }
    
    public void imprimirNombre(){
        if(isVacio()){
            System.out.println("La lista está vacía");
        }else{
            NodoAlmacen aux = first;
            System.out.print("\n");
            for(int i = 0; i < size; i++){
                System.out.println((i+1) + ". " + aux.getNombre());
                aux = aux.getSiguiente();
            }
            System.out.print("\n");
        }
    }  
    
    public void imprimirCosas(){
        int k = 1;
        if(isVacio()){
            System.out.println("La lista está vacía");
        }else{
            NodoAlmacen aux = first;
            System.out.print("\n");
            for(int i = 0; i < size; i++){
                NodoStock aux2 = aux.getCosas().getFirst();
                for (int j = 0; j < aux.getCosas().getSize(); j++) {
                    System.out.println(k + ". " + aux2.getElement() + ": " + aux2.getCantidad());
                    aux2 =aux2.getSiguiente();
                    k++;
                }
                aux = aux.getSiguiente();
            }
            System.out.print("\n");
        }
    }
    
    public void insertarFinal(String name, ListaStock listica){
        NodoAlmacen nuevo = new NodoAlmacen(name, listica);
        
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
    public NodoAlmacen getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(NodoAlmacen first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public NodoAlmacen getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoAlmacen last) {
        this.last = last;
    }
}

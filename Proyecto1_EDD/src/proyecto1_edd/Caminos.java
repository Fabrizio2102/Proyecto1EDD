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
public class Caminos {

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
     * @return the ruta
     */
    public int[][] getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(int[][] ruta) {
        this.ruta = ruta;
    }
   private int size;
   private int[][] ruta;

    public Caminos(int size, int[][] ruta) {
        this.size = size;
        this.ruta = ruta;
    }
}

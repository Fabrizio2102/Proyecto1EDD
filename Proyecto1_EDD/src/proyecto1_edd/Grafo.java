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
public class Grafo {
    private int maxNodos;
    private int numVertices;
    private int matrizAdy [][];

    public Grafo() {
        maxNodos = numVertices = 0;
    }
    
    public Grafo(int n) {
        maxNodos = n;
        numVertices = 0;
        matrizAdy = new int [n][n];
    }
    
    public void insertarArista(int i, int j, int peso){
        matrizAdy[i][j] = peso;
    }
    
    public void eliminarArista(int i, int j){
        matrizAdy[i][j] = 0;
    }
    
    public boolean isFull(){
        return numVertices == maxNodos;
    }
    
    public void imprimirGrafo(){
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdy[i][j] + "  ");
                if(j == numVertices-1){
                    System.out.println("");
                }
            }
        }
    }
    
    public void insertarVertice(){
        if(isFull()){
            System.out.println("Error. Se alcanzó el número de almacenes máximos");
        }else{
            for (int i = 0; i < numVertices + 1; i++) {
                for (int j = numVertices; j < numVertices + 1; j++) {
                    matrizAdy[i][j] = matrizAdy[j][i] = 0;
                }
            }
            numVertices++;
        }
    }

    /**
     * @return the maxNodos
     */
    public int getMaxNodos() {
        return maxNodos;
    }

    /**
     * @param maxNodos the maxNodos to set
     */
    public void setMaxNodos(int maxNodos) {
        this.maxNodos = maxNodos;
    }

    /**
     * @return the numVertices
     */
    public int getNumVertices() {
        return numVertices;
    }

    /**
     * @param numVertices the numVertices to set
     */
    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    /**
     * @return the matrizAdy
     */
    public int[][] getMatrizAdy() {
        return matrizAdy;
    }

    /**
     * @param matrizAdy the matrizAdy to set
     */
    public void setMatrizAdy(int[][] matrizAdy) {
        this.matrizAdy = matrizAdy;
    }
}

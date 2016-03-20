/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy2_compi;

/**
 *
 * @author andychava
 */
public class NodoE {

   public String Linea,columna,error,Archivo,tipo;
   public NodoE sig;

    public NodoE(String Linea, String columna, String error,String tipo, String Archivo) {
        this.Linea = Linea;
        this.columna = columna;
        this.error = error;
        this.tipo = tipo;
        this.Archivo = Archivo;
        this.sig = null;
    }

    
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy2_compi;

/**
 *
 * @author andy28
 */
public class nodoS {
    public String Simbolo,archivo;
    nodoS sig;
    public nodoS(String Simbolo, String archivo) {
        this.Simbolo = Simbolo;
        this.archivo = archivo;
        sig =null;
    }
    
    
}

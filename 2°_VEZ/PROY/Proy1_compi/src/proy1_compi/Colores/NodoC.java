/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1_compi.Colores;

/**
 *
 * @author andychava
 */
public class NodoC {
    
  public  String escenario; 
  public  String nombre;
  public  String hex;
  public  String r;
   public NodoC sig;

    public NodoC(String escenario, String nombre, String hex,String r ) {
        this.escenario = escenario;
        this.nombre = nombre;
       this.hex = hex;
       this.r = r;
      
        sig = null;
    }
    
    
    
}

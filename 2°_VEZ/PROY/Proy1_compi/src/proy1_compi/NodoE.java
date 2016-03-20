/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1_compi;

/**
 *
 * @author andychava
 */
public class NodoE {

   public String nombre,tipo,image,color,hex,cuadro,dime,escenario;
   public NodoE sig;

    public NodoE(String escenario,String nombre, String tipo, String image, String color,String hex ,String cuadro, String dime) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.image = image;
        this.color = color;
        this.hex = hex;
        this.cuadro = cuadro;
        this.dime = dime;
        this.escenario = escenario;
        sig =null;
    }
    
    
    
}

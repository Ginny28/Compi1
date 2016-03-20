/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1_compi.Paint;

/**
 *
 * @author andychava
 */
public class NodoP {
    String escenario,color,posX,posY;
    NodoP sig;

    public NodoP(String escenario, String color, String posX, String posY) {
        this.escenario = escenario;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
        sig = null;
    }

    
}

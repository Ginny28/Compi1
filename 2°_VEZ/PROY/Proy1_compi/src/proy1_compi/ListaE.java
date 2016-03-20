/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1_compi;

/**
 *
 * @author andychava
 */
public class ListaE {
    
 public  NodoE primero;
   NodoE last;

    public ListaE() {
        primero =null;
        last = null;
    }
   
   public  void insertar(String escenario,String nombre, String tipo, String image, String color, String hex,String cuadro, String dime)
   {
       NodoE novo = new NodoE(escenario,nombre, tipo, image, color, hex , cuadro, dime);
       
       if (primero== null)
       {
           primero = novo;
           last = novo;
       }
       else
       {
       last.sig = novo;
       last = novo;
       
       }
   
   }
    
public void deletes()
{
NodoE n = primero;

if(n!=null)
{
    primero = null;

}


}
    
}

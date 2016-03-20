/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1_compi.Paint;

/**
 *
 * @author andychava
 */
public class ListaP {
    NodoP primero,last;

    public ListaP() {
        primero = null;
        last = null;
    }
    
    
    
    
    
       public  void insertar(String escenario,String color,String posX, String PosY )
   {
       NodoP novo = new NodoP(escenario, color, posX, PosY);
       
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
NodoP n = primero;

if(n!=null)
{
    primero = null;

}


}
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1_compi.Colores;

/**
 *
 * @author andychava
 */
public class ListaC {
  public  NodoC primero,last;

    public ListaC() {
        primero=null;
        last = null;
    }
    
    
    
    
      public  void insertar(String escenario,String color,String hex, String r )
   {
       NodoC novo = new NodoC(escenario, color, hex, r);
       
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
NodoC n = primero;

if(n!=null)
{
    primero = null;

}


}

      
    
}

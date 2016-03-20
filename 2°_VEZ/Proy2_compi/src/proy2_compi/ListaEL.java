/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy2_compi;

/**
 *
 * @author andychava
 */
public class ListaEL {
    
 public  NodoE primero;
   NodoE last;

    public ListaEL() {
        primero =null;
        last = null;
    }
   
public  void insertar(String li,String colu,String erro,String tipo,String pasta)
{
       NodoE novo = new NodoE(li,colu,erro,tipo,pasta);
       
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

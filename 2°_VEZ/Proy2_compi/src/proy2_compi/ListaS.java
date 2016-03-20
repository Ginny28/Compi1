/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy2_compi;

/**
 *
 * @author andy28
 */
public class ListaS {
   public  nodoS primero;
   nodoS last;

    public ListaS() {
        primero =null;
        last=null;
    }
   public  void insertar(String simbolo,String arquivo)
{
       nodoS novo = new nodoS(simbolo,arquivo);
       
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
   
}

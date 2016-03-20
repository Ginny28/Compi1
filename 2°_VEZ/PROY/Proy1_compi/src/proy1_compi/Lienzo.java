package proy1_compi;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychava
 */
public class Lienzo extends JPanel{
    
    private JLabel [][] labe;
    private  int filas;

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }
    private int colum;

    public Lienzo() {
          
        
        this.setBackground(Color.WHITE);
       
        this.setLayout(new BorderLayout());                
        
    }
    
    
    
    
    
    
    public void madeit ()
    {
        
       labe = new JLabel[filas][colum];
        for (int i = 0; i <filas ;i++) 
          {
          for (int j =0 ; j<colum; j++)
          {
              System.out.println(j);
              labe[i][j] = new JLabel();
              labe[i][j].setLayout(new BorderLayout());
              labe[i][j].setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, false));
             // labe[i][j].setSize(10, 10);
              labe[i][j].setBounds(i*20, j*20, 20, 20);
                     
              this.add(labe[i][j]);
              
          }  
          
       }
    }
    
    
}

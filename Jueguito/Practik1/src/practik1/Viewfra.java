/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Viewfra.java
 *
 * Created on 7/02/2012, 10:43:22 PM
 */


package practik1;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.applet.Applet;
import java.awt.Desktop;
import java.net.URL;
import practik1.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andychaw
 */
public class Viewfra extends javax.swing.JFrame {
   
 JButton fondo = new JButton();
 nueva veni = new nueva();
 String nombre;

String dire = System.getProperty("user.dir")+System.getProperty("file.separator") ;
ImageIcon picu;
int baj;
int alt;
int bonus = 0;
int bo,str,la= 0;
int laki= 0;
int street= 0;
int total= 0;

 Yylex lexi;
 movin movs;
 JButton[][] labe;
 int x = 0;
 int y = 0;
 int bx=0;
 int by=0;
 int corx= 0;
 int cory= 0;
int tamañox= 0;
int tamañoy=0;
Thread pasito;

  
    public Viewfra() {
        initComponents();
      Dimension dime = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(dime);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practik_1 :D");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("cReAtE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setText("Move!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practik1/Imagencitas/logo.jpg"))); // NOI18N

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed1(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed1(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Save as");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Mistakes Maze");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Mistakes Moves");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Stadistics");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Exit");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("User Manual");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Technical Manual");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Help");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(26, 26, 26)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
       veni.setVisible(true);
        dispose();   
        
}//GEN-LAST:event_jMenuItem1ActionPerformed

public void make_pics(){
    //1er ima
     ImageIcon fot = new ImageIcon((dire +"/src/practik1/Imagencitas/Mayin.jpg"));
                Image imagen= fot.getImage();
                BufferedImage resizedImage = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(imagen, 0, 0, baj-3,alt-3,null);
                g.dispose();
            try {
                ImageIO.write(resizedImage, "jpg", new File(dire +"src/practik1/epa/mari.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }
      //2da ima
      ImageIcon cam = new ImageIcon((dire +"/src/practik1/Imagencitas/street.jpg"));
                Image cami= cam.getImage();
                BufferedImage c = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g1 = c.createGraphics();
                g1.drawImage(cami, 0, 0, baj-3,alt-3,null);
                g1.dispose();
            try {
                ImageIO.write(c, "jpg", new File(dire+ "src/practik1/epa/cay.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }
       //3er ima
       ImageIcon pts = new ImageIcon((dire +"/src/practik1/Imagencitas/1up.jpg"));
                Image puntits= pts.getImage();
                BufferedImage co = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g2 = co.createGraphics();
                g2.drawImage(puntits, 0, 0, baj-3,alt-3,null);
                g2.dispose();
            try {
                ImageIO.write(co, "jpg", new File(dire +"/src/practik1/epa/bns.jpg"));
                }
            catch (IOException ex)
                {

                }
        //4ta ima
         ImageIcon bl = new ImageIcon((dire +"/src/practik1/Imagencitas/block.jpg"));
                Image blk= bl.getImage();

                BufferedImage b = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g3 = b.createGraphics();
                g3.drawImage(blk, 0, 0, baj-3,alt-3,null);
                g3.dispose();
            try
                {
                ImageIO.write(b, "jpg", new File(dire +"/src/practik1/epa/blks.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }
        //5ta ima
        ImageIcon jdr = new ImageIcon((dire +"/src/practik1/Imagencitas/Lakitu.jpg"));
                Image jd= jdr.getImage();
                BufferedImage jds = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g4 = jds.createGraphics();
                g4.drawImage(jd, 0, 0, baj-3,alt-3,null);
                g4.dispose();
            try {
                ImageIO.write(jds, "jpg", new File(dire +"/src/practik1/epa/jdr.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }
         //6ta ima
         ImageIcon fn = new ImageIcon((dire +"/src/practik1/Imagencitas/peach.jpg"));
                Image fni = fn.getImage();
                BufferedImage fs = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g5 = fs.createGraphics();
                g5.drawImage(fni, 0, 0, baj-3,alt-3,null);
                g5.dispose();
            try {
                ImageIO.write(fs, "jpg", new File(dire +"/src/practik1/epa/final.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }

}



public void Make_Maze(){

    
   String object;
   char charis;
   Object[] charss;

   // int stado = 0;
     int totaltam= tamañox * tamañoy;

     charss= lexi.Bonito.toArray();
if ((totaltam*2) == lexi.Bonito.size()) {

for (int memp = 0; memp<charss.length;memp++)
    {
            object = charss[memp].toString();
            charis = object.charAt(0);         

    
switch(charis){
        case 'i':
               
                labe[y][x].removeAll();
                labe[y][x].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                labe[y][x].repaint();
                corx = y;
                cory = x;
                total ++;

                x= x+1;
                break;
        case ',':
                    System.out.println("pasar");
                    break;
        case 'c':
                
                labe[y][x].removeAll();
                labe[y][x].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                labe[y][x].repaint();
                x= x+1;
                total ++;
                break;
        case 'b':
                
               //labe[y][x].removeAll();
                
                //labe[y][x].setIcon(new ImageIcon(""));
                labe[y][x].setIcon(new ImageIcon((dire +"/src/practik1/epa/bns.jpg")));
                labe[y][x].repaint();
                x= x+1;
                bx= y;
                by= x;
                total ++;
                break;
       case 'p':
               
                labe[y][x].removeAll();
                labe[y][x].setIcon(new ImageIcon((dire +"/src/practik1/epa/blks.jpg")));
                labe[y][x].repaint();
                x= x+1;

                break;
       case 'o':
                
                labe[y][x].removeAll();
                labe[y][x].setIcon(new ImageIcon((dire +"/src/practik1/epa/jdr.jpg")));
                labe[y][x].repaint();
                x= x+1;
                 total ++;
                break;
       case ';':
                x= 0;
                y= y+1;
                break;
       case 'f':
                
                labe[y][x].removeAll();
                labe[y][x].setIcon(new ImageIcon((dire +"/src/practik1/epa/final.jpg")));
                labe[y][x].repaint();
                x= x+1;
                 total ++;
                break;
            }
    }}
       else
         {
            JOptionPane.showMessageDialog(jPanel1,"El Archivo no Coincide con el tamaño de la matriz , cargue otra archivo:p");
         }
         lexi.Bonito.clear();


    }

public  void Make_mazearc(){
 try {
            FileWriter fws = new FileWriter("Archivo_Laberinto.txt");
            BufferedWriter bw = new BufferedWriter(fws);
            PrintWriter outs = new PrintWriter(bw);
            outs.println(jTextArea1.getText());
            outs.close();
        }
        catch(java.io.IOException ioex) {
            System.out.println("se presento el error: "+ioex.toString());
    }

}

public void mazeanalize() 
{
    try{
    FileReader fr = new FileReader("Archivo_Laberinto.txt");
         lexi = new Yylex(fr);

         try{
            lexi.yylex();
        }
         catch (Exception ex2){}
       //  lexi.valuestrue();
    }
    catch (Exception ex){}
}




private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed



   //   .class.getProtectionDomain().getCodeSource().getLocation();
        //testEstudiantePdf.class.getProtectionDomain().getCodeSource().getLocation();
System.out.println(dire);
    
    
    Make_mazearc();
    mazeanalize();
if (lexi.list2.isEmpty()) {
                Make_Maze();
            } else {
                JOptionPane.showMessageDialog(jPanel1, "El Archivo tiene Errores , cargue otra archivo:p");
//   
         }
   
jButton1.setEnabled(false);

 

}//GEN-LAST:event_jButton1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
  
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
System.exit(0);    // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
 
         lexi.creartablita();       
       
}//GEN-LAST:event_jMenuItem6ActionPerformed

public void get_val(){
    String  Values = movs.moving.get(0).toString();
    String[] val = Values.split(",");
    My_thread(val[0], Integer.parseInt(val[1]), val[2]);
        try {
            Thread.sleep(50);
            movs.moving.remove(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
            pasito.stop();
         }  
 }
   

public void My_thread(final String p , final int o , final String q)
{
        
    pasito = new Thread()
    {
        public void run(){
        if (p.equalsIgnoreCase("X"))
        {
            if (q.equalsIgnoreCase("E"))
                         {

                             for(int m=0; m<o;m++)
                             {

                           if((labe[corx][cory+1].getIcon().toString()).equals((dire +"/src/practik1/epa/bns.jpg").toString())){
                                    bonus= bonus +5;
                                    bo ++;
                                   //System.out.println(bonus );
                                                                     
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx][cory + 1].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory + 1].repaint();
                                str ++;
                                street  --;
                                cory++;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                // System.out.println(bonus);
                              }



                          else if((labe[corx][cory+1].getIcon().toString()).equals((dire +"/src/practik1/epa/jdr.jpg").toString())){ 
                               laki = laki -10;
                               la ++;
                                                             
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                               

                                labe[corx][cory+1].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory+1].repaint();
                                sleep(600);
                                labe[corx][cory+1].setIcon(new ImageIcon((dire +"/src/practik1/epa/jdr.jpg")));
                                labe[corx][cory+1].repaint();

                                labe[corx][cory + 2].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory + 2].repaint();
                                str++;
                                str++;
                                street --;
                                street --;
                                cory++;
                                cory++;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                           
                           }
                 else if((labe[corx][cory+1].getIcon().toString()).equals((dire +"/src/practik1/epa/cay.jpg").toString()))
                           {
                            street --;
                            str ++;

                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx][cory + 1].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory + 1].repaint();
                                cory++;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                         
                            }
                else if((labe[corx][cory+1].getIcon().toString()).equals((dire +"/src/practik1/epa/final.jpg").toString()))
                           {

                ImageIcon fotks = new ImageIcon((dire +"/src/practik1/Imagencitas/finale.jpg"));
                Image imagen= fotks.getImage();
                BufferedImage resizedImage = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(imagen, 0, 0, baj-3,alt-3,null);
                g.dispose();
            try {
                ImageIO.write(resizedImage, "jpg", new File(dire+"src/practik1/epa/end.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }
                     str ++;
                            street  --;

                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx][cory + 1].setIcon(new ImageIcon((dire +"/src/practik1/epa/end.jpg")));
                                labe[corx][cory + 1].repaint();
                                cory++;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            }
            }
                            get_val();
                         }
         else if (q.equalsIgnoreCase("O"))
                        {
                            for(int m=0; m<o;m++)
                             {
                               if((labe[corx][cory-1].getIcon().toString()).equals((dire +"/src/practik1/epa/bns.jpg").toString())){
                                    bonus= bonus +5;
                                    bo ++;
                                   System.out.println(bonus );

                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                 str ++;
                            street  --;
                                labe[corx][cory - 1].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory - 1].repaint();
                                cory--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                // System.out.println(bonus);
                              }
                          else if((labe[corx][cory-1].getIcon().toString()).equals((dire +"/src/practik1/epa/jdr.jpg").toString())){
                               laki = laki -10;
                               la++;

                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                                               labe[corx][cory-1].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory-1].repaint();
                                sleep(600);
                                labe[corx][cory-1].setIcon(new ImageIcon((dire +"/src/practik1/epa/jdr.jpg")));
                                labe[corx][cory-1].repaint();

                                labe[corx][cory - 2].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory - 2].repaint();
                                str++;
                                str++;
                                street --;
                                street --;
                                cory--;
                                cory--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                           }
                 else if((labe[corx][cory-1].getIcon().toString()).equals((dire +"/src/practik1/epa/cay.jpg").toString()))
                               {
                      str ++;
                            street  --;
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx][cory - 1].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx][cory - 1].repaint();
                                cory--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }




                                 }
                               else if((labe[corx][cory-1].getIcon().toString()).equals((dire +"/src/practik1/epa/final.jpg").toString()))
                           {

                    ImageIcon fotks = new ImageIcon((dire +"/src/practik1/Imagencitas/finale.jpg"));
                Image imagen= fotks.getImage();
                BufferedImage resizedImage = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(imagen, 0, 0, baj-3,alt-3,null);
                g.dispose();
            try {
                ImageIO.write(resizedImage, "jpg", new File("/home/andychaw/NetBeansProjects/Practik1/src/practik1/epa/end.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }
                         str ++;
                            street  --;
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();

                                labe[corx][cory - 1].setIcon(new ImageIcon((dire +"/src/practik1/epa/end.jpg")));
                                labe[corx][cory - 1].repaint();
                                cory--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            }



                              }
                            get_val();
                        }

        }

        // -----------------------AQUI EMPIEZA COORDENADAS EN  Y --------------------


        else if (p.equalsIgnoreCase("y"))
            {
                if (q.equalsIgnoreCase("S"))
                {for(int m=0; m<o;m++)
                             {

                             if((labe[corx+1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/bns.jpg").toString())){
                                    bonus= bonus +5;
                                    bo++;
                                   System.out.println(bonus );
                                    str ++;
                            street  --;

                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx+1][cory ].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx+1][cory ].repaint();
                                corx++;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                // System.out.println(bonus);
                              }
                           else if((labe[corx+1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/jdr.jpg").toString())){
                               laki = laki -10;
                               la++;
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                               

                                labe[corx+1][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx+1][cory].repaint();
                                sleep(600);
                                labe[corx+1][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/jdr.jpg")));
                                labe[corx+1][cory].repaint();

                                labe[corx+2][cory ].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx+2][cory ].repaint();
                                corx++;
                                corx++;
                               str++;
                                str++;
                                street --;
                                street --;


                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                           }
                 else if((labe[corx+1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/cay.jpg").toString())){
                            street --;
                            str ++;
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx+1][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx+1][cory].repaint();
                                corx++;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }




 }
                             else if((labe[corx+1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/final.jpg").toString()))
                           {

                    ImageIcon fotks = new ImageIcon((dire +"/src/practik1/Imagencitas/finale.jpg"));
                Image imagen= fotks.getImage();
                BufferedImage resizedImage = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(imagen, 0, 0, baj-3,alt-3,null);
                g.dispose();
            try {
                ImageIO.write(resizedImage, "jpg", new File("/home/andychaw/NetBeansProjects/Practik1/src/practik1/epa/end.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }

                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                 str ++;
                            street  --;
                                labe[corx+1][cory ].setIcon(new ImageIcon((dire +"/src/practik1/epa/end.jpg")));
                                labe[corx+1][cory ].repaint();
                                corx++;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            }



                            }
                            get_val();
                }
            else if (q.equalsIgnoreCase("N"))
                {for(int m=0; m<o;m++)
                             {
                             if((labe[corx-1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/bns.jpg").toString())){
                                    bonus= bonus +5;
                                    bo++;
                                   System.out.println(bonus );
                                    str ++;
                            street  --;

                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx-1][cory ].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx-1][cory ].repaint();
                                corx--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                // System.out.println(bonus);
                              }
                          else if((labe[corx-1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/jdr.jpg").toString())){
                               laki = laki -10;
                               la++;
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                               
                                labe[corx-1][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx-1][cory].repaint();
                                sleep(600);
                                labe[corx-1][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/jdr.jpg")));
                                labe[corx-1][cory].repaint();

                                labe[corx-2][cory ].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx-2][cory ].repaint();
                                str++;
                                str++;
                                street --;
                                street --;
                                corx--;
                                corx--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                           }
                 else if((labe[corx-1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/cay.jpg").toString())) {
                            street --;
                            str ++;
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx-1][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/mari.jpg")));
                                labe[corx-1][cory].repaint();
                                corx--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }




 }
                             else if((labe[corx-1][cory].getIcon().toString()).equals((dire +"/src/practik1/epa/final.jpg").toString()))
                           {

                    ImageIcon fotks = new ImageIcon((dire +"/src/practik1/Imagencitas/finale.jpg"));
                Image imagen= fotks.getImage();
                BufferedImage resizedImage = new BufferedImage(baj-3,alt-3,BufferedImage.TYPE_INT_RGB);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(imagen, 0, 0, baj-3,alt-3,null);
                g.dispose();
            try {
                ImageIO.write(resizedImage, "jpg", new File("/home/andychaw/NetBeansProjects/Practik1/src/practik1/epa/end.jpg"));
                }
            catch (IOException ex)
                {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                }

                 str ++;
                            street  --;
                            try {
                                sleep(500);
                                labe[corx][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/cay.jpg")));
                                labe[corx][cory].repaint();
                                labe[corx-1][cory].setIcon(new ImageIcon((dire +"/src/practik1/epa/end.jpg")));
                                labe[corx-1][cory].repaint();
                                corx--;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            }
                            }
                            get_val();
                }

        }
   }
        

    };
    pasito.start();

}






private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
File archs = new File(nombre);
        try {
          FileReader  fre = new FileReader(archs);
         movs = new movin(fre);

         movs.yylex();
        //movs.values();

        if (movs.lista1.isEmpty())
         {
           get_val();

         }
         else
         {
            JOptionPane.showMessageDialog(jPanel1,"El Archivo tiene Errores , cargue otra archivo:p");
         }


        } catch (Exception ex)
        {
        }

 
jButton3.setEnabled(false);



}//GEN-LAST:event_jButton3ActionPerformed

private void jMenuItem2ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed1
 jTextArea1.setText("");
 make_pics();

// File fo = new File("maze.txt");
//        boolean delete = fo.delete();


 JFileChooser Files = new JFileChooser();
 int arch = Files.showOpenDialog(null);
    if (arch == JFileChooser.APPROVE_OPTION)
    {
        nombre = Files.getSelectedFile().getPath();
       // JOptionPane.showMessageDialog(jPanel1,nombre);

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(Files.getSelectedFile().getPath()));
            String linea = reader.readLine();
            while (linea != null)
            {
                jTextArea1.append(linea + "\n");
                linea = reader.readLine();
            }
        }
        catch (Exception ex)
        {
        }
    }




}//GEN-LAST:event_jMenuItem2ActionPerformed1
    
    
        private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       


        }//GEN-LAST:event_jMenuItem3ActionPerformed

        private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
JFileChooser fl = new JFileChooser();
int i = fl.showSaveDialog(null);
if (i == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fl.getSelectedFile().getPath() +".txt"));
                bw.write(jTextArea1.getText());
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
            }

}
        }//GEN-LAST:event_jMenuItem4ActionPerformed

        private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    movs.creartablita();                 // TODO add your handling code here:
        }//GEN-LAST:event_jMenuItem5ActionPerformed

        private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
JOptionPane.showMessageDialog(jPanel1,"Total Score :"+(total+bonus+laki+street)+"\n"+"blocks routes:"+str+"\n"+"Bonus:"+bo+"\n"+"Enemies:"+la );
        }//GEN-LAST:event_jMenuItem7ActionPerformed

        private void jMenuItem7ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed1
                        // TODO add your handling code here:
        }//GEN-LAST:event_jMenuItem7ActionPerformed1

        private void jMenuItem3ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed1
             BufferedWriter bw = null;
        try {
            File archivo = new File(nombre);
            bw = new BufferedWriter(new FileWriter(archivo.getAbsolutePath()));
            bw.write(jTextArea1.getText());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


        }//GEN-LAST:event_jMenuItem3ActionPerformed1

        private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
            About_Me yo = new About_Me();
            yo.show();// TODO add your handling code here:
        }//GEN-LAST:event_jMenuItem11ActionPerformed

        private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
            File path = new File ("User_Manual.pdf");
        try {
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
        }


        }//GEN-LAST:event_jMenuItem9ActionPerformed

        private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
                File path = new File ("Technical_Manual.pdf");
        try {
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            Logger.getLogger(Viewfra.class.getName()).log(Level.SEVERE, null, ex);
        }
        }//GEN-LAST:event_jMenuItem10ActionPerformed








    
    
    public void Laberinto(int fil, int col){
      labe = new JButton[fil][col];
      tamañox= fil;
      tamañoy = col;
      jPanel2.setLayout(new GridLayout(fil,col));
      jPanel2.removeAll();
       for(int i = 0;i<labe.length;i++)
       {
	for(int j = 0;j<labe.length;j++)
        {
            labe[i][j]= new JButton();
            labe[i][j].setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
           labe[i][j].setBounds(i*30,j*30, 30, 30);
            jPanel2.add(labe[i][j]);
                                                    
        }
       }
       jPanel2.repaint();
          
         setVisible(true);
         alt = labe[0][0].getHeight();
        baj = labe[0][0].getWidth();      
    }
  
   
       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Viewfra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


}

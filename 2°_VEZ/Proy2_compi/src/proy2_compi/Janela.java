/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy2_compi;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author andy28
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form Janela
     */
    
    DefaultMutableTreeNode pai;
    ListaEL er = new ListaEL();
    ListaS syms = new ListaS();
    public Janela() {
        initComponents();
        this.setTitle("[PROY2]");
    DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Listado");
    pai = new javax.swing.tree.DefaultMutableTreeNode("Files");
    treeNode1.add(pai);
    jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    jTabbedPane1.setEnabledAt(1, false);
    jTabbedPane1.setEnabledAt(2, false);
    }

    Tudo tudo  = new Tudo(); 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MT = new javax.swing.JMenuItem();
        MU = new javax.swing.JMenuItem();
        ABout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Proyecto"));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.addTab("File", jScrollPane1);

        jScrollPane3.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Errores", jPanel3);

        jScrollPane4.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Simbolos", jPanel1);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        New.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        New.setText("Nuevo");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jMenu1.add(New);

        Open.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Open.setText("Abrir");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        Save.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Save.setText("Guardar");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        SaveAs.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        SaveAs.setText("Guardar como");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAs);

        Exit.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jMenuItem1.setText("Analizar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Help");
        jMenu4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        MT.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        MT.setText("Manual_Tec");
        MT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTActionPerformed(evt);
            }
        });
        jMenu4.add(MT);

        MU.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        MU.setText("Manual_usu");
        MU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUActionPerformed(evt);
            }
        });
        jMenu4.add(MU);

        ABout.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        ABout.setText("Acerca_de..");
        ABout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABoutActionPerformed(evt);
            }
        });
        jMenu4.add(ABout);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        jTextArea1.setText("");
        tudo.New(jTextArea1);        // TODO add your handling code here:
    }//GEN-LAST:event_NewActionPerformed
public String paths,nome;
ArrayList <DefaultMutableTreeNode> nomes = new ArrayList<DefaultMutableTreeNode>();

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed

 nomes.add(tudo.Open());
 nome= nomes.get(0).toString();
 DefaultMutableTreeNode p = null ;
 for(int i=0;i<nomes.size();i++)
 {
     p = nomes.get(i);
     pai.add(p);
 }
 
 jTree1.updateUI();
 jTabbedPane1.setEnabledAt(1, false);
 jTabbedPane1.setEnabledAt(2, false);
 
 
    }//GEN-LAST:event_OpenActionPerformed
   
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        tudo.Save(jTextArea1,paths);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed
        tudo.New(jTextArea1);
    }//GEN-LAST:event_SaveAsActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
      
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        if(nome.contains(".mate"))
        {     
             mate();
             
             
        }
        else if(nome.contains(".edd"))
        {
            edd();
    
        }
        else if(nome.contains(".prn"))
        {
            prn();
        }
        symbols();
        Errores();
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed
public void mate()
{
    Yylex L1 = new Yylex(new StringReader(jTextArea1.getText()));
    parser P1 = new parser(L1);
        try {
            P1.parse();
        } catch (Exception ex) 
        {
        }
        
  
        for(int i=0;i<L1.Li.size();i++)
        {
            er.insertar(L1.Li.get(i).toString(),L1.Co.get(i).toString(), L1.Ca.get(i).toString(),L1.ki.get(i).toString(), nome);
           
        }
    

        for(int i=0;i<parser.first.size();i++)
        {
            er.insertar(parser.first.get(i).toString(),parser.second.get(i).toString(), parser.third.get(i).toString(),parser.four.get(i).toString(), nome);
        }

        for(int i=0;i<L1.simbols.size();i++)
        {
        syms.insertar(L1.simbols.get(i).toString(), nome);   
        }
        
        
}
    
public void edd()
{
   
    proy2_compi.estrutura.Yylex Ledd = new proy2_compi.estrutura.Yylex(new StringReader(jTextArea1.getText()));
    proy2_compi.estrutura.parser Pedd = new proy2_compi.estrutura.parser(Ledd);
        try {
            Pedd.parse();
        } catch (Exception ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<Ledd.Li.size();i++)
        {
            er.insertar(Ledd.Li.get(i).toString(),Ledd.Co.get(i).toString(), Ledd.Ca.get(i).toString(),Ledd.ki.get(i).toString(), nome);
           
        }
    

        for(int i=0;i<Pedd.first.size();i++)
        {
            er.insertar(Pedd.first.get(i).toString(),Pedd.second.get(i).toString(), Pedd.third.get(i).toString(),Pedd.four.get(i).toString(), nome);
        }
        
         for(int i=0;i<Ledd.simbols.size();i++)
        {
        syms.insertar(Ledd.simbols.get(i).toString(), nome);   
        }
        
        
        
    
}

public void prn()
{
    proy2_compi.prn.Yylex Lprn = new proy2_compi.prn.Yylex(new StringReader(jTextArea1.getText()));
    proy2_compi.prn.parser Pprn = new proy2_compi.prn.parser(Lprn);
        try {
            Pprn.parse();
        } catch (Exception ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<Lprn.Li.size();i++)
        {
            er.insertar(Lprn.Li.get(i).toString(),Lprn.Co.get(i).toString(), Lprn.Ca.get(i).toString(),Lprn.ki.get(i).toString(), nome);
           
        }
    

        for(int i=0;i<Pprn.first.size();i++)
        {
            er.insertar(Pprn.first.get(i).toString(),Pprn.second.get(i).toString(), Pprn.third.get(i).toString(),Pprn.four.get(i).toString(), nome);
        }
        
         for(int i=0;i<Lprn.simbols.size();i++)
        {
        syms.insertar(Lprn.simbols.get(i).toString(), nome);   
        }
        
    
}

void symbols()
{
jTextPane2.setContentType("text/html");
 
String html="<html>\n"
            + "<head>\n"
            + "</head>\n"
            + "<body>\n"
            + "<h1>TABLA DE SIMBOLOS:</h1>\n"
            + "<table width='200' border='1'><tr><th scope='col'>Numero</th><th scope='col'>Simbolo</th><th scope='col'>Archivo</th></tr>\n";       
          
int n=0;
nodoS aux = syms.primero;
while(aux!=null)
{
html = html +"<tr><td>"+(n+1)+"</td><td>"+aux.Simbolo+"</td><td>"+aux.archivo+"</td></tr>\n";

n= n+1;
aux = aux.sig;
}
html +="</table><p>&nbsp;</p><p>&nbsp;</p></body></html>";

jTextPane2.setText(html);



jTabbedPane1.setEnabledAt(2, true);
}
    
void Errores()
{
jTextPane1.setContentType("text/html");
 
String html1="<html>\n"
            + "<head>\n"
            + "</head>\n"
            + "<body>\n"
            + "<h1>ERRORES:</h1>\n"
            + "<table width='200' border='1'><tr><th scope='col'>Numero</th><th scope='col'>Linea</th><th scope='col'>Columna</th><th scope='col'>Simbolo</th><th scope='col'>Tipo_Error</th><th scope='col'>Archivo</th></tr>\n";       
          
int n=0;
NodoE aux = er.primero;
while(aux!=null)
{
html1 = html1 +"<tr><td>"+(n+1)+"</td><td>"+aux.Linea+"</td><td>"+aux.columna+"</td><td>"+aux.error+"</td><td>"+aux.tipo+"</td><td>"+aux.Archivo+"</td></tr>\n";

n= n+1;
aux = aux.sig;
}
html1 +="</table><p>&nbsp;</p><p>&nbsp;</p></body></html>";

jTextPane1.setText(html1);



jTabbedPane1.setEnabledAt(1, true);
            
      
}

  
    private void MTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTActionPerformed
        String path = "ManualT.pdf";
        tudo.Manual(path , "TechnicalM.html", "_TECNICO");
        File  name = new File("TechnicalM.html");
        try {
            Desktop.getDesktop().open(name);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_MTActionPerformed

    private void MUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUActionPerformed

        String path = "ManualU.pdf";
        tudo.Manual(path , "UserM.html", "_USUARIO");
        File  name = new File("UserM.html");
        try {
            Desktop.getDesktop().open(name);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_MUActionPerformed

    private void ABoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABoutActionPerformed
        About_Me eu = new About_Me();
        eu.show();
       // TODO add your handling code here:
    }//GEN-LAST:event_ABoutActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
   
      try{   
           int selRow = jTree1.getRowForLocation(evt.getX(), evt.getY());
           TreePath selPath = jTree1.getPathForLocation(evt.getX(), evt.getY());
        
        if(selRow != -1) 
        {
            if(evt.getClickCount() == 1) 
            {
                
            }
            else if(evt.getClickCount() == 2) 
            {
                jTextArea1.setText("");
                DefaultMutableTreeNode selectedNode =((DefaultMutableTreeNode)selPath.getLastPathComponent());
                for (int i = 0; i <nomes.size(); i++) 
                {
                if(selectedNode.equals(nomes.get(i)))
                    {
                      paths= tudo.fil.get(i).toString();
                      nome= nomes.get(i).toString();
                      BufferedReader br = new BufferedReader(new FileReader(tudo.fil.get(i).toString()));
                      
                      String line= br.readLine();
                      while (line!= null)
                       {
            
                        jTextArea1.append(line+"\n");
                        line = br.readLine();
                       }
                      
                      
            
                    }
                }    
            
            }
        }
        
       
      
      }catch(Exception ex){
      }
        
    }//GEN-LAST:event_jTree1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ABout;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem MT;
    private javax.swing.JMenuItem MU;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private static javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}

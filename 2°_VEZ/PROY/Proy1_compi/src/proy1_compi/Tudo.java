package proy1_compi;

import java.awt.TextArea;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.FilenameFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychava
 */
public class Tudo {
    
   String nomeArquivo; 
   String soNome;
    public  void Open(JTextArea area)
    {
        soNome ="";
    String filters[] ={"lnz","cls","pnt"};    
    FileNameExtensionFilter f = new FileNameExtensionFilter("Kinds of Files",filters);
        JFileChooser jf = new JFileChooser();
        jf.setFileFilter(f);
        int files = jf.showOpenDialog(null);
        if (files == JFileChooser.APPROVE_OPTION)
        {
            nomeArquivo= jf.getSelectedFile().getPath();
            soNome = jf.getSelectedFile().getName();
            try{
                BufferedReader br = new BufferedReader(new FileReader(jf.getSelectedFile().getPath()));
                String line= br.readLine();
                while (line!= null) 
                {
                    
                    area.append(line+"\n");
                    line = br.readLine();
                }
            } catch (Exception ex) 
            {
            }
        }
    }

    public void New(JTextArea area)
    {
  
    FileNameExtensionFilter f = new FileNameExtensionFilter("Lienzo", "lnz");
    FileNameExtensionFilter f1 = new FileNameExtensionFilter("Colores", "cls");
    FileNameExtensionFilter f2 = new FileNameExtensionFilter("Paint", "pnt");
      
    JFileChooser jf = new JFileChooser();
        
       jf.addChoosableFileFilter(f);
       jf.addChoosableFileFilter(f1);
       jf.addChoosableFileFilter(f2);
     int files = jf.showSaveDialog(null);

        nomeArquivo = jf.getSelectedFile().getPath();
        String otro = jf.getSelectedFile().getName();
        Object  fil1 = f1;
        
       exist(jf, area); 
}
    
    
   public void Save(JTextArea area)
   {
       BufferedWriter writes;
       try
       {
       writes= new BufferedWriter(new FileWriter(nomeArquivo));
       writes.write(area.getText());
       writes.close();
       }
       catch(Exception ex)
       {ex.printStackTrace();}
   
   }
    
       
   void exist(JFileChooser jf,JTextArea area)
    {
     if(new File(jf.getSelectedFile().getPath()).exists()) 
        {
            if(JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null,"El archivo:"+" "+"\""+jf.getSelectedFile().getName() +"\""+" "+"ya existe."+"\n"+"Desea remplazarlo?",null,JOptionPane.YES_NO_OPTION)) 
            {
                
                BufferedWriter bw;
                try {
                    bw = new BufferedWriter(new FileWriter(nomeArquivo));
                    bw.write(area.getText());
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                
            } else {
                int fs = jf.showSaveDialog(null);
            }
            
        } 
     else {
            BufferedWriter writes = null;
      try {
                
           String Descrição = jf.getFileFilter().getDescription();
                
           if(Descrição.equalsIgnoreCase("colores"))
           {
                writes= new BufferedWriter(new FileWriter(jf.getSelectedFile().getPath()+".cls"));
                   writes.write(area.getText());
                writes.close();
           }
           else if(Descrição.equalsIgnoreCase("Lienzo"))
           {
               writes = new BufferedWriter(new FileWriter(jf.getSelectedFile().getCanonicalPath()+".lnz"));
                  writes.write(area.getText());
                writes.close();
           }
           else if(Descrição.equalsIgnoreCase("paint"))
           {
               writes = new BufferedWriter(new FileWriter(jf.getSelectedFile().getCanonicalPath()+".pnt"));
                  writes.write(area.getText());
                writes.close();
           }
           
             
           
               
         }
     catch(IOException ex){ex.printStackTrace();}
    
    
         }

    } 
  

   void Manual(String  path,String nome,String  Types)
 {
 String Reporte= nome;
FileWriter fw = null;
try {
fw = new FileWriter(Reporte);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter salArch = new PrintWriter(bw);
salArch.println();

salArch.print("<html>");
salArch.print("<body><br/>");
salArch.print("<h1 align=center> MANUAL"+Types+"</h1><br/>");

salArch.println("<center><embed src='"+ path+"' width='1000' height='800'></center>");
salArch.println("</body></html>");
salArch.close();
}
catch (IOException ex) {
}


 
 
 }
    
    
}

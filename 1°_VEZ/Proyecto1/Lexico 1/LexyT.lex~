import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System;
import java.util.ArrayList;
import java_cup.runtime.*;

 
%%

%cup
%line    
%char  
%ignorecase
LETRAS = [a-zA-z]+
NUMBER = [1-9][0-9]*
REAL = {NUMBER}"."{NUMBER}
mes =01|02|03|04|05|06|07|08|09|10|11|12
an = [0-9][0-9][0-9][0-9]
dia = 01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31
h = 01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23
min = 00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59
TA= "<""Tesoreria"">"
TC= "<""/""Tesoreria"">"
DUA= "<""Dato_Usuario"">"
DUC= "<""/""Dato_Usuario"">"
MA= "<""Mod_Tes"">"
MC ="<""/""Mod_Tes"">"
ANNIA = "<""Año"":"{an}">"
ANNIC= "<""/""Año"">"
MESA= "<""Mes"":"{mes}">"
MESC= "<""/""Mes"">"
IA= "<""Ingresos"">"
IC= "<""/""Ingresos"">"
GA= "<""Gastos"">"
GC= "<""/""Gastos"">"
 HORA = {h}":"{min}
 FECH = {dia}"-"{mes}"-"{an}
 MONETTA= "Q"|"E"|"$"
 LUGR = {LETRAS}","{LETRAS}
 
%{

public static ArrayList list1= new ArrayList();
public static ArrayList list2 = new ArrayList();
public static ArrayList list3 = new ArrayList();

%}

%{
public static void mistakes()
{
String Reporte= "Lexy1.html";
FileWriter fw = null;
try {
fw = new FileWriter(Reporte);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter salArch = new PrintWriter(bw);
salArch.println();

//aqui empezas a escribir el html
salArch.print("<html>");
salArch.print("<head>Errores</head>");
salArch.print("<body>");
//definis tu tabla con cada una de las columnas
salArch.print("<table width='200' border='1'><tr><th scope='col'>Error</th><th scope='col'>Linea</th><th scope='col'>Poscion</th></tr>");

//errores,alinea,posicion  son un arrayList del mismo tamano
        for (int i = 0; i<list1.size(); i++){
            salArch.print("<tr><td>"+list3.get(i)+"</td><td>"+list1.get(i)+"</td><td>"+list2.get(i)+"</td></tr>");


     }
salArch.println("</table><p>&nbsp;</p><p>&nbsp;</p></body></html>");
salArch.close();
                }
                catch (IOException ex) {
}


try {

            File path = new File("Lexy2.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
          //  Logger.getLogger(Proyecto1_Compi1View.class.getName()).log(Level.SEVERE, null, ex);
        }

}





%}
%%
 
<YYINITIAL> {TA} {return new Symbol(sym.TeA,new String(yytext()));}
<YYINITIAL> {TC} {return new Symbol(sym.TeC,new String(yytext()));}
<YYINITIAL> {MA} {return new Symbol(sym.MoA,new String(yytext()));}
<YYINITIAL> {MC} {return new Symbol(sym.MoC,new String(yytext()));}
<YYINITIAL> {ANNIA} {return new Symbol(sym.AnA,new String(yytext()));}
<YYINITIAL> {ANNIC} {return new Symbol(sym.AnC,new String(yytext()));}
<YYINITIAL> {MESA} {return new Symbol(sym.MeA,new String(yytext()));}
<YYINITIAL> {MESC} {return new Symbol(sym.MeC,new String(yytext()));}
<YYINITIAL> {IA} {return new Symbol(sym.IngA,new String(yytext()));}
<YYINITIAL> {IC} {return new Symbol(sym.IngC,new String(yytext()));}
<YYINITIAL> {GA} {return new Symbol(sym.GstA,new String(yytext()));}
<YYINITIAL> {GC} {return new Symbol(sym.GstC,new String(yytext()));}
<YYINITIAL> {FECH} {return new Symbol(sym.Date,new String(yytext()));}
<YYINITIAL> {HORA} {return new Symbol(sym.Hour,new String(yytext()));}
<YYINITIAL> {DUA} {return new Symbol(sym.DuA,new String(yytext()));}
<YYINITIAL> {DUC} {return new Symbol(sym.DuC,new String(yytext()));}

<YYINITIAL> "Nom_Usuario" {return new Symbol(sym.Nu,new String(yytext()));}
<YYINITIAL> "Lugar" {return new Symbol(sym.Plac,new String(yytext()));}
<YYINITIAL> "Fecha" {return new Symbol(sym.Da,new String(yytext()));}
<YYINITIAL> "Hora" {return new Symbol(sym.Hora,new String(yytext()));}
<YYINITIAL> "Tipo_Grafica" {return new Symbol(sym.Graph,new String(yytext()));}
<YYINITIAL> "Moneda" {return new Symbol(sym.Monetta,new String(yytext()));}
<YYINITIAL> "Ventas" {return new Symbol(sym.Vnta,new String(yytext()));}
<YYINITIAL> "Caja" {return new Symbol(sym.Kja,new String(yytext()));}
<YYINITIAL> "Banco" {return new Symbol(sym.Banc,new String(yytext()));}
<YYINITIAL> "Alquiler_Cobrado" {return new Symbol(sym.AlqC,new String(yytext()));}
<YYINITIAL> "Prestamos" {return new Symbol(sym.Borr,new String(yytext()));}
<YYINITIAL> "Otros" {return new Symbol(sym.Otr,new String(yytext()));}
<YYINITIAL> "Alquiler" {return new Symbol (sym.Rental,new String(yytext()));}
<YYINITIAL> "Luz_Electrica" {return new Symbol(sym.LE,new String(yytext()));}
<YYINITIAL> "Agua_Potable" {return new Symbol(sym.AP,new String(yytext()));}
<YYINITIAL> "Sueldos" {return new Symbol(sym.Salary,new String(yytext()));}
<YYINITIAL> "Seguridad" {return new Symbol(sym.Security,new String(yytext()));}
<YYINITIAL> "Seguros" {return new Symbol(sym.Insurance,new String(yytext()));}
<YYINITIAL> "Gasolina" {return new Symbol(sym.Gas,new String(yytext()));}
<YYINITIAL> "Pago_Prestamo" {return new Symbol(sym.PP,new String(yytext()));}
<YYINITIAL> "Impuesto" {return new Symbol(sym.Tax,new String(yytext()));}
<YYINITIAL> "Barras" {return new Symbol(sym.Ba,new String(yytext()));}
<YYINITIAL> "Circulo" {return new Symbol(sym.Cir,new String(yytext()));}
<YYINITIAL> "Lineas" {return new Symbol(sym.Li,new String(yytext()));}


<YYINITIAL> ":" {return new Symbol(sym.Duep,new String(yytext()));}
<YYINITIAL> "=" {return new Symbol(sym.Equal,new String(yytext()));}
<YYINITIAL>  {NUMBER} {return new Symbol(sym.Numb,new String(yytext()));}
<YYINITIAL> {REAL} {return new Symbol(sym.Real,new String(yytext()));}
<YYINITIAL> {MONETTA} {return new Symbol(sym.MoneS,new String(yytext()));}
<YYINITIAL> {LUGR} {return new Symbol(sym.Luga,new String(yytext()));}
<YYINITIAL> "'" {return new Symbol(sym.Apos,new String(yytext()));}
<YYINITIAL> {LETRAS} {return new Symbol(sym.Let,new String(yytext()));}
<YYINITIAL>";" {return new Symbol(sym.Semi,new String(yytext()));}
<YYINITIAL> [\n] 		{yychar=0;}
<YYINITIAL>  [" "\t\r]+ {}


.
  { 
   list1.add(yyline);
    list2.add(yychar);
    list3.add(yytext());
    System.out.println("error lexico en "  + yyline + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
  }
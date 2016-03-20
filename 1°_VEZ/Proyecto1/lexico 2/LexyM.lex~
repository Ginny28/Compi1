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
%public
%class Yylex2
NUMBER = [1-9][0-9]*
REAL = {NUMBER}"."{NUMBER}
LETRAS = [a-zA-z]+
mes =01|02|03|04|05|06|07|08|09|10|11|12
an = [0-9][0-9][0-9][0-9]
dia = 01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31
h = 01|02|03|04|05|06|07|08|09|10|11|12
min = 00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59
numbord = [1-7]

GMA= "<""Gestion_Materiales"">"
GMC= "<""/""Gestion_Materiales"">"
FA= "<""Formato"">"
FC= "<""/""Formato"">"
TaA = "<""Tabla"">"
TaC = "<""/""Tabla"">"
CaA = "<""Caracteristicas"">"
CaC = "<""/""Caracteristicas"">"
PrA= "<""Producto"">"
PrC= "<""/""Producto"">"
LiA= "<""Linea"" ""Nom_Linea"":""'"{LETRAS}"'"">"
LiC= "<""/""Linea"">"
DpA ="<""Def_Productos"">"
DpC ="<""/""Def_Productos"">"
FECHA2 = {dia}"/"{mes}"/"{an}
HORA2 = {h}":"{min}" ""am"|"pm"
LUGR = {LETRAS}","{LETRAS}
Abrevs = "Gr"|"Lb"|"Kg"|"Oz"|"Tn"


%{
public static void llamar()
{
    proyecto1_compi1.html.CUP$parser$actions.tablita();
}
%}


%{

public static ArrayList list1= new ArrayList();
public static ArrayList list2 = new ArrayList();
public static ArrayList list3 = new ArrayList();

%}

%{
public static void mistakes()
{
String Reporte= "Lexy2.html";
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

<YYINITIAL> {GMA} {return new Symbol(sym.GMA,new String(yytext()));}
<YYINITIAL> {GMC} {return new Symbol(sym.GMC,new String(yytext()));}
<YYINITIAL> {FA} {return new Symbol(sym.FA,new String(yytext()));}
<YYINITIAL> {FC} {return new Symbol(sym.FC,new String(yytext()));}
<YYINITIAL> {TaA} {return new Symbol(sym.TaA,new String(yytext()));}
<YYINITIAL> {TaC} {return new Symbol(sym.TaC,new String(yytext()));}
<YYINITIAL> {CaA} {return new Symbol(sym.CaA,new String(yytext()));}
<YYINITIAL> {CaC} {return new Symbol(sym.CaC,new String(yytext()));}
<YYINITIAL> {PrA} {return new Symbol(sym.PrA,new String(yytext()));}
<YYINITIAL> {PrC} {return new Symbol(sym.PrC,new String(yytext()));}
<YYINITIAL> {LiA} {return new Symbol(sym.LiA,new String(yytext()));}
<YYINITIAL> {LiC} {return new Symbol(sym.LiC,new String(yytext()));}
<YYINITIAL> {DpA} {return new Symbol(sym.DpA,new String(yytext()));}
<YYINITIAL> {DpC} {return new Symbol(sym.DpC,new String(yytext()));}
<YYINITIAL> "fondo" {return new Symbol(sym.fondo,new String(yytext()));}
<YYINITIAL> "fuente" {return new Symbol(sym.font,new String(yytext()));}
<YYINITIAL> "tam_fuente" {return new Symbol(sym.tmfont,new String(yytext()));}
<YYINITIAL> "color_fuente" {return new Symbol(sym.colfont,new String(yytext()));}
<YYINITIAL> "Borde_tabla" {return new Symbol(sym.btable,new String(yytext()));}
<YYINITIAL> "color_borde" {return new Symbol(sym.coltable,new String(yytext()));}
<YYINITIAL> "lugar" {return new Symbol(sym.place,new String(yytext()));}
<YYINITIAL> "fecha" {return new Symbol(sym.dates,new String(yytext()));}
<YYINITIAL> "hora" {return new Symbol(sym.hours,new String(yytext()));}
<YYINITIAL> "Nombre" {return new Symbol(sym.names,new String(yytext()));}
<YYINITIAL> "Cantidad" {return new Symbol(sym.cant,new String(yytext()));}
<YYINITIAL> "Color" {return new Symbol(sym.colo,new String(yytext()));}
<YYINITIAL> "Precio" {return new Symbol(sym.price,new String(yytext()));}
<YYINITIAL> "Peso" {return new Symbol(sym.weight,new String(yytext()));}
<YYINITIAL> "Marca" {return new Symbol(sym.mark,new String(yytext()));}
<YYINITIAL> "Modelo" {return new Symbol(sym.model,new String(yytext()));}

<YYINITIAL> "Rojo" {return new Symbol(sym.rossa,new String(yytext()));}
<YYINITIAL> "Azul" {return new Symbol(sym.blu,new String(yytext()));}
<YYINITIAL> "Verde" {return new Symbol(sym.verde,new String(yytext()));}
<YYINITIAL> "Morado" {return new Symbol(sym.porpora,new String(yytext()));}
<YYINITIAL> "Rosado" {return new Symbol(sym.rosato,new String(yytext()));}
<YYINITIAL> "Blanco" {return new Symbol(sym.bianco,new String(yytext()));}
<YYINITIAL> "Negro" {return new Symbol(sym.nero,new String(yytext()));}
<YYINITIAL> "Gris" {return new Symbol(sym.griggio,new String(yytext()));}
<YYINITIAL> "Anaranjado" {return new Symbol(sym.arancione,new String(yytext()));}
<YYINITIAL> "Celeste" {return new Symbol(sym.celeste,new String(yytext()));}

<YYINITIAL> "Trebuchet" {return new Symbol(sym.trebuchet,new String(yytext()));}
<YYINITIAL> "Arial" {return new Symbol(sym.arial,new String(yytext()));}
<YYINITIAL> "Georgia" {return new Symbol(sym.georgia,new String(yytext()));}
<YYINITIAL> "Verdana" {return new Symbol(sym.verdana,new String(yytext()));}
<YYINITIAL> "Courier" {return new Symbol(sym.courier,new String(yytext()));}

<YYINITIAL> "=" {return new Symbol(sym.equal,new String(yytext()));}
<YYINITIAL>  {NUMBER} {return new Symbol(sym.numb,new String(yytext()));}
<YYINITIAL> {REAL} {return new Symbol(sym.real,new String(yytext()));}
<YYINITIAL> {FECHA2} {return new Symbol(sym.dates2,new String(yytext()));}
<YYINITIAL> {HORA2} {return new Symbol(sym.hora2,new String(yytext()));}
<YYINITIAL> {LUGR} {return new Symbol(sym.place2,new String(yytext()));}
<YYINITIAL> {Abrevs} {return new Symbol(sym.abrv,new String(yytext()));}
<YYINITIAL> "'" {return new Symbol(sym.Apos,new String(yytext()));}
<YYINITIAL> {LETRAS} {return new Symbol(sym.letters,new String(yytext()));}
<YYINITIAL>";" {return new Symbol(sym.semi,new String(yytext()));}
<YYINITIAL> "." {return new Symbol(sym.dot,new String(yytext()));}
<YYINITIAL>  {numbord} {return new Symbol(sym.nuborde,new String(yytext()));}
<YYINITIAL> [\n] {yychar=0;}
<YYINITIAL>  [" "\t\r]+ {}


.
  { 
  list1.add(yyline);
    list2.add(yychar);
    list3.add(yytext());
    System.out.println("error lexico en "  + yyline + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
  }
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
%class Yylex3

LETRAS = [a-zA-z]+

McA = "<""Modulo_Comercial"">"
McC = "<""/""Modulo_Comercial"">"
ClienA= "<""cliente"">"
ClienC="<""/""cliente"">"
FacA="<""Factura"">"
FacC= "<""/""Factura"">"
DfA="<""Detalle_Factura"">"
DfC= "<""/""Detalle_Factura"">"

dia = 01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31
mes =01|02|03|04|05|06|07|08|09|10|11|12
an = [0-9][0-9][0-9][0-9]
h = 01|02|03|04|05|06|07|08|09|10|11|12
min = 00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59
N= 0|1|2|3|4|5|6|7|8|9

FECHA2 = {dia}"/"{mes}"/"{an}
HORA2 = {h}":"{min}" ""am"|"pm"

FECHA3 = {dia}"-"{mes}"-"{an}
NIT ={N}{N}{N}{N}{N}{N}"-"{N}{N}
TEL = {N}{N}{N}{N}{N}{N}{N}{N}

NUMBER = [0-9][0-9]*
REAL = {NUMBER}"."{NUMBER}

%{

ArrayList list1= new ArrayList();
ArrayList list2 = new ArrayList();
ArrayList list3 = new ArrayList();

%}

%{
public void mistakes()
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

}



%}




%%

<YYINITIAL> {McA} {return new Symbol(sym.ModA,new String(yytext()));}
<YYINITIAL> {McC} {return new Symbol(sym.ModC,new String(yytext()));}
<YYINITIAL> {ClienA} {return new Symbol(sym.CliA,new String(yytext()));}
<YYINITIAL> {ClienC} {return new Symbol(sym.CliC,new String(yytext()));}
<YYINITIAL> {FacA} {return new Symbol(sym.FaA,new String(yytext()));}
<YYINITIAL> {FacC} {return new Symbol(sym.FaC,new String(yytext()));}
<YYINITIAL> {DfA} {return new Symbol(sym.DeA,new String(yytext()));}
<YYINITIAL> {DfC} {return new Symbol(sym.DeC,new String(yytext()));}
<YYINITIAL> "Fecha" {return new Symbol(sym.date,new String(yytext()));}
<YYINITIAL> "Hora" {return new Symbol(sym.hour,new String(yytext()));}
<YYINITIAL> "Nombres" {return new Symbol(sym.names,new String(yytext()));}
<YYINITIAL> "Apellidos" {return new Symbol(sym.lstna,new String(yytext()));}
<YYINITIAL> "Nit" {return new Symbol(sym.nity,new String(yytext()));}
<YYINITIAL> "Direccion" {return new Symbol(sym.dir,new String(yytext()));}
<YYINITIAL> "Telefono" {return new Symbol(sym.tel,new String(yytext()));}
<YYINITIAL> "Edad" {return new Symbol(sym.age,new String(yytext()));}
<YYINITIAL> "No" {return new Symbol(sym.numy,new String(yytext()));}
<YYINITIAL> "Fecha_Venta" {return new Symbol(sym.fve,new String(yytext()));}
<YYINITIAL> "Cantidad" {return new Symbol(sym.can,new String(yytext()));}
<YYINITIAL> "Producto" {return new Symbol(sym.pro,new String(yytext()));}
<YYINITIAL> "Precio" {return new Symbol(sym.pre,new String(yytext()));}
<YYINITIAL> "Descripcion" {return new Symbol(sym.desc,new String(yytext()));}

<YYINITIAL> {FECHA2} {return new Symbol(sym.fech2,new String(yytext()));}
<YYINITIAL> {HORA2} {return new Symbol(sym.hour2,new String(yytext()));}
<YYINITIAL> {FECHA3} {return new Symbol(sym.fech3,new String(yytext()));}
<YYINITIAL> {NIT} {return new Symbol(sym.nity2,new String(yytext()));}
<YYINITIAL> {TEL} {return new Symbol(sym.tel2,new String(yytext()));}
<YYINITIAL>  {NUMBER} {return new Symbol(sym.numb,new String(yytext()));}
<YYINITIAL> {REAL} {return new Symbol(sym.real,new String(yytext()));}
<YYINITIAL>"=" {return new Symbol(sym.equal,new String(yytext()));}
<YYINITIAL>";" {return new Symbol(sym.semi,new String(yytext()));}
<YYINITIAL>":" {return new Symbol(sym.ddot,new String(yytext()));}
<YYINITIAL>"'" {return new Symbol(sym.Apos,new String(yytext()));}
<YYINITIAL>"-" {return new Symbol(sym.gui,new String(yytext()));}
<YYINITIAL>"." {return new Symbol(sym.dot,new String(yytext()));}
<YYINITIAL>"," {return new Symbol(sym.com,new String(yytext()));}
<YYINITIAL> {LETRAS} {return new Symbol(sym.lett,new String(yytext()));}
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








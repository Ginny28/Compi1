import java.lang.System;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.io.*;
import java.awt.Desktop;
%%


%cup
%line    
%char  
%public
%ignorecase
NUMBER = [1-9][0-9]*
LETRAS = [a-zA-z]+
dots ="."
ima = {LETRAS}{dots}"jpg"|"png"
ID= [a-zA-z][a-zA-z0-9]*
TF= "Negrita"|"Cursiva"|"Normal"
ab="ABAP"
tt ="h1"|"h2"|"h3"


XA= "<""XML"">"
XC= "<""/""XML"">"
ImA= "<""Importar"">"
ImC= "<""/""Importar"">"
pn1A= "<""Panel_1"">"
pn1C= "<""/""Panel_1"">"
pn2A= "<""Panel_2"">"
pn2C= "<""/""Panel_2"">"
PA = "<""Parrafo"">"
PC = "<""/""Parrafo"">"
VA= "<""Vinieta" ">"
VC= "<""/""Vinieta"">"
Vins= "<""L"">"

%{
static ArrayList Li= new ArrayList();
static ArrayList Co= new ArrayList();
static ArrayList Ca= new ArrayList();

public static void mistakes3()
{
String Reporte= "Lexy3.html";
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
salArch.print("<table width='200' border='1'><tr><th scope='col'>Numero</th><th scope='col'>Linea</th><th scope='col'>Columna</th><th scope='col'>Error</th></tr>");
int n=0;
//errores,alinea,posicion  son un arrayList del mismo tamano
        for (int i = 0; i<Li.size(); i++)
        {
            salArch.print("<tr><td>"+(n+1)+"</td><td>"+Li.get(i)+"</td><td>"+Co.get(i)+"</td><td>"+Ca.get(i)+"</td></tr>");
n= n+1;

        }

salArch.println("</table><p>&nbsp;</p><p>&nbsp;</p></body></html>");
salArch.close();
                }
                catch (IOException ex) {
}


try {

            File path = new File("Lexy3.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
          //  Logger.getLogger(Proyecto1_Compi1View.class.getName()).log(Level.SEVERE, null, ex);
        }

}

public static void llamar()
{
   
}
%}



%%

<YYINITIAL> {XA} {return new Symbol(sym.xmla,yyline,yychar,new String(yytext()));}
		 

<YYINITIAL> {XC} {return new Symbol(sym.xmlc,yyline,yychar,new String(yytext()));}
<YYINITIAL> {ImA} {return new Symbol(sym.ima,yyline,yychar,new String(yytext()));}
<YYINITIAL> {ImC} {return new Symbol(sym.imc,yyline,yychar,new String(yytext()));}
<YYINITIAL> {pn1A} {return new Symbol(sym.pan1a,yyline,yychar,new String(yytext()));}
<YYINITIAL> {pn1C} {return new Symbol(sym.pan1c,yyline,yychar,new String(yytext()));}
<YYINITIAL> {pn2A} {return new Symbol(sym.pan2a,yyline,yychar,new String(yytext()));}
<YYINITIAL> {pn2C} {return new Symbol(sym.pan2c,yyline,yychar,new String(yytext()));}
<YYINITIAL> {PA} {return new Symbol(sym.para,yyline,yychar,new String(yytext()));}
<YYINITIAL> {PC} {return new Symbol(sym.parc,yyline,yychar,new String(yytext()));}
<YYINITIAL> {VA} {return new Symbol(sym.vina,yyline,yychar,new String(yytext()));}
<YYINITIAL> {VC} {return new Symbol(sym.vinc,yyline,yychar,new String(yytext()));}
<YYINITIAL> {Vins} {return new Symbol(sym.vine,yyline,yychar,new String(yytext()));}
<YYINITIAL> {TF} {return new Symbol(sym.typef,yyline,yychar,new String(yytext()));}
<YYINITIAL> {tt} {return new Symbol(sym.typetxt,yyline,yychar,new String(yytext()));}
<YYINITIAL> {ima} {return new Symbol(sym.path,yyline,yychar,new String(yytext()));}

<YYINITIAL> "Nombre_pag" {return new Symbol(sym.np,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Tamaño_Titulo" {return new Symbol(sym.tamtit,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Texto_Titulo" {return new Symbol(sym.textti,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Tipo_Fuente" {return new Symbol(sym.typefont,yyline,yychar,new String(yytext()));}
<YYINITIAL> "imagen" {return new Symbol(sym.image,yyline,yychar,new String(yytext()));}
<YYINITIAL> "fondo" {return new Symbol(sym.fondo,yyline,yychar,new String(yytext()));}
<YYINITIAL> "fuente" {return new Symbol(sym.fuente,yyline,yychar,new String(yytext()));}
<YYINITIAL> "color_fuente" {return new Symbol(sym.colf,yyline,yychar,new String(yytext()));}

<YYINITIAL> "Rojo" {return new Symbol(sym.rojo,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Azul" {return new Symbol(sym.azul,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Verde" {return new Symbol(sym.verde,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Morado" {return new Symbol(sym.morado,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Rosado" {return new Symbol(sym.rosa,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Blanco" {return new Symbol(sym.branco,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Negro" {return new Symbol(sym.nero,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Gris" {return new Symbol(sym.gris,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Anaranjado" {return new Symbol(sym.laranja,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Celeste" {return new Symbol(sym.celeste,yyline,yychar,new String(yytext()));}

<YYINITIAL> "Trebuchet" {return new Symbol(sym.tre,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Arial" {return new Symbol(sym.arial,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Georgia" {return new Symbol(sym.geor,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Verdana" {return new Symbol(sym.verdana,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Courier" {return new Symbol(sym.courier,yyline,yychar,new String(yytext()));}

<YYINITIAL> "ABAP" {return new Symbol(sym.impo,yyline,yychar,new String(yytext()));}
<YYINITIAL> {dots} {return new Symbol(sym.dot,yyline,yychar,new String(yytext()));}
<YYINITIAL> "=" {return new Symbol(sym.igual,yyline,yychar,new String(yytext()));}
<YYINITIAL> ":" {return new Symbol(sym.dosp,yyline,yychar,new String(yytext()));}
<YYINITIAL> "\"" {return new Symbol(sym.comi,yyline,yychar,new String(yytext()));}
<YYINITIAL>";" {return new Symbol(sym.semi,yyline,yychar,new String(yytext()));}

<YYINITIAL>"@" {return new Symbol(sym.s1,yyline,yychar,new String(yytext()));}
<YYINITIAL>"#" {return new Symbol(sym.s2,yyline,yychar,new String(yytext()));}
<YYINITIAL>"$" {return new Symbol(sym.s3,yyline,yychar,new String(yytext()));}
<YYINITIAL>"%" {return new Symbol(sym.s4,yyline,yychar,new String(yytext()));}
<YYINITIAL> "^" {return new Symbol(sym.s5,yyline,yychar,new String(yytext()));}
<YYINITIAL>"&" {return new Symbol(sym.s6,yyline,yychar,new String(yytext()));}
<YYINITIAL>"*" {return new Symbol(sym.s7,yyline,yychar,new String(yytext()));}
<YYINITIAL>"(" {return new Symbol(sym.s8,yyline,yychar,new String(yytext()));}
<YYINITIAL>")" {return new Symbol(sym.s9,yyline,yychar,new String(yytext()));}
<YYINITIAL>"||" {return new Symbol(sym.s10,yyline,yychar,new String(yytext()));}
<YYINITIAL>"/" {return new Symbol(sym.s11,yyline,yychar,new String(yytext()));}
<YYINITIAL>"," {return new Symbol(sym.com,yyline,yychar,new String(yytext()));}

<YYINITIAL> {LETRAS} {return new Symbol(sym.let,yyline,yychar,new String(yytext()));}
<YYINITIAL>  {NUMBER} {return new Symbol(sym.numerito,yyline,yychar,new String(yytext()));}
<YYINITIAL> {ID} {return new Symbol(sym.ids,yyline,yychar,new String(yytext()));}
<YYINITIAL> [\n] 		{yychar=0;}
<YYINITIAL>  [" "\t\r]+ {}




.
  { 
    Li.add(yyline);
    Co.add(yychar);
    Ca.add(yytext());
    System.out.println("error lexico en "  + (yyline+1) + "," + (yychar+1) + " No se reconoce " + yytext());
    yychar=0;
  }
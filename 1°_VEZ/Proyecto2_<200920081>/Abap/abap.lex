import java.lang.System;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.io.*;
import java.awt.Desktop;
 
%%

%public
%cup
%char
%line

id = [a-zA-Z]([a-zA-Z]|[0-9]|_)*
numerosR = [0-9][0-9]*("."[0-9]+)
numerosE = [0-9][0-9]*
cara = [a-zA-Z]
%state CADENA
%state CARACTER


%{
static ArrayList Linea= new ArrayList();
static ArrayList columna= new ArrayList();
static ArrayList caracter1= new ArrayList();

%}

%{

public static void mistakes1()
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
salArch.print("<table width='200' border='1'><tr><th scope='col'>Numero</th><th scope='col'>Linea</th><th scope='col'>Columna</th><th scope='col'>Error</th></tr>");
int n=0;
//errores,alinea,posicion  son un arrayList del mismo tamano
        for (int i = 0; i<Linea.size(); i++)
        {
            salArch.print("<tr><td>"+(n+1)+"</td><td>"+Linea.get(i)+"</td><td>"+columna.get(i)+"</td><td>"+caracter1.get(i)+"</td></tr>");
n= n+1;

        }

salArch.println("</table><p>&nbsp;</p><p>&nbsp;</p></body></html>");
salArch.close();
                }
                catch (IOException ex) {
}


try {

            File path = new File("Lexy1.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
          //  Logger.getLogger(Proyecto1_Compi1View.class.getName()).log(Level.SEVERE, null, ex);
        }

}



%}

%{
    String texto = "";
    String caracter = "";
%} 



%%


<YYINITIAL> {numerosR} 			{
					    return new Symbol(sym.numReal, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> {numerosE} 			{
					    return new Symbol(sym.numEnt, yyline+1, yychar, new String(yytext())); 
					}
<YYINITIAL> "\""			{
					    texto = "";
					    yybegin(CADENA);
					}
<YYINITIAL> "'"	 			{
					    yybegin(CARACTER);
					}					
<YYINITIAL> "Var"	 		{
					    return new Symbol(sym.var, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "as"	 		{
					    return new Symbol(sym.as, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "Int"	 		{
					    return new Symbol(sym.tint, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "Float"	 		{
					    return new Symbol(sym.tfloat, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "String"	 		{
					    return new Symbol(sym.tstring, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "Bool"	 		{
					    return new Symbol(sym.tbool, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> "Char"	 		{
					    return new Symbol(sym.tchar, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> "if"	 		{
					    return new Symbol(sym.tif, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "else"	 		{
					    return new Symbol(sym.telse, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "for"	 		{
					    return new Symbol(sym.tfor, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "while"	 		{
					    return new Symbol(sym.twhile, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> "Switch"	 		{
					    return new Symbol(sym.tswitch, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "case"	 		{
					    return new Symbol(sym.tcase, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "break"	 		{
					    return new Symbol(sym.tbreak, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "Default"	 		{
					    return new Symbol(sym.tdefault, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "Imprimir"	 		{
					    return new Symbol(sym.imprimir, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "CALL"	 		{
					    return new Symbol(sym.call, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "THIS"	 		{
					    return new Symbol(sym.tthis, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> "VALUE"	 		{
					    return new Symbol(sym.tvalue, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "MINUS"	 		{
					    return new Symbol(sym.minus, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "MAYUS"	 		{
					    return new Symbol(sym.mayus, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "Pasar_Entero"	 	{
					    return new Symbol(sym.castEnt, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "Pasar_Float"	 	{
					    return new Symbol(sym.castFloat, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "Pasar_String"	 	{
					    return new Symbol(sym.castString, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "Use"	 		{
					    return new Symbol(sym.use, yyline+1, yychar, new String(yytext()));
					}									
<YYINITIAL> "abap"	 		{
					    return new Symbol(sym.abap, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "True"	 		{
					    return new Symbol(sym.verdadero, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "False"	 		{
					    return new Symbol(sym.falso, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "Void"	 		{
					    return new Symbol(sym.tvoid, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "Return"	 		{
					    return new Symbol(sym.treturn, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> ";"	 			{
					    return new Symbol(sym.PuntoComa, yyline+1, yychar, new String(yytext()));
					}									
<YYINITIAL> ","	 			{
					    return new Symbol(sym.coma, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "["	 			{
					    return new Symbol(sym.corcheteA, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "]"	 			{
					    return new Symbol(sym.corcheteC, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> "("	 			{
					    return new Symbol(sym.parenA, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> ")"	 			{
					    return new Symbol(sym.parenC, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> "{"	 			{
					    return new Symbol(sym.llaveA, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "}"	 			{
					    return new Symbol(sym.llaveC, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> ":"	 			{
					    return new Symbol(sym.dosPunto, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "="	 			{
					    return new Symbol(sym.igual, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "+"	 			{
					    return new Symbol(sym.mas, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "-"	 			{
					    return new Symbol(sym.menos, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "*"	 			{
					    return new Symbol(sym.multiplicar, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> "/"	 			{
					    return new Symbol(sym.dividir, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "&"	 			{
					    return new Symbol(sym.and, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "|"	 			{
					    return new Symbol(sym.ord, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "!"	 			{
					    return new Symbol(sym.admiracion, yyline+1, yychar, new String(yytext()));
					}					
<YYINITIAL> ">"	 			{
					    return new Symbol(sym.mayor, yyline+1, yychar, new String(yytext()));
					}				
<YYINITIAL> "<"	 			{
					    return new Symbol(sym.menor, yyline+1, yychar, new String(yytext()));
					}	
<YYINITIAL> "."	 			{
					    return new Symbol(sym.punto, yyline+1, yychar, new String(yytext()));
					}
<YYINITIAL> {id} 			{
					    return new Symbol(sym.id, yyline+1, yychar, new String(yytext()));
					}					
					
					
<YYINITIAL> [\n] 			{   yychar=0;	}
<YYINITIAL>  (" "|\r|\t)+		{ 		}

<CADENA> [^"\""]			{
					    texto += yytext();
					}
<CADENA> "\""				{
					    yybegin(YYINITIAL); 
					    return new Symbol(sym.cade, yyline+1, yychar, new String(texto) );
					}
<CARACTER> (" "|\r|\t)+			{ 		}					
<CARACTER> {cara}			{ 		
					    caracter = yytext();
					}
<CARACTER> "'"				{ 		
					    yybegin(YYINITIAL);
					    return new Symbol(sym.caracter, yyline+1, yychar, new String(caracter));
					}					

.
  { 
     Linea.add(yyline);
    columna.add(yychar);
    caracter1.add(yytext());
    
    System.out.println("error lexico en "  + (yyline+1) + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
  }
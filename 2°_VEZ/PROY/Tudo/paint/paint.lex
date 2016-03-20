import java.lang.System;
import java_cup.runtime.*;
import java.util.ArrayList;

%%


%public
%cup
%line    
%char  
%ignorecase
LETRAS = [a-zA-z]+
NUMBER = [0-9][0-9]*
ID = [a-zA-Z]([A-Za-z0-9]|["_"])*
Esc = "Escenario"{NUMBER}
col = "color"{NUMBER}

%state comS
%state comD

%{
public ArrayList Linea= new ArrayList();
public  ArrayList columna= new ArrayList();
public ArrayList caracter= new ArrayList();
public ArrayList tipos= new ArrayList();

public  void llamar()
{

proy1_compi.Paint.CUP$parser$actions.vertodo();   
   
}


public static void pintar(JLabel[][]  matriz,JComboBox boxi )
{
 ArrayList L = proy1_compi.Colores.Yylex.rs();
  ArrayList L2 = proy1_compi.Colores.Yylex.rs2();
    proy1_compi.Paint.CUP$parser$actions.pintar(matriz,boxi,L,L2);

}


%}




%%


<YYINITIAL> "setvar" {return new Symbol(sym.setvar,yyline,yychar,new String(yytext()));}

<YYINITIAL> "Pintar"  {  return new Symbol(sym.pintar,yyline,yychar,new String(yytext())); }
<YYINITIAL> {Esc}  {  return new Symbol(sym.esce,yyline,yychar,new String(yytext()));}
<YYINITIAL> {col}  {  return new Symbol(sym.color,yyline,yychar,new String(yytext()));}
<YYINITIAL> "vars" { return new Symbol(sym.vars,yyline,yychar,new String(yytext()));}
<YYINITIAL> "var" {  return new Symbol(sym.var,yyline,yychar,new String(yytext()));}
<YYINITIAL> {ID}  {  return new Symbol(sym.ids,yyline,yychar,new String(yytext()));}



//Simbolos
<YYINITIAL> "<" {  return new Symbol(sym.abi,yyline,yychar,new String(yytext()));}
<YYINITIAL> ">" {  return new Symbol(sym.cer,yyline,yychar,yytext());}
<YYINITIAL> "(" {  return new Symbol(sym.ini,yyline,yychar,new String(yytext()));}
<YYINITIAL> ")" {  return new Symbol(sym.fin,yyline,yychar,new String(yytext()));}
<YYINITIAL> ":" {  return new Symbol(sym.dponto,yyline,yychar,new String(yytext()));}
<YYINITIAL> "," {  return new Symbol(sym.coma,yyline,yychar,new String(yytext()));}
<YYINITIAL> ";" {  return new Symbol(sym.pyc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "." { return new Symbol(sym.ponto,yyline,yychar,new String(yytext()));}
<YYINITIAL> "-" {  return new Symbol(sym.minus,yyline,yychar,new String(yytext()));}
<YYINITIAL> "+" {  return new Symbol(sym.plus,yyline,yychar,new String(yytext()));}


<YYINITIAL> {NUMBER} { return new Symbol(sym.numero,yyline,yychar,new Integer(yytext()));}



<YYINITIAL> "//" {yybegin(comS); }
<comS> [^\n] {}
<comS> [\n] {yybegin(YYINITIAL); yychar=0;  System.out.println("ComS"); }

<YYINITIAL>"/*" {yybegin(comD); }
<comD>"*"  {}
<comD> [\n] 	{}
<comD> [^"/*"]  {}
<comD> "*/"  {yybegin(YYINITIAL); yychar=0;  System.out.println("ComD"); }

<YYINITIAL> [\n] 		{yychar=0;}
<YYINITIAL>  [" "\t\r]+ {}


.
  { 
    Linea.add(yyline+1);
    columna.add(yychar);
    caracter.add(yytext());
    tipos.add("Lexico");
    
    System.out.println("error lexico en "  + (yyline+1) + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
  }

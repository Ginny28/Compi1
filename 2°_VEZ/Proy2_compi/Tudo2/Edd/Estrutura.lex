import java.lang.System;
import java.util.*;
import java_cup.runtime.*;
%%



%line    
%char  
%ignorecase
%public
%cup
LETRAS = [a-zA-z]+
NUMBER = [0-9][0-9]*
REAL = {NUMBER}"."{NUMBER}
id = [a-zA-Z]([a-zA-Z]|[0-9]|_)*

In = {LETRAS}{Ext}

Ext = ".edd"|".mate"|".prn"


%state comS
%state comD
%state  cadena

%{
public static ArrayList Li= new ArrayList();
public static ArrayList Co= new ArrayList();
public static ArrayList Ca= new ArrayList();
public static ArrayList ki= new ArrayList();
public  ArrayList simbols = new ArrayList();

    String texto = "";

%}


%%


//tudo o demais

<YYINITIAL> "Incluir" 			{ simbols.add(yytext()); simbols.add(yytext()); return new Symbol(sym.inc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "vars" 				{ simbols.add(yytext()); return new Symbol(sym.vars,yyline,yychar,new String(yytext()));}
<YYINITIAL> "setvar" 			{ simbols.add(yytext()); return new Symbol(sym.setvar,yyline,yychar,new String(yytext()));}
<YYINITIAL> "pila" 				{ simbols.add(yytext()); return new Symbol(sym.lifo,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Cola" 				{ simbols.add(yytext()); return new Symbol(sym.fifo,yyline,yychar,new String(yytext()));}
<YYINITIAL> "arreglo" 			{ simbols.add(yytext()); return new Symbol(sym.arrays,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Estructura" 		{ simbols.add(yytext()); return new Symbol(sym.struc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "retorno" 			{ simbols.add(yytext()); return new Symbol(sym.reto,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Si" 					{ simbols.add(yytext()); return new Symbol(sym.ifs,yyline,yychar,new String(yytext()));}
<YYINITIAL> "sino" 				{ simbols.add(yytext()); return new Symbol(sym.elses,yyline,yychar,new String(yytext()));}
<YYINITIAL> "repetir" 			{ simbols.add(yytext()); return new Symbol(sym.rep,yyline,yychar,new String(yytext()));}
<YYINITIAL> "hasta" 				{ simbols.add(yytext()); return new Symbol(sym.until,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Funciones" 		{ simbols.add(yytext()); return new Symbol(sym.func,yyline,yychar,new String(yytext()));}
<YYINITIAL> "funcion" 			{ simbols.add(yytext()); return new Symbol(sym.fu,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "and" 				{ simbols.add(yytext()); return new Symbol(sym.y,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "or" 				{ simbols.add(yytext()); return new Symbol(sym.ou,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "no()" 				{ simbols.add(yytext()); return new Symbol(sym.nao,yyline,yychar,new String(yytext()));}





//funções
<YYINITIAL> "tamanho()" 		{ simbols.add(yytext()); return new Symbol(sym.tam,yyline,yychar,new String(yytext()));}
<YYINITIAL> "insertar" 			{ simbols.add(yytext()); return new Symbol(sym.inser,yyline,yychar,new String(yytext()));}
<YYINITIAL> "extraer" 			{ simbols.add(yytext()); return new Symbol(sym.extr,yyline,yychar,new String(yytext()));}
<YYINITIAL> "vacia()" 			{ simbols.add(yytext()); return new Symbol(sym.empty,yyline,yychar,new String(yytext()));}


//tipos
<YYINITIAL> "entero" 		{ simbols.add(yytext()); return new Symbol(sym.intgr,yyline,yychar,new String(yytext()));}
<YYINITIAL> "cadena" 		{ simbols.add(yytext()); return new Symbol(sym.strng,yyline,yychar,new String(yytext()));}
<YYINITIAL> "decimal" 		{ simbols.add(yytext()); return new Symbol(sym.decimal,yyline,yychar,new String(yytext()));}
<YYINITIAL> "vacio" 			{ simbols.add(yytext()); return new Symbol(sym.voids,yyline,yychar,new String(yytext()));}

//operadores 
<YYINITIAL> ">" 					{ simbols.add(yytext()); return new Symbol(sym.maior,yyline,yychar,new String(yytext()));}
<YYINITIAL> ">=" 				{ simbols.add(yytext()); return new Symbol(sym.maiori,yyline,yychar,new String(yytext()));}
<YYINITIAL> "<" 					{ simbols.add(yytext()); return new Symbol(sym.menor,yyline,yychar,new String(yytext()));}
<YYINITIAL> "<=" 				{ simbols.add(yytext()); return new Symbol(sym.menori,yyline,yychar,new String(yytext()));}
<YYINITIAL> "==" 				{ simbols.add(yytext()); return new Symbol(sym.igual,yyline,yychar,new String(yytext()));}
<YYINITIAL> "<>" 				{ simbols.add(yytext()); return new Symbol(sym.dif,yyline,yychar,new String(yytext()));}






//pontuações

<YYINITIAL> "[" 					{ simbols.add(yytext()); return new Symbol(sym.ab,yyline,yychar,new String(yytext()));}
<YYINITIAL> "]" 					{ simbols.add(yytext()); return new Symbol(sym.fechar,yyline,yychar,new String(yytext()));}
<YYINITIAL> "->" 					{ simbols.add(yytext()); return new Symbol(sym.cosito,yyline,yychar,new String(yytext()));}
<YYINITIAL> ":" 					{ simbols.add(yytext()); return new Symbol(sym.dpts,yyline,yychar,new String(yytext()));}
<YYINITIAL> "." 					{ simbols.add(yytext()); return new Symbol(sym.ponto,yyline,yychar,new String(yytext()));}
<YYINITIAL> "(" 					{ simbols.add(yytext()); return new Symbol(sym.pabi,yyline,yychar,new String(yytext()));}
<YYINITIAL> ")" 					{ simbols.add(yytext()); return new Symbol(sym.pcer,yyline,yychar,new String(yytext()));}
<YYINITIAL> "," 					{ simbols.add(yytext()); return new Symbol(sym.coma,yyline,yychar,new String(yytext()));}
<YYINITIAL> "{" 					{ simbols.add(yytext()); return new Symbol(sym.abrir,yyline,yychar,new String(yytext()));}
<YYINITIAL> "}" 					{ simbols.add(yytext()); return new Symbol(sym.cerrar,yyline,yychar,new String(yytext()));}



<YYINITIAL> {In} 					{ simbols.add(yytext()); return new Symbol(sym.incluish,yyline,yychar,new String(yytext()));}
<YYINITIAL> {id} 					{ simbols.add(yytext()); return new Symbol(sym.ident,yyline,yychar,new String(yytext()));}
<YYINITIAL> {REAL} 				{ simbols.add(yytext()); return new Symbol(sym.real,yyline,yychar,new String(yytext()));}
<YYINITIAL> {NUMBER} 			{ simbols.add(yytext()); return new Symbol(sym.numero,yyline,yychar,new Integer(yytext()));}




<YYINITIAL> [\n] 		{yychar=0; texto="";}
<YYINITIAL>  (" "|\r|\t)+	{ }

<YYINITIAL>"\"" {yybegin(cadena); }
<cadena> {LETRAS}  { texto += yytext();}
<cadena> [\n] 	{}
<cadena> (" "|\r|\t)+	{ texto += yytext(); }
<cadena> "\""  {yybegin(YYINITIAL); yychar=0;   simbols.add(texto); return new Symbol(sym.cade,yyline,yychar,new String(texto)); }





//comentarios

<YYINITIAL> "//" {yybegin(comS); }
<comS> [^\n] {}
<comS> [\n] {yybegin(YYINITIAL); yychar=0;  System.out.println("ComS"); }

<YYINITIAL>"/*" {yybegin(comD); }
<comD>"*"  {}
<comD> [\n] 	{}
<comD> [^"/*"]  {}
<comD> "*/"  {yybegin(YYINITIAL); yychar=0;  System.out.println("ComD"); }




.
  { 
      Li.add(yyline+1);
    Co.add(yychar);
    Ca.add(yytext());
    ki.add("Lexico");
    System.out.println("error lexico en "  + (yyline+1) + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
  }


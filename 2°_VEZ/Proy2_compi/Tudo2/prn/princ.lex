package proy2_compi.prn;
import java.lang.System;
import java.util.*;
import java_cup.runtime.*;
%%



%line    
%char  
%cup
%public
%ignorecase
LETRAS = [a-zA-z]+
NUMBER = [0-9][0-9]*
REAL = {NUMBER}"."{NUMBER}
id = [a-zA-Z]([a-zA-Z]|[0-9]|_)*

In = {LETRAS}{Ext}



Ext = ".edd"|".mate"|".prn"


%state comS
%state comD
%state cadena


%{
public static ArrayList Li= new ArrayList();
public static ArrayList Co= new ArrayList();
public static ArrayList Ca= new ArrayList();
public static ArrayList ki= new ArrayList();
public static ArrayList simbols= new ArrayList();
String texto="";
%}




%%

<YYINITIAL> "incluir" 		{ simbols.add(yytext()); return new Symbol(sym.inc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "variables" 		{ simbols.add(yytext()); return new Symbol(sym.vars,yyline,yychar,new String(yytext()));}
<YYINITIAL> "concat" 		{ simbols.add(yytext()); return new Symbol(sym.concat,yyline,yychar,new String(yytext()));}
<YYINITIAL> "as" 				{ simbols.add(yytext()); return new Symbol(sym.as,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "setvar" 		{ simbols.add(yytext()); return new Symbol(sym.svar,yyline,yychar,new String(yytext()));}
<YYINITIAL> "funciones" 	{ simbols.add(yytext()); return new Symbol(sym.funcs,yyline,yychar,new String(yytext()));}
<YYINITIAL> "fin" 			{ simbols.add(yytext()); return new Symbol(sym.end,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Si" 				{ simbols.add(yytext()); return new Symbol(sym.ifs,yyline,yychar,new String(yytext()));}
<YYINITIAL> "sino" 			{ simbols.add(yytext()); return new Symbol(sym.elses,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Fin si" 			{ simbols.add(yytext()); return new Symbol(sym.endif,yyline,yychar,new String(yytext()));}
<YYINITIAL> "para" 			{ simbols.add(yytext()); return new Symbol(sym.fors,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Fin para" 		{ simbols.add(yytext()); return new Symbol(sym.endfor,yyline,yychar,new String(yytext()));}
<YYINITIAL> "imprimir" 		{ simbols.add(yytext()); return new Symbol(sym.prints,yyline,yychar,new String(yytext()));}
<YYINITIAL> "escribir" 		{ simbols.add(yytext()); return new Symbol(sym.writes,yyline,yychar,new String(yytext()));}
<YYINITIAL> "agregar" 		{ simbols.add(yytext()); return new Symbol(sym.adds,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "and" 			{ simbols.add(yytext()); return new Symbol(sym.y,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "or" 			{ simbols.add(yytext()); return new Symbol(sym.ou,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "no()" 			{ simbols.add(yytext()); return new Symbol(sym.nao,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "principal" 	       { simbols.add(yytext()); return new Symbol(sym.prink,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "sum"	 	       { simbols.add(yytext()); return new Symbol(sym.sum,yyline,yychar,new String(yytext()));}


//tipos
<YYINITIAL> "entero" 		{ simbols.add(yytext()); return new Symbol(sym.intgr,yyline,yychar,new String(yytext()));}
<YYINITIAL> "cadena" 		{ simbols.add(yytext()); return new Symbol(sym.strng,yyline,yychar,new String(yytext()));}
<YYINITIAL> "decimal" 		{ simbols.add(yytext()); return new Symbol(sym.decimal,yyline,yychar,new String(yytext()));}
<YYINITIAL> "vacio" 			{ simbols.add(yytext()); return new Symbol(sym.voids,yyline,yychar,new String(yytext()));}

//operadores 
<YYINITIAL> ">" 				{ simbols.add(yytext()); return new Symbol(sym.maior,yyline,yychar,new String(yytext()));}
<YYINITIAL> ">=" 			{ simbols.add(yytext()); return new Symbol(sym.maiori,yyline,yychar,new String(yytext()));}
<YYINITIAL> "<" 				{ simbols.add(yytext()); return new Symbol(sym.menor,yyline,yychar,new String(yytext()));}
<YYINITIAL> "<=" 			{ simbols.add(yytext()); return new Symbol(sym.menori,yyline,yychar,new String(yytext()));}
<YYINITIAL> "==" 			{ simbols.add(yytext()); return new Symbol(sym.igual,yyline,yychar,new String(yytext()));}
<YYINITIAL> "<>" 			{ simbols.add(yytext()); return new Symbol(sym.dif,yyline,yychar,new String(yytext()));}


//pontuações

<YYINITIAL> ":" 				{ simbols.add(yytext()); return new Symbol(sym.dpts,yyline,yychar,new String(yytext()));}
<YYINITIAL> "(" 				{ simbols.add(yytext()); return new Symbol(sym.pabi,yyline,yychar,new String(yytext()));}
<YYINITIAL> ")" 				{ simbols.add(yytext()); return new Symbol(sym.pcer,yyline,yychar,new String(yytext()));}
<YYINITIAL> "," 				{ simbols.add(yytext()); return new Symbol(sym.coma,yyline,yychar,new String(yytext()));}
<YYINITIAL> ";" 				{ simbols.add(yytext()); return new Symbol(sym.pyc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "'" 				{ simbols.add(yytext()); return new Symbol(sym.apos,yyline,yychar,new String(yytext()));}
<YYINITIAL> "=" 				{ simbols.add(yytext()); return new Symbol(sym.iguais,yyline,yychar,new String(yytext()));}


<YYINITIAL> {In} 				{ simbols.add(yytext()); return new Symbol(sym.incluish,yyline,yychar,new String(yytext()));}
<YYINITIAL> {id} 				{ simbols.add(yytext()); return new Symbol(sym.ident,yyline,yychar,new String(yytext()));}
<YYINITIAL> {REAL} 			{ simbols.add(yytext()); return new Symbol(sym.real,yyline,yychar,new String(yytext()));}
<YYINITIAL> {NUMBER} 		{ simbols.add(yytext()); return new Symbol(sym.numero,yyline,yychar,new Integer(yytext()));}



<YYINITIAL>"\"" {yybegin(cadena); }
<cadena> {LETRAS}  { texto += yytext();}
<cadena> {NUMBER}  { texto += yytext();}
<cadena> [\n] 	{ texto += yytext();}
<cadena> [\W]	{ texto += yytext();}
<cadena> "/"	{ texto += yytext();}
<cadena> "."	{ texto += yytext();}
<cadena> ","	{ texto += yytext();}
<cadena> (" "|\r|\t)+	{ }
<cadena> "\""  {yybegin(YYINITIAL); yychar=0;   simbols.add(texto); return new Symbol(sym.cade,yyline,yychar,new String(texto));  }



<YYINITIAL> [\n] 		{yychar=0; texto="";}
<YYINITIAL>  (" "|\r|\t)+	{ }






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


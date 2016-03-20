import java.lang.System;
import java.util.*;
import java_cup.runtime.*;
%%


%line    
%char  
%public
%ignorecase
%cup
LETRAS = [a-zA-z]+
NUMBER = [0-9][0-9]*
REAL = {NUMBER}"."{NUMBER}
ID = [a-zA-Z]([a-zA-Z]|[0-9]|_)*

In = {LETRAS}{Ext}

Ext = ".edd"|".mate"|".prn"


%state comS
%state comD

%{
public static ArrayList Li= new ArrayList();
public static ArrayList Co= new ArrayList();
public static ArrayList Ca= new ArrayList();
public static ArrayList ki= new ArrayList();
public static ArrayList simbols = new ArrayList();
public static ArrayList simbols= new ArrayList();
%}

%%

// o Reservado 



<YYINITIAL> "Declarar" 			{ simbols.add(yytext()); return new Symbol(sym.dec,yyline,yychar,new String(yytext())); }
<YYINITIAL> "Fin Declarar" 		{ simbols.add(yytext()); return new Symbol(sym.fdec,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Incluir" 			{ simbols.add(yytext()); return new Symbol(sym.inc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Si" 					{ simbols.add(yytext()); return new Symbol(sym.ifs,yyline,yychar,new String(yytext()));}
<YYINITIAL> "sino" 				{ simbols.add(yytext()); return new Symbol(sym.elses,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Fin si" 				{ simbols.add(yytext()); return new Symbol(sym.endif,yyline,yychar,new String(yytext()));}
<YYINITIAL> "para" 				{ simbols.add(yytext()); return new Symbol(sym.fors,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Fin para" 			{ simbols.add(yytext()); return new Symbol(sym.endfor,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Mientras" 			{ simbols.add(yytext()); return new Symbol(sym.whiles,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Fin Mientras" 		{ simbols.add(yytext()); return new Symbol(sym.endwhile,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Funciones" 		{ simbols.add(yytext()); return new Symbol(sym.func,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Fin funciones" 	{ simbols.add(yytext()); return new Symbol(sym.finfuc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Definir" 			{ simbols.add(yytext()); return new Symbol(sym.def,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Fin definir" 		{ simbols.add(yytext()); return new Symbol(sym.findef,yyline,yychar,new String(yytext()));}
<YYINITIAL> "retorno"     		{ simbols.add(yytext()); return new Symbol(sym.reto,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "and" 				{ simbols.add(yytext()); return new Symbol(sym.y,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "or" 				{ simbols.add(yytext()); return new Symbol(sym.ou,yyline,yychar,new String(yytext()));}
<YYINITIAL>  "no()" 				{ simbols.add(yytext()); return new Symbol(sym.nao,yyline,yychar,new String(yytext()));}



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






<YYINITIAL> {In} 					{ simbols.add(yytext()); return new Symbol(sym.incluish,yyline,yychar,new String(yytext()));}
<YYINITIAL> {ID} 					{ simbols.add(yytext()); return new Symbol(sym.ident,yyline,yychar,new String(yytext()));}
<YYINITIAL> {REAL} 				{ simbols.add(yytext()); return new Symbol(sym.real,yyline,yychar,new String(yytext()));}
<YYINITIAL> {NUMBER} 			{ simbols.add(yytext()); return new Symbol(sym.numero,yyline,yychar,new Integer(yytext()));}
<YYINITIAL> "->" 					{ simbols.add(yytext()); return new Symbol(sym.cosito,yyline,yychar,new String(yytext()));}
<YYINITIAL> ":" 					{ simbols.add(yytext()); return new Symbol(sym.dpts,yyline,yychar,new String(yytext()));}
<YYINITIAL> ";" 					{ simbols.add(yytext()); return new Symbol(sym.pyc,yyline,yychar,new String(yytext()));}
<YYINITIAL> "(" 					{ simbols.add(yytext()); return new Symbol(sym.abi,yyline,yychar,new String(yytext()));}
<YYINITIAL> ")" 					{ simbols.add(yytext()); return new Symbol(sym.cerra,yyline,yychar,new String(yytext()));}
<YYINITIAL> "," 					{ simbols.add(yytext()); return new Symbol(sym.coma,yyline,yychar,new String(yytext()));}









// operações
<YYINITIAL> "^" 					{ simbols.add(yytext()); return new Symbol(sym.pot,yyline,yychar,new String(yytext()));}
<YYINITIAL> "+" 					{ simbols.add(yytext()); return new Symbol(sym.mais,yyline,yychar,new String(yytext()));}
<YYINITIAL> "-" 					{ simbols.add(yytext()); return new Symbol(sym.menos,yyline,yychar,new String(yytext()));}
<YYINITIAL> "*" 					{ simbols.add(yytext()); return new Symbol(sym.multi,yyline,yychar,new String(yytext()));}
<YYINITIAL> "/" 					{ simbols.add(yytext()); return new Symbol(sym.div,yyline,yychar,new String(yytext()));}
<YYINITIAL> "%" 					{ simbols.add(yytext()); return new Symbol(sym.mod,yyline,yychar,new String(yytext()));}

 
 
<YYINITIAL> [\n] 		{yychar=0;}
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
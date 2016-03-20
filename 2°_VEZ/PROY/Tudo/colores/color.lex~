import java.lang.System;
import java_cup.runtime.*;
import java.util.ArrayList;

%%

%public
%cup
%line    
%char  
%ignorecase
hexa = "#"("0"|"1"|"2"|"3"|"4"|"5"|"6"|"7"|"8"|"9"|"a"|"b"|"c"|"d"|"e"|"f")*
colo= "color"{NUMBER}
Esc = "Escenario"{NUMBER}
NUMBER = [0-9][0-9]*

%state comS
%state comD

%{
public ArrayList Linea= new ArrayList();
public  ArrayList columna= new ArrayList();
public ArrayList caracter= new ArrayList();
public ArrayList tipos= new ArrayList();

public static void llamar(JComboBox boxi )
{
    proy1_compi.Colores.CUP$parser$actions.vertodo(boxi);
}

public static void crearColor(JComboBox boxis, JPanel pane2)
{

    proy1_compi.Colores.CUP$parser$actions.crear(boxis, pane2);

}
public static ArrayList rs2()
{
    
    return  proy1_compi.Colores.CUP$parser$actions.co2;

}


public static ArrayList rs()
{
    
    return  proy1_compi.Colores.CUP$parser$actions.co1;

}

public static void rss()
{
 for(int i=0;i<proy1_compi.Colores.CUP$parser$actions.co1.size();i++ )
 {
 System.out.println(proy1_compi.Colores.CUP$parser$actions.co1.get(i));
 System.out.println(proy1_compi.Colores.CUP$parser$actions.co2.get(i));
 }
 
 
}


%}


%%

<YYINITIAL> "colores" { return new Symbol(sym.colores,yyline,yychar,new String(yytext()));}
<YYINITIAL> {colo}  { return new Symbol(sym.color,yyline,yychar,new String(yytext()));}
<YYINITIAL> "red" { return new Symbol(sym.red,yyline,yychar,new String(yytext()));}
<YYINITIAL> "blue" { return new Symbol(sym.blue,yyline,yychar,new String(yytext()));}
<YYINITIAL> "green" { return new Symbol(sym.green,yyline,yychar,new String(yytext()));}

<YYINITIAL> {Esc} { return new Symbol(sym.esce,yyline,yychar,new String(yytext()));}
<YYINITIAL> "Hex" { return new Symbol(sym.hex,yyline,yychar,new String(yytext()));}
<YYINITIAL> {hexa} { return new Symbol(sym.hexc,yyline,yychar,new String(yytext()));}


//Simbolos
<YYINITIAL> "{" { return new Symbol(sym.abi,yyline,yychar,new String(yytext()));}
<YYINITIAL> "}" { return new Symbol(sym.cer,yyline,yychar,new String(yytext()));}
<YYINITIAL> ":" { return new Symbol(sym.dponto,yyline,yychar,new String(yytext()));}
<YYINITIAL> "," { return new Symbol(sym.coma,yyline,yychar,new String(yytext()));}

<YYINITIAL> {NUMBER} { return new Symbol(sym.numero,yyline,yychar,new String(yytext()));}






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
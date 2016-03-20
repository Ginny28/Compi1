package practik1;


import java.util.ArrayList;

class Yytoken {
  Yytoken () {}
}
 
%%


%line    
%char  


%state COMENTARIO
%state coments

%{
ArrayList lista1= new ArrayList();
ArrayList list2 = new ArrayList();
ArrayList list3 = new ArrayList();


%}




%%
 

<YYINITIAL> "i" 		{ System.out.println ("inicio");}
<YYINITIAL> "," 		{ System.out.println ("COMA ");}
<YYINITIAL> "p" 		{ System.out.println ("Pared");}
<YYINITIAL> "c" 		{ System.out.println ("caminito ");}
<YYINITIAL> "b" 		{ System.out.println ("puntitos");}
<YYINITIAL> "o" 		{ System.out.println ("menospuntitos");}
<YYINITIAL> "f" 		{ System.out.println ("fin");}
<YYINITIAL> ";" 		{ System.out.println ("PUNTO Y COMA ");}
	
 
<YYINITIAL> [\n] 		{yychar=0;}
<YYINITIAL>  (" "|\r|\t)+	{ }
<YYINITIAL> "/*"		{yybegin(COMENTARIO);
						 System.out.println("Aqui inicia el esado con /*");
						}
<COMENTARIO> [\n]		{System.out.println ("Una linea de comentario");}
<COMENTARIO> "*"		{}
<COMENTARIO> [^"*/"]	{}
<COMENTARIO> "*/"		{yybegin(YYINITIAL);
						System.out.println ("Aqui Termina el comentario con */");
						}

<YYINITIAL> "//" 		{yybegin(coments); System.out.println("Inicia comentario //");}

<coments> [^\n]			{}
<coments> [\n] 			{yybegin(YYINITIAL);yychar=0;}



.
  { 
    lista1.add(yyline);
    list2.add(yychar);
    list3.add(yytext());
    System.out.println("error lexico en "  + yyline + "," + yychar + " No se reconoce " + yytext());
    
    yychar=0;
  }
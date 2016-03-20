import java.lang.System;



class Ytoken {
  Ytoken () {}
}
 
%%
%class movin

%line    
%char  

NUMBER = [1-9][0-9]*
diry= (N|S|n|s)
dirx= (E|O|e|o)
x= (x|X)
y= (y|Y)
coman = Mover
coma = ,
pc = ; 
pa= (
pcr= )

Exp1= {x}{coma}{NUMBER}{coma}{dirx}
Exp2= {y}{coma}{NUMBER}{coma}{diry}

%%
<YYINITIAL> {coman} {System.out.println("moving");}
<YYINITIAL> "("     { System.out.println("(parab");}
<YYINITIAL> {Exp1}	    {System.out.println("mov x");}
<YYINITIAL> {Exp2}     {System.out.println("mov y");}
<YYINITIAL> ")"     { System.out.println("parcer");}
<YYINITIAL> ";" 	{ System.out.println ("PUNTO Y COMA ");}

<YYINITIAL> [\n] 		{yychar=0;}

.
  { 
    System.out.println("error lexico en "  + yyline + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
  }
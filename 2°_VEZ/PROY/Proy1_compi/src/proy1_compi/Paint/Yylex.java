package proy1_compi.Paint;/* The following code was generated by JFlex 1.4.3 on 4/18/13 7:55 PM */

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.System;
import java_cup.runtime.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/18/13 7:55 PM from the specification file
 * <tt>paint.lex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int comD = 4;
  public static final int YYINITIAL = 0;
  public static final int comS = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\35\1\33\2\0\1\35\22\0\1\35\7\0\1\22\1\23"+
    "\1\34\1\31\1\25\1\30\1\27\1\32\12\1\1\24\1\26\1\20"+
    "\1\0\1\21\2\0\1\10\1\2\1\6\1\2\1\4\3\2\1\12"+
    "\2\2\1\14\1\2\1\7\1\13\1\17\1\2\1\11\1\5\1\15"+
    "\1\2\1\16\4\2\4\0\1\3\1\0\1\10\1\2\1\6\1\2"+
    "\1\4\3\2\1\12\2\2\1\14\1\2\1\7\1\13\1\17\1\2"+
    "\1\11\1\5\1\15\1\2\1\16\4\2\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\6\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\1\1\16"+
    "\2\17\1\20\1\17\5\3\1\21\1\22\1\23\3\3"+
    "\1\24\4\3\1\25\6\3\1\26\1\27\1\30\3\3"+
    "\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[57];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\322"+
    "\0\360\0\u010e\0\u012c\0\132\0\132\0\132\0\132\0\132"+
    "\0\132\0\132\0\132\0\132\0\132\0\u014a\0\132\0\u0168"+
    "\0\132\0\132\0\u0186\0\u01a4\0\u01c2\0\u01e0\0\u01fe\0\u021c"+
    "\0\132\0\132\0\132\0\u023a\0\u0258\0\u0276\0\u0294\0\u02b2"+
    "\0\u02d0\0\u02ee\0\u030c\0\226\0\u032a\0\u0348\0\u0366\0\u0384"+
    "\0\u03a2\0\u03c0\0\226\0\u0384\0\226\0\u03de\0\u03fc\0\u041a"+
    "\0\u041a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[57];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\4\1\7\1\10\1\11\7\6"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\4\1\30"+
    "\33\31\1\32\34\31\1\4\1\31\1\33\1\31\37\0"+
    "\1\5\35\0\17\6\17\0\4\6\1\34\12\6\17\0"+
    "\3\6\1\35\13\6\17\0\12\6\1\36\4\6\17\0"+
    "\7\6\1\37\7\6\17\0\11\6\1\40\5\6\50\0"+
    "\1\41\1\0\1\42\36\0\1\30\32\0\1\43\4\0"+
    "\5\6\1\44\11\6\17\0\14\6\1\45\2\6\17\0"+
    "\13\6\1\46\3\6\17\0\10\6\1\47\6\6\17\0"+
    "\6\6\1\50\10\6\17\0\3\6\1\51\13\6\17\0"+
    "\15\6\1\52\1\6\17\0\12\6\1\53\4\6\17\0"+
    "\4\6\1\54\12\6\17\0\14\6\1\55\2\6\17\0"+
    "\6\6\1\56\10\6\17\0\7\6\1\57\7\6\17\0"+
    "\10\6\1\60\6\6\17\0\7\6\1\61\7\6\17\0"+
    "\7\6\1\62\7\6\17\0\10\6\1\63\6\6\17\0"+
    "\1\64\16\6\17\0\10\6\1\65\6\6\17\0\10\6"+
    "\1\66\6\6\17\0\11\6\1\67\5\6\17\0\12\6"+
    "\1\70\4\6\17\0\1\71\16\6\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1080];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\7\1\12\11\1\1\1\11\1\1\2\11"+
    "\6\1\3\11\26\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[57];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
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

public static void pintMatriz(JLabel[][] matriz, String posx , String posy, String colors)
{
proy1_compi.Paint.CUP$parser$actions.pintarMatriz(matriz, posx, posy, colors);

}






  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 134) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 24: 
          { return new Symbol(sym.pintar,yyline,yychar,new String(yytext()));
          }
        case 26: break;
        case 22: 
          { return new Symbol(sym.setvar,yyline,yychar,new String(yytext()));
          }
        case 27: break;
        case 4: 
          { return new Symbol(sym.abi,yyline,yychar,new String(yytext()));
          }
        case 28: break;
        case 14: 
          { yychar=0;
          }
        case 29: break;
        case 3: 
          { return new Symbol(sym.ids,yyline,yychar,new String(yytext()));
          }
        case 30: break;
        case 18: 
          { yybegin(comD);
          }
        case 31: break;
        case 19: 
          { yybegin(YYINITIAL); yychar=0;  System.out.println("ComD");
          }
        case 32: break;
        case 8: 
          { return new Symbol(sym.dponto,yyline,yychar,new String(yytext()));
          }
        case 33: break;
        case 25: 
          { return new Symbol(sym.esce,yyline,yychar,new String(yytext()));
          }
        case 34: break;
        case 5: 
          { return new Symbol(sym.cer,yyline,yychar,yytext());
          }
        case 35: break;
        case 1: 
          { Linea.add(yyline+1);
    columna.add(yychar);
    caracter.add(yytext());
    tipos.add("Lexico");
    
    System.out.println("error lexico en "  + (yyline+1) + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
          }
        case 36: break;
        case 17: 
          { yybegin(comS);
          }
        case 37: break;
        case 9: 
          { return new Symbol(sym.coma,yyline,yychar,new String(yytext()));
          }
        case 38: break;
        case 16: 
          { yybegin(YYINITIAL); yychar=0;  System.out.println("ComS");
          }
        case 39: break;
        case 23: 
          { return new Symbol(sym.color,yyline,yychar,new String(yytext()));
          }
        case 40: break;
        case 13: 
          { return new Symbol(sym.plus,yyline,yychar,new String(yytext()));
          }
        case 41: break;
        case 21: 
          { return new Symbol(sym.vars,yyline,yychar,new String(yytext()));
          }
        case 42: break;
        case 20: 
          { return new Symbol(sym.var,yyline,yychar,new String(yytext()));
          }
        case 43: break;
        case 11: 
          { return new Symbol(sym.ponto,yyline,yychar,new String(yytext()));
          }
        case 44: break;
        case 10: 
          { return new Symbol(sym.pyc,yyline,yychar,new String(yytext()));
          }
        case 45: break;
        case 12: 
          { return new Symbol(sym.minus,yyline,yychar,new String(yytext()));
          }
        case 46: break;
        case 2: 
          { return new Symbol(sym.numero,yyline,yychar,new Integer(yytext()));
          }
        case 47: break;
        case 6: 
          { return new Symbol(sym.ini,yyline,yychar,new String(yytext()));
          }
        case 48: break;
        case 15: 
          { 
          }
        case 49: break;
        case 7: 
          { return new Symbol(sym.fin,yyline,yychar,new String(yytext()));
          }
        case 50: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

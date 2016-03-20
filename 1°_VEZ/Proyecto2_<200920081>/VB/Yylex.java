/* The following code was generated by JFlex 1.4.3 on 11/15/12 1:23 AM */

import java.lang.System;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.io.*;
import java.awt.Desktop;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/15/12 1:23 AM from the specification file
 * <tt>VB.lex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\35\1\34\2\0\1\35\22\0\1\35\7\0\1\31\1\32"+
    "\2\0\1\33\1\0\1\4\1\0\1\2\11\1\7\0\1\5\1\6"+
    "\1\10\1\26\1\20\1\3\1\11\1\3\1\12\2\3\1\17\1\13"+
    "\1\25\1\14\1\7\1\3\1\15\1\3\1\16\1\23\1\22\1\24"+
    "\7\3\1\21\1\3\1\5\1\6\1\10\1\26\1\20\1\3\1\11"+
    "\1\3\1\12\2\3\1\17\1\13\1\25\1\14\1\7\1\3\1\15"+
    "\1\3\1\16\1\23\1\22\1\24\3\3\1\27\1\0\1\30\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\6\3\1\5\2\3"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\12\3"+
    "\1\15\1\16\7\3\1\17\1\20\3\3\1\21\1\22"+
    "\4\3\1\23\2\3\1\24\10\3\1\25\4\3\1\26"+
    "\2\3\1\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[72];
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
    "\0\0\0\36\0\74\0\132\0\36\0\170\0\226\0\264"+
    "\0\322\0\360\0\u010e\0\132\0\u012c\0\u014a\0\36\0\36"+
    "\0\36\0\36\0\36\0\36\0\u0168\0\u0186\0\u01a4\0\u01c2"+
    "\0\u01e0\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276\0\u0294\0\132"+
    "\0\132\0\u02b2\0\u02d0\0\u02ee\0\u030c\0\u032a\0\u0348\0\u0366"+
    "\0\132\0\132\0\u0384\0\u03a2\0\u03c0\0\132\0\132\0\u03de"+
    "\0\u03fc\0\u041a\0\u0438\0\132\0\u0456\0\u0474\0\132\0\u0492"+
    "\0\u04b0\0\u04ce\0\u04ec\0\u050a\0\u0528\0\u0546\0\u0564\0\132"+
    "\0\u0582\0\u05a0\0\u05be\0\u05dc\0\132\0\u05fa\0\u0618\0\132";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[72];
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
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\4\1\7"+
    "\1\10\1\11\1\12\1\13\5\4\1\14\1\15\1\4"+
    "\1\16\2\4\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\37\0\2\3\36\0\1\4\1\0\22\4\12\0"+
    "\1\4\1\0\1\4\1\26\20\4\12\0\1\4\1\0"+
    "\1\27\21\4\12\0\1\4\1\0\1\30\7\4\1\31"+
    "\11\4\12\0\1\4\1\0\13\4\1\32\6\4\12\0"+
    "\1\4\1\0\6\4\1\33\13\4\12\0\1\4\1\0"+
    "\1\34\21\4\12\0\1\4\1\0\7\4\1\35\12\4"+
    "\12\0\1\4\1\0\10\4\1\36\11\4\44\0\1\25"+
    "\3\0\1\4\1\0\1\37\21\4\12\0\1\4\1\0"+
    "\4\4\1\40\15\4\12\0\1\4\1\0\1\4\1\41"+
    "\10\4\1\42\7\4\12\0\1\4\1\0\13\4\1\43"+
    "\6\4\12\0\1\4\1\0\11\4\1\44\10\4\12\0"+
    "\1\4\1\0\2\4\1\45\17\4\12\0\1\4\1\0"+
    "\5\4\1\46\14\4\12\0\1\4\1\0\5\4\1\47"+
    "\14\4\12\0\1\4\1\0\5\4\1\50\14\4\12\0"+
    "\1\4\1\0\2\4\1\51\17\4\12\0\1\4\1\0"+
    "\12\4\1\52\7\4\12\0\1\4\1\0\1\53\21\4"+
    "\12\0\1\4\1\0\14\4\1\54\5\4\12\0\1\4"+
    "\1\0\7\4\1\55\12\4\12\0\1\4\1\0\20\4"+
    "\1\56\1\4\12\0\1\4\1\0\21\4\1\57\12\0"+
    "\1\4\1\0\11\4\1\60\10\4\12\0\1\4\1\0"+
    "\10\4\1\61\11\4\12\0\1\4\1\0\15\4\1\62"+
    "\4\4\12\0\1\4\1\0\10\4\1\63\11\4\12\0"+
    "\1\4\1\0\13\4\1\64\6\4\12\0\1\4\1\0"+
    "\14\4\1\65\5\4\12\0\1\4\1\0\1\66\21\4"+
    "\12\0\1\4\1\0\11\4\1\67\10\4\12\0\1\4"+
    "\1\0\2\4\1\70\1\71\16\4\12\0\1\4\1\0"+
    "\12\4\1\72\7\4\12\0\1\4\1\0\1\73\21\4"+
    "\12\0\1\4\1\0\1\74\21\4\12\0\1\4\1\0"+
    "\16\4\1\75\3\4\12\0\1\4\1\0\4\4\1\76"+
    "\15\4\12\0\1\4\1\0\1\4\1\77\20\4\12\0"+
    "\1\4\1\0\13\4\1\100\6\4\12\0\1\4\1\0"+
    "\5\4\1\101\14\4\12\0\1\4\1\0\13\4\1\102"+
    "\6\4\12\0\1\4\1\0\20\4\1\103\1\4\12\0"+
    "\1\4\1\0\3\4\1\104\16\4\12\0\1\4\1\0"+
    "\1\105\21\4\12\0\1\4\1\0\13\4\1\106\6\4"+
    "\12\0\1\4\1\0\10\4\1\107\11\4\12\0\1\4"+
    "\1\0\1\110\21\4\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1590];
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
    "\1\0\1\11\2\1\1\11\11\1\6\11\64\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[72];
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
static ArrayList line= new ArrayList();
static ArrayList colu= new ArrayList();
static ArrayList carac= new ArrayList();

public static void mistakes4()
{
String Reporte= "Lexy4.html";
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
        for (int i = 0; i<line.size(); i++)
        {
            salArch.print("<tr><td>"+(n+1)+"</td><td>"+line.get(i)+"</td><td>"+colu.get(i)+"</td><td>"+carac.get(i)+"</td></tr>");
n= n+1;

        }

salArch.println("</table><p>&nbsp;</p><p>&nbsp;</p></body></html>");
salArch.close();
                }
                catch (IOException ex) {
}


try {

            File path = new File("Lexy4.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
          //  Logger.getLogger(Proyecto1_Compi1View.class.getName()).log(Level.SEVERE, null, ex);
        }

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
    while (i < 140) {
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
        case 17: 
          { return new Symbol(sym.princ,yyline,yychar,new String(yytext()));
          }
        case 24: break;
        case 11: 
          { yychar=0;
          }
        case 25: break;
        case 5: 
          { return new Symbol(sym.s1,yyline,yychar,new String(yytext()));
          }
        case 26: break;
        case 19: 
          { return new Symbol(sym.escrivir,yyline,yychar,new String(yytext()));
          }
        case 27: break;
        case 13: 
          { return new Symbol(sym.pg,yyline,yychar,new String(yytext()));
          }
        case 28: break;
        case 6: 
          { return new Symbol(sym.ya,yyline,yychar,new String(yytext()));
          }
        case 29: break;
        case 22: 
          { return new Symbol(sym.cp,yyline,yychar,new String(yytext()));
          }
        case 30: break;
        case 10: 
          { return new Symbol(sym.com,yyline,yychar,new String(yytext()));
          }
        case 31: break;
        case 21: 
          { return new Symbol(sym.gv,yyline,yychar,new String(yytext()));
          }
        case 32: break;
        case 14: 
          { return new Symbol(sym.kb,yyline,yychar,new String(yytext()));
          }
        case 33: break;
        case 1: 
          { line.add(yyline);
    colu.add(yychar);
    carac.add(yytext());
    System.out.println("error lexico en "  + (yyline+1) + "," + (yychar+1) + " No se reconoce " + yytext());
    yychar=0;
          }
        case 34: break;
        case 2: 
          { return new Symbol(sym.numerito,yyline,yychar,new String(yytext()));
          }
        case 35: break;
        case 3: 
          { return new Symbol(sym.let,yyline,yychar,new String(yytext()));
          }
        case 36: break;
        case 16: 
          { return new Symbol(sym.chama,yyline,yychar,new String(yytext()));
          }
        case 37: break;
        case 9: 
          { return new Symbol(sym.s3,yyline,yychar,new String(yytext()));
          }
        case 38: break;
        case 23: 
          { return new Symbol(sym.cc,yyline,yychar,new String(yytext()));
          }
        case 39: break;
        case 4: 
          { return new Symbol(sym.dot,yyline,yychar,new String(yytext()));
          }
        case 40: break;
        case 18: 
          { return new Symbol(sym.voids,yyline,yychar,new String(yytext()));
          }
        case 41: break;
        case 15: 
          { return new Symbol(sym.abap,yyline,yychar,new String(yytext()));
          }
        case 42: break;
        case 7: 
          { return new Symbol(sym.yc,yyline,yychar,new String(yytext()));
          }
        case 43: break;
        case 20: 
          { return new Symbol(sym.imps,yyline,yychar,new String(yytext()));
          }
        case 44: break;
        case 8: 
          { return new Symbol(sym.s2,yyline,yychar,new String(yytext()));
          }
        case 45: break;
        case 12: 
          { 
          }
        case 46: break;
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

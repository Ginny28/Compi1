/* The following code was generated by JFlex 1.4.3 on 5/26/13 10:02 PM */

import java.lang.System;
import java.util.*;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/26/13 10:02 PM from the specification file
 * <tt>mate.lex</tt>
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
    "\11\0\1\46\1\45\2\0\1\46\22\0\1\22\4\0\1\44\2\0"+
    "\1\26\1\27\1\42\1\41\1\37\1\34\1\3\1\43\12\2\1\35"+
    "\1\36\1\33\1\32\1\31\2\0\1\11\1\4\1\16\1\7\1\6"+
    "\1\20\2\4\1\21\2\4\1\17\1\10\1\15\1\25\1\13\1\4"+
    "\1\14\1\24\1\12\1\23\1\30\4\4\3\1\1\40\1\5\1\1"+
    "\1\11\1\4\1\16\1\7\1\6\1\20\2\4\1\21\2\4\1\17"+
    "\1\10\1\15\1\25\1\13\1\4\1\14\1\24\1\12\1\23\1\30"+
    "\4\4\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\2\1\1\2\13\3\1\4\2\3\1\5\1\6"+
    "\1\3\1\7\1\1\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\4\1\23"+
    "\1\4\3\0\14\3\1\24\1\25\1\3\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\3\0\1\36"+
    "\4\3\1\37\2\3\1\0\6\3\3\0\5\3\1\40"+
    "\1\3\1\41\1\3\1\0\2\3\1\42\1\3\1\43"+
    "\1\0\7\3\5\0\2\3\1\44\1\45\5\3\1\46"+
    "\4\0\1\47\3\3\1\50\1\51\1\3\1\52\5\0"+
    "\1\3\1\53\1\54\1\55\3\0\1\56\1\0\1\3"+
    "\4\0\1\57\5\0\1\60\2\0\1\61\1\62\1\0"+
    "\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[168];
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
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249"+
    "\0\u0270\0\u0297\0\u02be\0\u02e5\0\165\0\165\0\u030c\0\u0333"+
    "\0\u035a\0\u0381\0\u03a8\0\165\0\165\0\165\0\234\0\165"+
    "\0\165\0\u03cf\0\165\0\165\0\165\0\165\0\u03f6\0\234"+
    "\0\u041d\0\u0444\0\u046b\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u052e"+
    "\0\u0555\0\u057c\0\u05a3\0\u05ca\0\u05f1\0\u0618\0\u063f\0\352"+
    "\0\u0666\0\165\0\165\0\165\0\165\0\165\0\165\0\165"+
    "\0\165\0\u068d\0\u06b4\0\u06db\0\u0444\0\u0702\0\u0729\0\u0750"+
    "\0\u0777\0\352\0\u079e\0\u07c5\0\u07ec\0\u0813\0\u083a\0\u0861"+
    "\0\u0888\0\u08af\0\u08d6\0\u08fd\0\u0924\0\u094b\0\u0972\0\u0999"+
    "\0\u09c0\0\u09e7\0\u0a0e\0\352\0\u0a35\0\165\0\u0a5c\0\u0a83"+
    "\0\u0aaa\0\u0ad1\0\352\0\u0af8\0\165\0\u0b1f\0\u0b46\0\u0b6d"+
    "\0\u0b94\0\u0bbb\0\u0be2\0\u0c09\0\u0c30\0\u0c57\0\u0c7e\0\u0ca5"+
    "\0\u0ccc\0\u0cf3\0\u0d1a\0\u0d41\0\352\0\352\0\u0d68\0\u0d8f"+
    "\0\u0db6\0\u0ddd\0\u0e04\0\352\0\u0e2b\0\u0e52\0\u0e79\0\u0ea0"+
    "\0\165\0\u0ec7\0\u0eee\0\u0f15\0\352\0\352\0\u0f3c\0\352"+
    "\0\u0f63\0\u0f8a\0\u0fb1\0\u0fd8\0\u0fff\0\u1026\0\352\0\352"+
    "\0\352\0\u104d\0\u1074\0\u109b\0\165\0\u10c2\0\u10e9\0\u1110"+
    "\0\u1137\0\u115e\0\u1185\0\352\0\u11ac\0\u11d3\0\u11fa\0\u1221"+
    "\0\u1248\0\165\0\u126f\0\u1296\0\165\0\165\0\u12bd\0\165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[168];
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
    "\1\4\1\5\1\6\1\4\1\7\1\5\1\10\1\11"+
    "\1\12\1\13\1\7\1\14\1\15\1\16\1\17\1\7"+
    "\1\20\1\21\1\22\1\7\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\22\45\45"+
    "\1\46\43\45\1\47\1\4\3\45\50\0\1\50\1\0"+
    "\1\51\16\50\1\0\3\50\2\0\1\50\7\0\1\50"+
    "\10\0\1\6\1\52\44\0\1\50\1\53\1\51\16\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\11\7\1\54\4\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\2\7"+
    "\1\55\13\7\1\0\3\7\2\0\1\7\7\0\1\50"+
    "\7\0\1\50\1\53\1\51\15\7\1\56\1\0\3\7"+
    "\2\0\1\7\7\0\1\50\7\0\1\50\1\53\1\51"+
    "\11\7\1\57\4\7\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\5\7\1\60\10\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\2\7\1\61\13\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\16\7"+
    "\1\0\2\7\1\62\2\0\1\7\7\0\1\50\7\0"+
    "\1\50\1\53\1\51\5\7\1\63\10\7\1\0\3\7"+
    "\2\0\1\7\7\0\1\50\7\0\1\50\1\53\1\51"+
    "\15\7\1\64\1\0\1\65\2\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\11\7\1\66\4\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\30\0\1\22"+
    "\23\0\1\22\1\0\1\50\1\53\1\51\15\7\1\67"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\10\7\1\70\5\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\5\7"+
    "\1\71\10\7\1\0\3\7\2\0\1\7\7\0\1\50"+
    "\40\0\1\72\46\0\1\73\45\0\1\74\1\75\45\0"+
    "\1\76\57\0\1\77\1\100\46\0\1\101\11\0\1\102"+
    "\1\0\1\103\2\0\1\104\35\0\1\105\46\0\1\53"+
    "\1\0\16\53\1\0\3\53\2\0\1\53\17\0\1\50"+
    "\1\53\1\51\6\7\1\106\7\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\12\7"+
    "\1\107\1\7\1\110\1\7\1\0\3\7\2\0\1\7"+
    "\7\0\1\50\7\0\1\50\1\53\1\51\2\7\1\111"+
    "\13\7\1\0\3\7\2\0\1\7\7\0\1\50\7\0"+
    "\1\50\1\53\1\51\3\7\1\112\12\7\1\0\3\7"+
    "\2\0\1\7\7\0\1\50\7\0\1\50\1\53\1\51"+
    "\10\7\1\113\5\7\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\6\7\1\114\7\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\16\7\1\0\3\7\1\115\1\0\1\7"+
    "\7\0\1\50\7\0\1\50\1\53\1\51\3\7\1\116"+
    "\12\7\1\0\3\7\2\0\1\7\7\0\1\50\7\0"+
    "\1\50\1\53\1\51\11\7\1\117\4\7\1\0\3\7"+
    "\2\0\1\7\7\0\1\50\7\0\1\50\1\53\1\51"+
    "\11\7\1\120\4\7\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\12\7\1\121\3\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\11\7\1\122\4\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\12\7"+
    "\1\123\3\7\1\0\3\7\2\0\1\7\7\0\1\50"+
    "\15\0\1\124\50\0\1\125\51\0\1\126\33\0\1\50"+
    "\1\53\1\51\2\7\1\127\13\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\13\7"+
    "\1\130\1\7\1\131\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\15\7\1\132\1\0"+
    "\3\7\2\0\1\7\7\0\1\50\7\0\1\50\1\53"+
    "\1\51\11\7\1\133\4\7\1\0\3\7\2\0\1\7"+
    "\7\0\1\50\7\0\1\50\1\53\1\51\5\7\1\134"+
    "\10\7\1\0\3\7\2\0\1\7\7\0\1\50\7\0"+
    "\1\50\1\53\1\51\16\7\1\0\2\7\1\135\2\0"+
    "\1\7\7\0\1\50\35\0\1\136\20\0\1\50\1\53"+
    "\1\51\2\7\1\137\13\7\1\0\3\7\2\0\1\7"+
    "\7\0\1\50\7\0\1\50\1\53\1\51\16\7\1\140"+
    "\3\7\2\0\1\7\7\0\1\50\7\0\1\50\1\53"+
    "\1\51\12\7\1\141\3\7\1\0\3\7\2\0\1\7"+
    "\7\0\1\50\7\0\1\50\1\53\1\51\13\7\1\142"+
    "\2\7\1\0\3\7\2\0\1\7\7\0\1\50\7\0"+
    "\1\50\1\53\1\51\16\7\1\0\2\7\1\143\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\15\7"+
    "\1\144\1\0\3\7\2\0\1\7\7\0\1\50\15\0"+
    "\1\145\51\0\1\146\51\0\1\145\32\0\1\50\1\53"+
    "\1\51\10\7\1\147\5\7\1\0\3\7\2\0\1\7"+
    "\7\0\1\50\7\0\1\50\1\53\1\51\5\7\1\150"+
    "\10\7\1\0\3\7\2\0\1\7\7\0\1\50\7\0"+
    "\1\50\1\53\1\51\4\7\1\151\11\7\1\0\3\7"+
    "\2\0\1\7\7\0\1\50\7\0\1\50\1\53\1\51"+
    "\11\7\1\152\4\7\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\6\7\1\153\7\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\10\7\1\154\5\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\11\7"+
    "\1\155\4\7\1\0\3\7\2\0\1\7\7\0\1\50"+
    "\15\0\1\156\1\157\2\0\1\160\4\0\1\161\3\0"+
    "\1\162\23\0\1\50\1\53\1\51\15\7\1\163\1\0"+
    "\3\7\2\0\1\7\7\0\1\50\7\0\1\50\1\53"+
    "\1\51\16\7\1\0\1\164\2\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\16\7\1\0\2\7"+
    "\1\165\2\0\1\7\7\0\1\50\14\0\1\145\41\0"+
    "\1\50\1\53\1\51\16\7\1\0\2\7\1\166\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\10\7"+
    "\1\167\5\7\1\0\3\7\2\0\1\7\7\0\1\50"+
    "\7\0\1\50\1\53\1\51\5\7\1\170\10\7\1\0"+
    "\3\7\2\0\1\7\7\0\1\50\7\0\1\50\1\53"+
    "\1\51\15\7\1\171\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\10\7\1\172\5\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\11\7\1\173\4\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\5\7"+
    "\1\174\10\7\1\0\3\7\2\0\1\7\7\0\1\50"+
    "\14\0\1\175\61\0\1\176\36\0\1\177\60\0\1\200"+
    "\44\0\1\201\26\0\1\50\1\53\1\51\16\7\1\0"+
    "\2\7\1\202\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\15\7\1\203\1\0\3\7\2\0\1\7"+
    "\7\0\1\50\7\0\1\50\1\53\1\51\5\7\1\204"+
    "\10\7\1\0\3\7\2\0\1\7\7\0\1\50\7\0"+
    "\1\50\1\53\1\51\13\7\1\205\2\7\1\0\3\7"+
    "\2\0\1\7\7\0\1\50\7\0\1\50\1\53\1\51"+
    "\10\7\1\206\5\7\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\5\7\1\207\10\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\16\7\1\0\2\7\1\210\2\0\1\7"+
    "\7\0\1\50\24\0\1\211\1\0\1\212\34\0\1\213"+
    "\54\0\1\214\47\0\1\215\32\0\1\50\1\53\1\51"+
    "\11\7\1\216\4\7\1\0\3\7\2\0\1\7\7\0"+
    "\1\50\7\0\1\50\1\53\1\51\10\7\1\217\5\7"+
    "\1\0\3\7\2\0\1\7\7\0\1\50\7\0\1\50"+
    "\1\53\1\51\10\7\1\220\5\7\1\0\3\7\2\0"+
    "\1\7\7\0\1\50\7\0\1\50\1\53\1\51\16\7"+
    "\1\0\1\7\1\221\1\7\2\0\1\7\7\0\1\50"+
    "\25\0\1\222\50\0\1\223\42\0\1\224\42\0\1\225"+
    "\53\0\1\226\31\0\1\50\1\53\1\51\2\7\1\227"+
    "\13\7\1\0\3\7\2\0\1\7\7\0\1\50\17\0"+
    "\1\230\52\0\1\231\43\0\1\232\55\0\1\233\26\0"+
    "\1\50\1\53\1\51\16\7\1\0\1\7\1\234\1\7"+
    "\2\0\1\7\7\0\1\50\22\0\1\235\53\0\1\236"+
    "\41\0\1\237\57\0\1\240\32\0\1\241\51\0\1\242"+
    "\43\0\1\243\52\0\1\244\45\0\1\245\56\0\1\246"+
    "\30\0\1\247\64\0\1\250\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4836];
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
    "\3\0\1\11\20\1\2\11\5\1\3\11\1\1\2\11"+
    "\1\1\4\11\1\1\3\0\17\1\10\11\3\0\10\1"+
    "\1\0\6\1\3\0\7\1\1\11\1\1\1\0\4\1"+
    "\1\11\1\0\7\1\5\0\12\1\4\0\1\11\7\1"+
    "\5\0\4\1\3\0\1\11\1\0\1\1\4\0\1\1"+
    "\5\0\1\11\2\0\2\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[168];
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
public static ArrayList Li= new ArrayList();
public static ArrayList Co= new ArrayList();
public static ArrayList Ca= new ArrayList();
public static ArrayList ki= new ArrayList();
public static ArrayList simbols = new ArrayList();
public static ArrayList simbols= new ArrayList();


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
    while (i < 144) {
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
        case 37: 
          { simbols.add(yytext()); return new Symbol(sym.intgr,yyline,yychar,new String(yytext()));
          }
        case 52: break;
        case 49: 
          { simbols.add(yytext()); return new Symbol(sym.fdec,yyline,yychar,new String(yytext()));
          }
        case 53: break;
        case 33: 
          { simbols.add(yytext()); return new Symbol(sym.nao,yyline,yychar,new String(yytext()));
          }
        case 54: break;
        case 1: 
          { Li.add(yyline+1);
    Co.add(yychar);
    Ca.add(yytext());
    ki.add("Lexico");
    System.out.println("error lexico en "  + (yyline+1) + "," + yychar + " No se reconoce " + yytext());
    yychar=0;
          }
        case 55: break;
        case 35: 
          { simbols.add(yytext()); return new Symbol(sym.incluish,yyline,yychar,new String(yytext()));
          }
        case 56: break;
        case 46: 
          { simbols.add(yytext()); return new Symbol(sym.endfor,yyline,yychar,new String(yytext()));
          }
        case 57: break;
        case 50: 
          { simbols.add(yytext()); return new Symbol(sym.endwhile,yyline,yychar,new String(yytext()));
          }
        case 58: break;
        case 31: 
          { simbols.add(yytext()); return new Symbol(sym.y,yyline,yychar,new String(yytext()));
          }
        case 59: break;
        case 48: 
          { simbols.add(yytext()); return new Symbol(sym.findef,yyline,yychar,new String(yytext()));
          }
        case 60: break;
        case 25: 
          { simbols.add(yytext()); return new Symbol(sym.menori,yyline,yychar,new String(yytext()));
          }
        case 61: break;
        case 3: 
          { simbols.add(yytext()); return new Symbol(sym.ident,yyline,yychar,new String(yytext()));
          }
        case 62: break;
        case 6: 
          { simbols.add(yytext()); return new Symbol(sym.cerra,yyline,yychar,new String(yytext()));
          }
        case 63: break;
        case 40: 
          { simbols.add(yytext()); return new Symbol(sym.decimal,yyline,yychar,new String(yytext()));
          }
        case 64: break;
        case 8: 
          { simbols.add(yytext()); return new Symbol(sym.menor,yyline,yychar,new String(yytext()));
          }
        case 65: break;
        case 12: 
          { simbols.add(yytext()); return new Symbol(sym.coma,yyline,yychar,new String(yytext()));
          }
        case 66: break;
        case 15: 
          { simbols.add(yytext()); return new Symbol(sym.multi,yyline,yychar,new String(yytext()));
          }
        case 67: break;
        case 2: 
          { simbols.add(yytext()); return new Symbol(sym.numero,yyline,yychar,new Integer(yytext()));
          }
        case 68: break;
        case 27: 
          { yybegin(comD);
          }
        case 69: break;
        case 32: 
          { simbols.add(yytext()); return new Symbol(sym.fors,yyline,yychar,new String(yytext()));
          }
        case 70: break;
        case 10: 
          { simbols.add(yytext()); return new Symbol(sym.dpts,yyline,yychar,new String(yytext()));
          }
        case 71: break;
        case 41: 
          { simbols.add(yytext()); return new Symbol(sym.def,yyline,yychar,new String(yytext()));
          }
        case 72: break;
        case 34: 
          { simbols.add(yytext()); return new Symbol(sym.elses,yyline,yychar,new String(yytext()));
          }
        case 73: break;
        case 51: 
          { simbols.add(yytext()); return new Symbol(sym.finfuc,yyline,yychar,new String(yytext()));
          }
        case 74: break;
        case 24: 
          { simbols.add(yytext()); return new Symbol(sym.dif,yyline,yychar,new String(yytext()));
          }
        case 75: break;
        case 26: 
          { simbols.add(yytext()); return new Symbol(sym.cosito,yyline,yychar,new String(yytext()));
          }
        case 76: break;
        case 5: 
          { simbols.add(yytext()); return new Symbol(sym.abi,yyline,yychar,new String(yytext()));
          }
        case 77: break;
        case 7: 
          { simbols.add(yytext()); return new Symbol(sym.maior,yyline,yychar,new String(yytext()));
          }
        case 78: break;
        case 38: 
          { simbols.add(yytext()); return new Symbol(sym.strng,yyline,yychar,new String(yytext()));
          }
        case 79: break;
        case 17: 
          { simbols.add(yytext()); return new Symbol(sym.mod,yyline,yychar,new String(yytext()));
          }
        case 80: break;
        case 16: 
          { simbols.add(yytext()); return new Symbol(sym.div,yyline,yychar,new String(yytext()));
          }
        case 81: break;
        case 28: 
          { yybegin(comS);
          }
        case 82: break;
        case 21: 
          { simbols.add(yytext()); return new Symbol(sym.ou,yyline,yychar,new String(yytext()));
          }
        case 83: break;
        case 47: 
          { simbols.add(yytext()); return new Symbol(sym.func,yyline,yychar,new String(yytext()));
          }
        case 84: break;
        case 29: 
          { yybegin(YYINITIAL); yychar=0;  System.out.println("ComD");
          }
        case 85: break;
        case 45: 
          { simbols.add(yytext()); return new Symbol(sym.whiles,yyline,yychar,new String(yytext()));
          }
        case 86: break;
        case 9: 
          { simbols.add(yytext()); return new Symbol(sym.menos,yyline,yychar,new String(yytext()));
          }
        case 87: break;
        case 39: 
          { simbols.add(yytext()); return new Symbol(sym.endif,yyline,yychar,new String(yytext()));
          }
        case 88: break;
        case 43: 
          { simbols.add(yytext()); return new Symbol(sym.inc,yyline,yychar,new String(yytext()));
          }
        case 89: break;
        case 22: 
          { simbols.add(yytext()); return new Symbol(sym.maiori,yyline,yychar,new String(yytext()));
          }
        case 90: break;
        case 18: 
          { yychar=0;
          }
        case 91: break;
        case 19: 
          { yybegin(YYINITIAL); yychar=0;  System.out.println("ComS");
          }
        case 92: break;
        case 42: 
          { simbols.add(yytext()); return new Symbol(sym.reto,yyline,yychar,new String(yytext()));
          }
        case 93: break;
        case 11: 
          { simbols.add(yytext()); return new Symbol(sym.pyc,yyline,yychar,new String(yytext()));
          }
        case 94: break;
        case 20: 
          { simbols.add(yytext()); return new Symbol(sym.ifs,yyline,yychar,new String(yytext()));
          }
        case 95: break;
        case 14: 
          { simbols.add(yytext()); return new Symbol(sym.mais,yyline,yychar,new String(yytext()));
          }
        case 96: break;
        case 13: 
          { simbols.add(yytext()); return new Symbol(sym.pot,yyline,yychar,new String(yytext()));
          }
        case 97: break;
        case 23: 
          { simbols.add(yytext()); return new Symbol(sym.igual,yyline,yychar,new String(yytext()));
          }
        case 98: break;
        case 36: 
          { simbols.add(yytext()); return new Symbol(sym.voids,yyline,yychar,new String(yytext()));
          }
        case 99: break;
        case 44: 
          { simbols.add(yytext()); return new Symbol(sym.dec,yyline,yychar,new String(yytext()));
          }
        case 100: break;
        case 4: 
          { 
          }
        case 101: break;
        case 30: 
          { simbols.add(yytext()); return new Symbol(sym.real,yyline,yychar,new String(yytext()));
          }
        case 102: break;
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

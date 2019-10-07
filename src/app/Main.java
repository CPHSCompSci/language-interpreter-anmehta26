package app;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Lexicon lex = new Lexicon();

    String newWord = lex.translate("went");
    System.out.println(newWord);
    System.out.println(decode(newWord));
    for (int i = 0; i < 16; i++) {
    	System.out.println(decodeMessage(lex.getSample(i)));
    }
    Scanner sc = new Scanner(System.in);
    String decodeInput = sc.nextLine();
    System.out.println(decodeInput(decodeInput));
    String encodeInput = sc.nextLine();
    System.out.println(encodeInput(encodeInput));

  }

  /**
   * This method decodes a single word.
   * 
   * @param word The single word to be decoded.
   */
  public static String decode(String word) {
    return word.replaceAll("ent", "").replaceAll("ingy", "");
  }

  /**
   * This method should not have code copy/pasted from the decode method.
   * 
   * @param message The sentence (multiple words) to be decoded.
   */
  public static String decodeMessage(String message) {
    return message.replaceAll("ent", "").replaceAll("ingy", "");
  }

  /**
   * This method uses the decode(String) and a Scanner to decode a word specified
   * by the user.
   */
  public static String decodeInput(String userMessage) {
    return userMessage.replaceAll("ent", "").replaceAll("ingy", "");
  }
  
  /**
   * This method uses the Lexicon translate(String) and a Scanner to encode a word specified
   * by the user.
   */
  public static String encodeInput(String userWord) {
	  Lexicon lex = new Lexicon();
	  String translate = lex.translate(userWord);
    return translate;
  }
}
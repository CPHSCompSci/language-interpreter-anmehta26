package app;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	    Lexicon lex = new Lexicon();

	    String newWord = lex.translate("food");
	    System.out.println(newWord);
	    
	    System.out.println(decode(newWord));
	    for (int i = 0; i < 16; i++) {
	    	System.out.println(decodeMessage(lex.getSample(i)));
	    }
	    
	    String decodeInput = sc.nextLine();
	    System.out.println(decodeInput(decodeInput));
	    
	    String encodeInput = sc.nextLine();
	    System.out.println(encodeInput(encodeInput));

	  }
	public static String decode(String word) {
		String decodedWord = "";
		
		for (int i = 0; i < word.length()-2; i++) {
			if (word.substring(i, i+3).equals("ent") && (word.charAt(i-1) == 'a' || word.charAt(i-1) == 'e' || word.charAt(i-1) == 'i' || word.charAt(i-1) == 'o' || word.charAt(i-1) == 'u' || word.charAt(i-1) == 'A' || word.charAt(i-1) == 'E' || word.charAt(i-1) == 'I' || word.charAt(i-1) == 'O' || word.charAt(i-1) == 'U')) {
				decodedWord = word.replace(word.substring(i, i+3), "");
			}
		}
		for (int i = 0; i < word.length()-3; i++) {
			if (word.substring(i, i+4).equals("ingy") && !(word.charAt(i-1) == 'a' || word.charAt(i-1) == 'e' || word.charAt(i-1) == 'i' || word.charAt(i-1) == 'o' || word.charAt(i-1) == 'u' || word.charAt(i-1) == 'A' || word.charAt(i-1) == 'E' || word.charAt(i-1) == 'I' || word.charAt(i-1) == 'O' || word.charAt(i-1) == 'U')) {
				decodedWord = decodedWord.replace(word.substring(i, i+4), "");
			}
		}
		
	    return decodedWord;
	  }

	  /**
	   * This method should not have code copy/pasted from the decode method.
	   * 
	   * @param message The sentence (multiple words) to be decoded.
	   */
	  public static String decodeMessage(String message) {
		int spaces = 0;
		String decodedMessage;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ' ') {
				spaces++;
			}
		}
		
		for (int i = 0; i < spaces+1; i++) {
			decodedMessage = decode(message);
			if (i == spaces) {
			    return decodedMessage;
			}
		}
	    return message;
	  }

	  /**
	   * This method uses the decode(String) and a Scanner to decode a word specified
	   * by the user.
	   */
	  public static String decodeInput(String userMessage) {
	    return decodeMessage(userMessage);
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
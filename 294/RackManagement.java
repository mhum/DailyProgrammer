
public class RackManagement {

	public static boolean scrabble(String letters, String word) {
		StringBuilder lettersBuilder = new StringBuilder(letters);
		char[] wordArray = word.toCharArray();
		
		for (char c : wordArray) {
			int letterIndex = lettersBuilder.indexOf(Character.toString(c));
			if ( letterIndex > -1) {
				lettersBuilder.deleteCharAt(letterIndex);
			} else {
				return false;
			}
		}
		
		return true;
	}
	
}

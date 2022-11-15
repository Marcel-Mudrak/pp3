public class Alphabet {
	// static methods
	private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static boolean isAlphabet(String text) {
		int lastIndex = -1; // lastIndex equal to -1 means it's the first iteration of the loop
		for (char letter : (text.toLowerCase()).toCharArray()) { // changing string to char[] for easier iteration via for
			if (lastIndex == -1) {
				lastIndex = alphabet.indexOf(letter);
			} else {
				int currentIndex = alphabet.indexOf(letter);
				if (currentIndex < lastIndex) {
					return false;
				}
				lastIndex = currentIndex;
			}
		}
		return true;
	}
}
package addDigitsInString;

public class AddDigitsInString {

	public static void main(String[] args) {

		String word = "a3b4c6";
		char[] splitWord = word.toCharArray();
		int value = 0;

		for (char character : splitWord) {
			if (Character.isDigit(character)) {
				value += Integer.parseInt(String.valueOf((character)));
			}
		}

		System.out.println(value);
	}
}

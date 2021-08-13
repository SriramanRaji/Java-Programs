package palindrome;

public class StringPalindrome {

	public static void main(String[] args) {

		String word = "Kayak";
		StringBuilder revWord = new StringBuilder(word);

		if (word.equalsIgnoreCase(revWord.reverse().toString())) {
			System.out.println(word + " is a String Palindrome");
		} else {
			System.out.println(word + " is not a String Palindrome");
		}

	}

}

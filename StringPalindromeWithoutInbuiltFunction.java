package palindrome;

public class StringPalindromeWithoutInbuiltFunction {

	private static boolean isPalindrome(String input) {

		char[] charArray = input.toCharArray();
		String compare = "";

		for (int i = charArray.length - 1; i >= 0; i--) {

			compare += charArray[i];

		}

		if (input.equalsIgnoreCase(compare)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("Kayak"));
		System.out.println(isPalindrome("Killer"));

	}

}

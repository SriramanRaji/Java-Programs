package stringProblems;

public class ReplaceVowelsWithSpecialCharacter {

	public static String replaceVowels(String input) {
		String output = input.replaceAll("[AaEeIiOoUu]", "#");

		if (output.contains("#")) {
			return output;
		} else {
			return output + " has no vowels";
		}

	}

	public static void main(String[] args) {

		System.out.println(replaceVowels("precious"));
		System.out.println(replaceVowels("cyst"));

	}

}

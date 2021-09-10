package stringProblems;

public class SplitAndReverse {

	public static String reverseWord(String word) {

		String revWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			revWord += word.charAt(i);
		}

		return revWord;
	}

	public static void main(String[] args) {

		String input = "ABC DEF GHI";
		String output = "";

		String splitInput[] = input.split(" ");

		for (String word : splitInput) {

			output += reverseWord(word)+" ";

		}

		System.out.println(output);

	}

}

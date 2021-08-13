package stringProblems;

import java.util.ArrayList;

public class CountAndAppendWithMaintainingSequence {

	public static String input = "zzzzzzzzzaaappbbbbb";
	public static char[] splitInput = input.toCharArray();
	public static String output = "";
	
	
	public static int getCount(char check) {
		int count = 0;

		for (char a : splitInput) {
			if (check == a) {
				count += 1;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		

		ArrayList<Character> letter = new ArrayList<Character>();
		ArrayList<Integer> count = new ArrayList<Integer>();

		for (char singleChar : splitInput) {

			if (!letter.contains(singleChar)) {
				letter.add(singleChar);
				count.add(getCount(singleChar));
			}

		}

		if (letter.size() == count.size()) {

			for (int i = 0; i < letter.size(); i++) {
				output += letter.get(i) + "" + count.get(i);
			}

		} else {
			System.out.println("Error.!");
		}

		System.out.println(output);

	}

}

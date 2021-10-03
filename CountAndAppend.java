package stringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountAndAppend {

	public static String input = "zzzzzzzzzaaappbbbbb";
	public static char[] splitInput = input.toCharArray();
	public static String output = "";

	public static void main(String[] args) {

		HashMap<Character, Integer> count = new HashMap<Character, Integer>();

		for (char letter : splitInput) {

			if (count.containsKey(letter)) {
				count.replace(letter, count.get(letter) + 1);
			} else {
				count.put(letter, 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : count.entrySet()) {

			output += entry.getKey() + "" + entry.getValue();

		}

		System.out.println(output);

	}

}

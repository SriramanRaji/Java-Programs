package count;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {

		String name = "Find the character count of this sentence.!";
		char[] split = name.toCharArray();

		Map<Character, Integer> count = new HashMap<Character, Integer>();

		for (char letter : split) {

			if (count.containsKey(letter)) {
				count.replace(letter, count.get(letter) + 1);
			} else {
				count.put(letter, 1);
			}

		}
		System.out.println(count);

	}

}
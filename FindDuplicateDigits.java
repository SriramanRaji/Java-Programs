package numberProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateDigits {

	public static void main(String[] args) {

		int input = 43677654;
		Map<Integer, Integer> output = new HashMap<Integer, Integer>();

		while (input > 0) {

			int temp = input % 10;

			if (output.containsKey(temp)) {
				output.replace(temp, output.get(temp) + 1);
			} else {
				output.put(temp, 1);
			}

			input = input / 10;

		}

		for (Entry<Integer, Integer> entry : output.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate number " + entry.getKey());
			}
		}

	}

}

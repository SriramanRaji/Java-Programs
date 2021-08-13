package findDuplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateWordInSentence {

	public static void main(String[] args) {

		String sentence = "Sherlock Holmes is a fictional private detective created by British author Sir Arthur Conan Doyle. "
				+ "Referring to himself as a consulting detective in the stories, Holmes is known for his proficiency with observation, deduction, "
				+ "forensic science, and logical reasoning that borders on the fantastic, which he employs when investigating cases for a wide variety of clients, including Scotland Yard.";

		String[] words = sentence.split(" ");

		Map<String, Integer> duplicateCount = new HashMap<String, Integer>();

		for (String word : words) {
			if (duplicateCount.containsKey(word)) {
				duplicateCount.replace(word, duplicateCount.get(word) + 1);
			} else {
				duplicateCount.put(word, 1);
			}
		}
		
//		System.out.println(duplicateCount);
		
		for(Entry<String, Integer> entry: duplicateCount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" - "+entry.getValue()+" duplicates");
			} else {
				System.out.println(entry.getKey()+" - no duplicate");
			}
		}

	}

}

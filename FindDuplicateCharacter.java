package findDuplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharacter {

	public static void main(String[] args) {

		String word = "Czechoslovakia";
		
		char[] split = word.toCharArray();

		Map<Character, Integer> duplicateCount = new HashMap<Character, Integer>();
		
		for(char character : split) {
			if(duplicateCount.containsKey(character)) {
				duplicateCount.replace(character, duplicateCount.get(character)+1);
			} else {
				duplicateCount.put(character, 1);
			}
		}
		
//		System.out.println(duplicateCount);
		
		for(Entry<Character, Integer> entry: duplicateCount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" have a duplicate with "+entry.getValue()+" duplicate characters");
			} else {
				System.out.println(entry.getKey()+" doesn't have a duplicate");
			}
		}
		
	}

}

package stringProblems;

public class ParsingNumbersFromString {

	public static void main(String[] args) {

		String s1 = "0060";
		String s2 = "0006";

//		Using Integer wrapper class
		System.out.println(Integer.parseInt(s1));
		System.out.println(Integer.parseInt(s2));
		System.out.println();

//		Using Regex
		System.out.println(s1.replaceAll("^0*", ""));
		System.out.println(s2.replaceAll("^0*", ""));

	}

}

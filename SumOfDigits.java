package sumOfDigits;

public class SumOfDigits {

	public static void main(String[] args) {

		int number = 12123123;
		int sum = 0;

		while (number > 0) {

			sum += number % 10;
			number = number / 10;

		}

		System.out.println(sum);

	}

}

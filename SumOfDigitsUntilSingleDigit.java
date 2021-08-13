package sumOfDigits;

public class SumOfDigitsUntilSingleDigit {

	public static int findDigitSum(int number) {
		
		int sum=0;
		
		while (number > 0) {

			sum += number % 10;
			number = number / 10;

		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		
		int number = 121231234;
		
		do {

			number = findDigitSum(number);
			
		} while (number / 10 > 0);

		System.out.println(number);

	}

}

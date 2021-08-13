package swappingNumbers;

public class SwappingNumbersWithoutThirdVariable {

	private static void swap(int num1, int num2) {

		System.out.println("Before swapping \n\tNum1 - " + num1 + "\n\tNum2 - " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After swapping \n\tNum1 - " + num1 + "\n\tNum2 - " + num2);

	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 15;

		swap(num1, num2);

	}

}

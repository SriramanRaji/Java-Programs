package swappingNumbers;

public class SwappingNumbers {

	private static void swap(int num1, int num2) {

		int num3 = 0;

		System.out.println("Before swapping \n\tNum1 - " + num1 + "\n\tNum2 - " + num2);

		num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("After swapping \n\tNum1 - " + num1 + " \n\tNum2 - " + num2);

	}

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 20;

		swap(num1, num2);

	}

}

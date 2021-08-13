package fibonacciSeries;

public class FibonacciWithoutRecurssion {

	private static void series(int count) {

		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		System.out.print(num1 + " " + num2 + " ");

		for (int i = 1; i < count - 1; i++) {

			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;

		}

	}

	public static void main(String[] args) {

		int count = 20;

		series(count);

	}

}

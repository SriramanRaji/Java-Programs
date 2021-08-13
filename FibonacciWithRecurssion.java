package fibonacciSeries;

public class FibonacciWithRecurssion {

	static int num1 = 0, num2 = 1;

	private static void series(int count) {

		if (count > 0) {

			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3 + " ");
			series(count - 1);

		}

	}

	public static void main(String[] args) {

		int count = 10;
		System.out.print(num1 + " " + num2 + " ");
		series(count - 2);

	}

}

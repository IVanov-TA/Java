import java.util.ArrayList;
import java.util.Scanner;

public class SYmmetricNumbersInRange01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] values = new int[2];
		values[0] = input.nextInt();
		values[1] = input.nextInt();
		if (values[0] < 0 || values[1] > 999) {
			System.out
					.println("Invalid number. Range [0 <= start <= end <= 999]");
		} else {
			ArrayList<Integer> result = processNumber(values);

			System.out.println(result);
		}
	}

	public static ArrayList<Integer> processNumber(int[] values) {

		if (values[0] > values[1]) {
			// swapping values Method
			swapValues(values);
		}

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = values[0]; i <= values[1]; i++) {
			int currentNumber = i;

			// check for symmetric numbers
			if (checkNumberForSymmetric(currentNumber)) {

				// adding the result in results List
				result.add(currentNumber);
			}
		}
		// return Array list with symmetric numbers
		return result;
	}

	private static boolean checkNumberForSymmetric(int currentNumber) {
		int leftDigit = 0;
		int rightDigit = 0;

		if (currentNumber < 10) {
			return true;
		} else if (currentNumber >= 10 && currentNumber <= 99) {
			leftDigit = currentNumber / 10;
			rightDigit = currentNumber % 10;
			return leftDigit == rightDigit ? true : false;
		} else {
			leftDigit = currentNumber / 100;
			rightDigit = currentNumber % 10;
			return leftDigit == rightDigit ? true : false;
		}
	}

	private static void swapValues(int[] values) {
		int swapBuff = values[0];
		values[0] = values[1];
		values[1] = swapBuff;
	}
}

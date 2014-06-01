import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LongestOddEvenSequence {

	static final Character OPEN_BRACKET = '(';
	static final Character CLOSING_BRACKET = ')';

	static ArrayList<Integer> numbers = new ArrayList<>();

	public static void main(String[] args) {

		Locale l = Locale.ENGLISH;
		
		Scanner inputScanner = new Scanner(System.in);

		String line = inputScanner.nextLine().trim().replaceAll("\\s", "");

		fuckTheString(line);

		int max = Math.max(bestEvenOdd(numbers), bestOddEven(numbers));
		System.out.println(max);

	}

	private static Integer bestEvenOdd(ArrayList<Integer> numbers2) {

		int bestEvenOdd = 0;
		for (int i = 0; i < numbers2.size(); i++) {
			if (i % 2 == 0
					&& (numbers2.get(i).equals(0) || numbers2.get(i) % 2 == 0)) {
				bestEvenOdd++;
			} else if (i % 2 != 0
					&& (numbers2.get(i).equals(0) || numbers2.get(i) % 2 != 0)) {
				bestEvenOdd++;
			}
		}

		return bestEvenOdd;
	}

	private static Integer bestOddEven(ArrayList<Integer> numbers2) {

		int bestOddEven = 0;
		for (int i = 0; i < numbers2.size(); i++) {
			if (i % 2 == 0
					&& (numbers2.get(i).equals(0) || numbers2.get(i) % 2 != 0)) {
				bestOddEven++;
			} else if (i % 2 != 0
					&& (numbers2.get(i).equals(0) || numbers2.get(i) % 2 == 0)) {
				bestOddEven++;
			}
		}

		return bestOddEven;

	}

	private static void fuckTheString(String data) {
		String currentNumberString = "";
		for (int i = 0; i < data.length(); i++) {
			Character currentChar = data.charAt(i);
			if (currentChar.equals(OPEN_BRACKET)) {
				continue;
			} else if (currentChar.equals(CLOSING_BRACKET)) {
				numbers.add(Integer.parseInt(currentNumberString));
				currentNumberString = "";
				continue;
			}

			currentNumberString += currentChar;
		}

	}

}

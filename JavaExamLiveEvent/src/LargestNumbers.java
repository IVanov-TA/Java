import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LargestNumbers {

	public static void main(String[] args) {

		Locale l = Locale.ENGLISH;
		
		Scanner inpScanner = new Scanner(System.in);

		ArrayList<BigDecimal> numbers = new ArrayList<>();

		while (inpScanner.hasNext()) {
			numbers.add(inpScanner.nextBigDecimal());
			inpScanner.nextLine();
		}

		System.out.println(numbers);
	}

}

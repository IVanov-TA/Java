import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class TLN {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		Locale.setDefault(Locale.ROOT);
		
		int len = inputScanner.nextInt();


		ArrayList<BigDecimal> numberArrayList = new ArrayList<>();

		for (int i = 0; i < len; i++) {
			String data = inputScanner.next().replace(",", ".");;
			numberArrayList.add(new BigDecimal(data));
			inputScanner.nextLine();
		}

		Collections.sort(numberArrayList);

		int counter = 0;
		for (int i = numberArrayList.size(); i > 0; i--) {
			if (counter >= 3) {
				break;
			}
			System.out.println(numberArrayList.get(i - 1).toString());
			counter++;
		}
	}
}

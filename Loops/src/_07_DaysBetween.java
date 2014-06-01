import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _07_DaysBetween {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String beginDate = sc.nextLine();
		String endDate = sc.nextLine();

		LocalDate start = LocalDate.parse(beginDate,
				DateTimeFormatter.ofPattern("d-MM-uuuu"));
		LocalDate end = LocalDate.parse(endDate,
				DateTimeFormatter.ofPattern("d-MM-uuuu"));
		long result = ChronoUnit.DAYS.between(start, end);
		System.out.println(result);
	}
}

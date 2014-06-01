import java.util.Scanner;

public class _02_SequenceOfEqualSTrings {

	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);

		String[] arrOfElements = input.nextLine().split(" ");

		System.out.print(arrOfElements[0] + " ");

		for (int i = 1; i < arrOfElements.length; i++) {
			if (arrOfElements[i - 1].equals(arrOfElements[i])) {
				System.out.print(arrOfElements[i] + " ");
			} else {
				System.out.println();
				System.out.print(arrOfElements[i]);
			}
		}
	}

}

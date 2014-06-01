import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numberOfElements = input.nextInt();
		input.nextLine();
		int[] arrayOfElements = new int[numberOfElements];
		
		for (int i = 0; i < arrayOfElements.length; i++) {
			arrayOfElements[i]= input.nextInt();
			input.nextLine();
		}
		
		Arrays.sort(arrayOfElements);
		
		for (int element : arrayOfElements) {
			System.out.print(element + " ");
		}

	}

}

import java.util.Scanner;

public class EqualBitPairs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scan.nextInt();
		char[] binary = Integer.toBinaryString(num).toCharArray();
		int count = 0;

		for (int i = 0; i < binary.length - 1; i++) {
			if (binary[i] == binary[i + 1]) {
				count++;
			}
		}
		System.out.println("Equal bits: ");
		System.out.print(count);

	}

}

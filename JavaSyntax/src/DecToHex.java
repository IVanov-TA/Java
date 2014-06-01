import java.util.Scanner;


public class DecToHex {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		System.out.println(Integer.toHexString(number).toUpperCase());
	}

}

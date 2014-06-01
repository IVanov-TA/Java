import java.util.Locale;
import java.util.Scanner;

public class SmallestOfThree {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH); 
		
		Scanner input = new Scanner(System.in);
		
		float smallestNumebr = Float.MAX_VALUE;
		
		for (int i = 0; i < 3; i++) {
			
			float currentNumber = input.nextFloat();
			
			if (currentNumber < smallestNumebr) {
				smallestNumebr = currentNumber;
			}
		}
		
		float checkForFloatingPoint = (smallestNumebr * 10) % 10;
	
		System.out.printf( Math.abs(checkForFloatingPoint)  > 0.0 ? "%.2f" : "%.0f", smallestNumebr);
		
		
		
	}
}

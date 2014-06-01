import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float height = input.nextFloat();
		float width = input.nextFloat();
		
		float result = height * width;
		
		System.out.printf("%.2f", result);
	}

}

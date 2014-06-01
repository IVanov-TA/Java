import java.util.Scanner;


public class _05_AngleUnitCOnveretr {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		
		double[] number = new double[rows];
		String[] type = new String[rows];
		
		for (int i = 0; i < rows; i++) {
			number[i] = sc.nextDouble();
			type[i] = sc.next();
		}
		
		for (int i = 0; i < rows; i++) {
			convert(number[i], type[i]);
		}
	}
	
	public static void convert(double number, String type){
		
		double result = 0;
		
		if(type.equals("deg")){
			result = Math.toRadians(number);
			System.out.printf("%.6f rad \n", result);
		}
		else if(type.equals("rad")){
			result = Math.toDegrees(number);
			System.out.printf("%.6f deg \n", result);
		}
	}
}

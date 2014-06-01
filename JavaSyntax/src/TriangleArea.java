import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float[][] triangloPoint = new float[3][2];
		
		for (int point = 0; point < triangloPoint.length; point++) {
			for (int xy = 0; xy < triangloPoint[point].length; xy++) {
				triangloPoint[point][xy] = input.nextFloat();
			}
		}
		
		float equasonAx = triangloPoint[0][0]*(triangloPoint[1][1] - triangloPoint[2][1]);
		float equasonBx = triangloPoint[1][0]*(triangloPoint[2][1] - triangloPoint[0][1]);
		float equasonCx = triangloPoint[2][0]*(triangloPoint[0][1] - triangloPoint[1][1]);
		
		float formula = (equasonAx + equasonBx + equasonCx) / 2;
		
		double result = Math.abs(Math.ceil(formula));
		
		System.out.printf("%.0f", result);
	}
	
}

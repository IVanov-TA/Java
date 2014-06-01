import java.util.Locale;
import java.util.Scanner;

public class PointsInsideFigure {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH); 
		
		float figLeftBorder = 12.5f;
		float figRightBorder = 22.5f;
		float figTopBorder = 6f;
		float figBottomBorder = 13.5f;
		float figInnerLeftBorder = 17.5f;
		float figInnerRightBorder = 20f;
		float figInnerTopBorder = 8.5f;

		boolean inFigure = false;

		Scanner input = new Scanner(System.in);

		float pointX = input.nextFloat();
		float pointY = input.nextFloat();

		if ((pointX >= figLeftBorder && pointX <= figRightBorder)
				&& (pointY >= figTopBorder && pointY <= figBottomBorder)) {

			inFigure = true;

			if ((pointX > figInnerLeftBorder && pointX < figInnerRightBorder)
					&& (pointY > figInnerTopBorder)) {
				inFigure = false;
			}
		}

		if (inFigure) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}

	}
}

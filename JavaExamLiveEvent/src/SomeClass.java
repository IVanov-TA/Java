import java.math.BigDecimal;
import java.math.MathContext;


public class SomeClass {

	public static void main(String[] args) {
		BigDecimal numBigDecimal = new BigDecimal(0.000000000000000000000000001, MathContext.DECIMAL128);
		
		System.out.println(numBigDecimal);

	}

}

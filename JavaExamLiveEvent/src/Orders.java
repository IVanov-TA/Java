import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {

	static Map<String, HashMap> products = new HashMap<String, HashMap>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int len = input.nextInt();
		input.nextLine();

		for (int i = 0; i < len; i++) {
			String currentLine = input.nextLine();
			String[] data = currentLine.split(" ");
			String product = data[2];
			String productHiolder = data[0];
			int productQuantity = Integer.parseInt(data[1]);
			HashMap<String, Integer> holders = new HashMap<>();

			if (products.containsKey(product)) {

				if (holders.containsKey(productHiolder)) {
					holders.put(productHiolder, holders.get(productHiolder)
							+ productQuantity);
				} else {
					holders.put(productHiolder, productQuantity);
				}

				products.put(product, holders);
			} else {
				if (holders.containsKey(productHiolder)) {
					holders.put(productHiolder, holders.get(productHiolder)
							+ productQuantity);
				} else {
					holders.put(productHiolder, productQuantity);
				}
				products.put(product, holders);
			}

		}
		System.out.println();
		// printMap(products);

	}

	
}

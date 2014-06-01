import java.util.Scanner;

public class CountBeerStack {

	static final String END = "End";
	static final Integer STACKSMESAURE = 20;
	public static int allStacks = 0;
	public static int allBeers = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			String currentLineStrings = input.nextLine();

			if (currentLineStrings.trim().equals(END)) {
				break;
			}
			String[] values = currentLineStrings.trim().split(" ");
			int quantity = Integer.parseInt(values[0]);
			String mesaure = values[1];

			processLine(quantity, mesaure);
		}

		calculateQuantity(allBeers);

		System.out.printf("%d stacks + %d beers", allStacks, allBeers);
	}

	private static void calculateQuantity(int allBeers2) {
		allStacks += allBeers2 / STACKSMESAURE;
		allBeers = allBeers2 % STACKSMESAURE;

	}

	private static void processLine(int quantity, String mesaure) {
		switch (mesaure) {
		case "stacks":
			allStacks += quantity;
			break;
		case "beers":
			allBeers += quantity;
			break;
		default:
			break;
		}

	}

}

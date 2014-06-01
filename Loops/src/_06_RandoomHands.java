import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class _06_RandoomHands {
	public static void main(String[] args) {

		ArrayList<String> cards = new ArrayList<>();
		
		for (int i = 1; i <= 13; i++) {
			for (int j = 1; j <= 4; j++) {
					
				String cardType = "";
				String cardSymbol = "";
				
				switch(i){
					case 1: cardType = "A"; break;
					case 2: cardType = "2"; break;
					case 3: cardType = "3"; break;
					case 4: cardType = "4"; break;
					case 5: cardType = "5"; break;
					case 6: cardType = "6"; break;
					case 7: cardType = "7"; break;
					case 8: cardType = "8"; break;
					case 9: cardType = "9"; break;
					case 10: cardType = "10"; break;
					case 11: cardType = "J"; break;
					case 12: cardType = "Q"; break;
					case 13: cardType = "K"; break;
				}
				
				switch (j) {
					case 1: cardSymbol = "♠"; break;
					case 2: cardSymbol = "♥"; break;
					case 3: cardSymbol = "♣"; break;
					case 4: cardSymbol = "♦"; break;
				}
				cards.add(cardType + cardSymbol);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {

			//Avoiding same card in other hands
			int card = randomCard(cards);
			System.out.printf("%s ", cards.get(card));
			cards.remove(card);
			
			card = randomCard(cards);
			System.out.printf("%s ", cards.get(card));
			cards.remove(card);
			
			card = randomCard(cards);
			System.out.printf("%s ", cards.get(card));
			cards.remove(card);
			
			card = randomCard(cards);
			System.out.printf("%s ", cards.get(card));
			cards.remove(card);
			
			card = randomCard(cards);
			System.out.printf("%s \n", cards.get(card));
			cards.remove(card);
		}

	}
	
	public static int randomCard(ArrayList<String > cards)
	{
		Random randomGenerator = new Random();
		int randNum = randomGenerator.nextInt(cards.size());
		return randNum;
	}
}

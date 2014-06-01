public class _04_FullHouseJokers {
	public static void main(String[] args) {

		String[] cards = new String[52];
		String[] cardType = { "A", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "J", "Q", "K" };
		char[] cardSymbol = { '♠', '♥', '♣', '♦' };
		int countFH = 0;

		for (int i = 0, indx = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++, indx++) {

				cards[indx] = cardType[i] + cardSymbol[j];
			}
		}

		for (int n = 0; n < 13; n++) {
			for (int a = n * 4; a < (n * 4 + 4); a++) {
				for (int b = a + 1; b < (n * 4 + 4); b++) {
					for (int c = b + 1; c < (n * 4 + 4); c++) {

						for (int m = 0; m < 13; m++) {
							if (n != m) {
								for (int d = m * 4; d < (m * 4 + 4); d++) {
									for (int e = d + 1; e < (m * 4 + 4); e++) {
										System.out.printf("%s %s %s %s %s \n",
												cards[a], cards[b], cards[c],
												cards[d], cards[e]);
										countFH++;

										for (int j = 1; j < 32; j++) {

											for (int moveJ = 0; moveJ < 5; moveJ++) {
												if (((j >> moveJ) & 1) == 0) {
													switch (moveJ) {
													case 0:
														System.out
																.printf("%s ",
																		cards[a]);
														break;
													case 1:
														System.out
																.printf("%s ",
																		cards[b]);
														break;
													case 2:
														System.out
																.printf("%s ",
																		cards[c]);
														break;
													case 3:
														System.out
																.printf("%s ",
																		cards[d]);
														break;
													case 4:
														System.out
																.printf("%s ",
																		cards[e]);
														break;
													}
												} else if (((j >> moveJ) & 1) != 0) {
													System.out.print("* ");
												}
											}
											System.out.println();
											countFH++;
										}
									}
								}
							}
						}

					}
				}
			}
		}
		System.out.println(countFH);
	}
}

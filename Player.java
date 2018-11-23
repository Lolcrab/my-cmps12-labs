package lab1;

public class Player {
	private String name;
	private Card[] playerCards;
	
	public Player(String name, Card[] cards) {
		this.name = new String(name);
		playerCards = cards;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Card[] getCards() {
		return playerCards;
	}
	
	public boolean isWinner() {
		int rowCounter = 0;
		boolean winCheck = false;
		for (int k = 0; k < playerCards.length; k++) {
//			System.out.println("Card set " + (k+1));
			for (int i = 0; i < 5; i++) {
				if (rowCounter == 5) {
					winCheck = true;
//					System.out.println(name + " has won");		//debug
					return winCheck;
				}
				else rowCounter = 0;
				for (int j = 0; j < 5; j++) {
					if(playerCards[k].isMarked(i, j))
						rowCounter++;
				}
			}
		} System.out.println(name + " has lost");
		return winCheck;
	}
	
	public void markNumber(int number) {
		for (int i = 0; i < playerCards.length; i++)
			playerCards[i].markNumber(number);
	}
	
}

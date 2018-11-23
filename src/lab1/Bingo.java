package lab1;

//class Bingo should have an array of Player objects as its instance field.
public class Bingo {
	private Player[] players;
	private String winners = new String("");

	public Bingo(Player[] players) {
		this.players = players;
	}

	public String play(int number) {
		for (int k = 0; k < this.players.length; k++) {
			this.players[k].markNumber(number);
			if(this.players[k].isWinner()){
				this.winners += (this.players[k].getName() + " ");
			}
		}
		return this.winners.trim();
	}

}
//class Player should include an array of Card objects as well as the name of the Player object as a String.

/*public class Player {
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
			for (int i = 0; i < 5; i++) {
				if (rowCounter == 5) {
					winCheck = true;
					return winCheck;
				}
				else rowCounter = 0;
				for (int j = 0; j < 5; j++) {
					if(playerCards[k].isMarked(i, j))
						rowCounter++;
						if (rowCounter == 5){
							winCheck = true;
							return winCheck;
						}
				}
			}
		} return winCheck;
	}
	
	public void markNumber(int number) {
		for (int i = 0; i < playerCards.length; i++)
			playerCards[i].markNumber(number);
	}
	
}
//class Card should include a 2D array of integers (5x5) for numbers shown on the Card object. For each one of those numbers, it should also track if the number is marked or not.

public class Card {
	private int[][] numbers = new int[5][5];

	public Card(int[][] numbers) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				this.numbers[i][j] =  numbers[i][j];
			}
		}
	}

	public int getNumber(int Row, int Column) {
		int numberReturn = this.numbers[Row][Column];
		return numberReturn;
	}
	
	public boolean isMarked(int row, int column) {
		if (this.numbers[row][column] == -1)
			return true;
		else return false;
	}
		
	public void markNumber(int number) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.numbers[i][j] == number)
					this.numbers[i][j] = -1;
			}
		}
	}
}*/
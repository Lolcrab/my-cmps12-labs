package lab1;

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
}

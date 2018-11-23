package lab1;

import java.util.Scanner;

public class Minesweeper {
	
	public static int checkMines(int[][] input, int y, int x, int[] gridSize) {
		int nearHits = 0;
		if(y==0) {
			if(x==0) {
				nearHits += input[y][x];
				nearHits += input[y][x+1];
				nearHits += input[y+1][x];
				nearHits += input[y+1][x+1];
				return nearHits;
			}
			else if (x==(gridSize[1]-1)) {
				nearHits += input[y][x];
				nearHits += input[y][x-1];
				nearHits += input[y+1][x];
				nearHits += input[y+1][x-1];
				return nearHits;
			}
			else 
			nearHits += input[y][x-1];
			nearHits += input[y][x];
			nearHits += input[y][x+1];
			nearHits += input[y+1][x-1];
			nearHits += input[y+1][x];
			nearHits += input[y+1][x+1];
			return nearHits;
		}
		else if(y==(gridSize[0]-1)){
			if(x==0) {
				nearHits += input[y-1][x];
				nearHits += input[y-1][x+1];
				nearHits += input[y][x];
				nearHits += input[y][x+1];
				return nearHits;
			}
			else if (x==(gridSize[1]-1)) {
				nearHits += input[y-1][x-1];
				nearHits += input[y-1][x];
				nearHits += input[y][x-1];
				nearHits += input[y][x];
				return nearHits;
			}
			else
			nearHits += input[y-1][x-1];
			nearHits += input[y-1][x];
			nearHits += input[y-1][x+1];
			nearHits += input[y][x-1];
			nearHits += input[y][x];
			nearHits += input[y][x+1];
			return nearHits;
		}
		/*if(x==0) {
			nearHits += input[x][y];
			nearHits += input[x+1][y];
		}
		if (x==gridSize[1]) {
			nearHits += input[x-1][y];
			nearHits += input[x][y];
		}*/
		else
			if(x==0) {
				nearHits += input[y-1][x];
				nearHits += input[y-1][x+1];
				nearHits += input[y][x];
				nearHits += input[y][x+1];
				nearHits += input[y+1][x];
				nearHits += input[y+1][x+1];
				return nearHits;
			}
			else if (x==(gridSize[1]-1)) {
				nearHits += input[y-1][x-1];
				nearHits += input[y-1][x];
				nearHits += input[y][x-1];
				nearHits += input[y][x];
				nearHits += input[y+1][x-1];
				nearHits += input[y+1][x];
				return nearHits;
			}
			else nearHits += input[y-1][x-1];
				nearHits += input[y-1][x];
				nearHits += input[y-1][x+1];
				nearHits += input[y][x-1];
				nearHits += input[y][x];
				nearHits += input[y][x+1];
				nearHits += input[y+1][x-1];
				nearHits += input[y+1][x];
				nearHits += input[y+1][x+1];
				return nearHits;
		
		
		
		/*for (int i = 0; i < gridSize[0]; i++) {
			for (int j = 0; j < gridSize[1]; j++) {
				for (int a = 0; a < 3; a++) {		//along column
					for (int b = 0; b < 3; b++) {		//along row
						int pos = -1;					//
						if (x == 0)	{					//
							pos++;
							if(input[y][x]==1)
								nearHits++;
							continue;
						}
						if (x == (gridSize[1]-1)) {
							if(input[y][x]==1)
								nearHits++;
							continue;
						}								//
						if (input[y][x+pos]==1)			//
							nearHits++;					//
														//
					}									//
				}									//
			}
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Form general grid shape
		//[row][column]
		Scanner sc = new Scanner(System.in);
		String gridInput = new String(sc.nextLine());
		String[] rowncol = gridInput.split("\\s+");
		int[] gridSize = new int[2];
		for (int i = 0; i < 2; i++)
			gridSize[i] = Integer.parseInt(rowncol[i]);
		int[][] grid = new int[gridSize[0]][gridSize[1]];
		//System.out.println(gridSize[0]+"x"+gridSize[1]);
		
		//get number of mines
		int minePop = sc.nextInt();
		sc.nextLine();	//consume \n
		//System.out.println(minePop + " mines");
		int[] mineLoc = new int[2];
		
		//get mine locations
		for (int i = 0; i < minePop; i++) {
			String mineInput = new String(sc.nextLine());
			String[] mineStringLoc = mineInput.split("\\s+");
			
			//populate minefield
			for (int j = 0; j < 2; j++)
				mineLoc[j] = Integer.parseInt(mineStringLoc[j]);
			grid[mineLoc[0]][mineLoc[1]] = 1;
			//System.out.println("Mine placed at " + mineLoc[0] + " " + mineLoc[1]);
			//if (grid[mineLoc[0]][mineLoc[1]] == 1)
				//System.out.println("Mine placed.");
		}
		
		int[][] fin = new int[gridSize[0]][gridSize[1]];
		
		//determine adjacent number of mines
		for (int i= 0; i <gridSize[0]; i++) {
			for (int j = 0; j < gridSize[1]; j++) {
				if (grid[i][j]==1)
					continue;
				fin[i][j] = checkMines(grid, i, j, gridSize);
			}
		}
		//grid[0][0] = checkMines(grid, 0, 0, gridSize);
		/*fin[0][1] = checkMines(grid, 0, 1, gridSize);
		System.out.println("Success");
		fin[0][2] = checkMines(grid, 0, 2, gridSize);
		System.out.println("Success1");
		fin[1][0] = checkMines(grid, 1, 0, gridSize);
		System.out.println("Success2");
		fin[1][1] = checkMines(grid, 1, 1, gridSize);
		System.out.println("Success3");
		fin[1][2] = checkMines(grid, 1, 2, gridSize);
		System.out.println("Success4");
		fin[2][0] = checkMines(grid, 2, 0, gridSize);
		System.out.println("Success5");
		fin[2][1] = checkMines(grid, 2, 1, gridSize);
		System.out.println("Success6");
		fin[2][2] = checkMines(grid, 2, 2, gridSize);
		System.out.println("Success7");
		*/
		
		//print minefield
		for (int i = 0; i < gridSize[0]; i++) { 		//ith row
			if (grid[i][0] == 1) {
				System.out.print("*");
			}
			else System.out.print(fin[i][0]);
			for (int j = 1; j < gridSize[1]; j++) {		//jth column
				if (grid[i][j] == 1) {
					System.out.print(" *");
					continue;
				}
				System.out.print(" " + fin[i][j]);
			}
			System.out.println();
		}
			
	}

}

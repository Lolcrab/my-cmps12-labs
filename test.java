package lab1;

import java.util.Scanner;

public class test {
	
	public static boolean javaPrefix(String input) {
		boolean result = false;
		int i = input.indexOf("JAVA");
		if(i==0) {
			result = true;
		}
		return result;
	}
	
	boolean increasing(int first, int second, int third) {
		boolean result = false;
		if((first < second) && (second < third))
			result = true;
		return result;
	}
	
	int[] diff(int[] first, int[] subtract) {
		int[] result = new int[first.length];
		for (int i = 0; i<first.length;i++) {
			result[i] = first[i] - subtract[i];
		}
		return result;
	}
	
	static void printXOs(int len, int xLen) {
		for (int j = len+1-xLen; j > 0; j--) {
			System.out.print('X');
		}
		for (int j = 1; j < xLen; j++) {
			System.out.print('O');
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		for (int i = 1; i<=length; i++) {
			printXOs(length, i);
			System.out.println();
		}
	}

}

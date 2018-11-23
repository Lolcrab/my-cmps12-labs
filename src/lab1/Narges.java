package lab1;

import java.util.Scanner;

public class Narges {

	//public static boolean charVerif(String input, char khar[]) {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] letters = {'n','a','r','g','e','s'};
		Scanner sc = new Scanner(System.in);
		String sample = new String(sc.nextLine());
		int order=0;
		int total=0;
		for (int i = 0; i < sample.length(); i++) {
			if (sample.charAt(i) != letters[order]) 
				continue;
			total++;
			order++;
			if (total == 6)
				break;
		}
		boolean verif = (total == 6);
		System.out.println(verif);
	}

}

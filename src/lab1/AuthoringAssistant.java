package lab1;

import java.util.Scanner;

public class AuthoringAssistant {
	
	public static void printMenu() {
		System.out.print(
				"MENU\n" +
				"c - Number of non-whitespace characters\n" +
				"w - Number of words\n" +
				"f - Find text\n" +
				"r - Replace all !'s\n" +
				"s - Shorten spaces\n" +
				"q - Quit\n"+
				"\n" +
				"Choose an option:\n");
	}
	
	public static int getNumOfNonWSCharacters(String input) {
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ')
				continue;
			result++;
		}
		return result;
	}
	
	public static int getNumOfWords(String input) {
		if(input == null || input.isEmpty()) {
			return 0;
		}
		String[] result = input.split("\\s+");
		return result.length;
	}
	
	public static int findText(String find, String input) {
		int result = 0;
		int prevIndex = 0;
		
		while (prevIndex != -1) {
			prevIndex = input.indexOf(find, prevIndex);
			if (prevIndex != -1) {
				result++;
				prevIndex += find.length();
			}
		} return result;
	}
	
	public static String replaceExclamation(String input) {
		String result = new String(input.replaceAll("!", "."));
		return result;
	}
	
	public static String shortenSpace(String input) {
		String result = new String(input.replaceAll("\\s{2,}", " "));
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sample text:");
		Scanner sc = new Scanner(System.in);
		String sample = new String(sc.nextLine());
		System.out.println();
		System.out.println("You entered: " + sample);
		System.out.println();
		
		char choice;
		int num = 0;
		do {
			printMenu();
			choice = sc.nextLine().charAt(0);
			
			switch (choice) {
			case 'q':
				System.exit(0);
			case 'c':
				num = getNumOfNonWSCharacters(sample);
				System.out.println("Number of non-whitespace characters: " + num);
				System.out.println();
				break;
			case 'w':
				num = getNumOfWords(sample);
				System.out.println("Number of words: " + num);
				System.out.println();
				break;
			case 'f':
				System.out.println("Enter a word or phrase to be found:");
				String findThis = new String(sc.nextLine());
				num = findText(findThis, sample);
				System.out.println("\"" + findThis + "\"" + " instances: " + num);
				System.out.println();
				break;
			case 'r':
				String replaceD = new String(replaceExclamation(sample));
				System.out.print("Edited text: ");
				System.out.println(replaceD);
				System.out.println();
				break;
			case 's':
				String shortd = new String(shortenSpace(sample));
				System.out.print("Edited text: ");
				System.out.println(shortd);
				System.out.println();
				break;
			}
		} while (choice != 'q');
		
		
		
	}

}

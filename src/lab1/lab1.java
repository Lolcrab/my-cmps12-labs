package lab1;

import java.util.Scanner;

public class lab1 {
   public static void main(String[] args) {
      /* Type your code here. */
	   Scanner sc = new Scanner(System.in);
	   int teamSize = 5;
	   int ratingsSlots = 5;
	   int[] team = new int[teamSize];
	   int[] ratings = new int[ratingsSlots];
	   
	   for (int i = 0; i < teamSize; i++) {
		   System.out.println("Enter player " + (i + 1) + "'s jersey number:");
		   team[i]=sc.nextInt();
		   System.out.println("Enter player " + (i + 1) + "'s rating:");
		   ratings[i]=sc.nextInt();
		   System.out.println();
	   }
	   
	   System.out.println("ROSTER");
	   for (int i = 0; i < teamSize; i++) {
		   System.out.println("Player " + (i + 1) + " -- Jersey number: " + team[i] + ", Rating: " + ratings[i]);
	   }
	   System.out.println();
	   
	   char choice = 0;
	   int input;
	   int newNum;
	   int newRate;
	   do {
		   System.out.println("MENU");
		   System.out.println("u - Update player rating");
		   System.out.println("a - Output players above a rating");
		   System.out.println("r - Replace player");
		   System.out.println("o - Output roster");
		   System.out.println("q - Quit");
		   System.out.println();
		   System.out.println("Choose an option:");
		   choice = sc.next().charAt(0);
		   switch (choice) {
		   case 'o':
			   System.out.println("ROSTER");
			   for (int i = 0; i < teamSize; i++) {
				   System.out.println("Player " + (i + 1) + " -- Jersey number: " + team[i] + ", Rating: " + ratings[i]);
			   }
			   System.out.println();
			   break;
		   case 'u':
			   System.out.println("Enter a jersey number:");
			   input = sc.nextInt();
			   for (int i = 0; i < teamSize; i++) {
				   if (team[i]==input) {
					   System.out.println("Enter a new rating for player:");
					   ratings[i]= sc.nextInt();
					   break;
				   }
			   }
			   break;
		   case 'a':
			   System.out.println("Enter a rating:");
			   System.out.println();
			   input = sc.nextInt();
			   System.out.println("ABOVE " + input);
			   for (int i = 0; i < teamSize; i++) {
				   if (ratings[i] > input)
					   System.out.println("Player " + (i+1) + " -- Jersey number: " + team[i] + ", Rating: " + ratings[i]);
			   }
			   System.out.println();
			   break;
		   case 'r':
			   boolean validnumber = false;
			   System.out.println("Enter a jersey number:");
			   input = sc.nextInt();
			   for (int i = 0; i < teamSize; i++) {
				   if (team[i] == input) {
					   validnumber = true;
							   break;
				   }
			   }
			   if (validnumber == true) {
			   System.out.println("Enter a new jersey number:");
			   newNum = sc.nextInt();
			   System.out.println("Enter a rating for the new player:");
			   newRate = sc.nextInt();
			   for (int i = 0; i < 5; i++) {
				   if (team[i]==input) {
					   team[i] = newNum;
				   	   ratings[i] = newRate;
					   break;
				   }
			   }
			   }
			   System.out.println();
			   break;
		   }
	   } while (choice != 'q');
	   
   }
}
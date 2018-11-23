package lab1;

import java.util.Scanner;

public class ShoppingCartManager {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//getting the name of the customer and date
		System.out.println("Enter Customer's Name:");
		String name = new String(sc.nextLine());
		System.out.println("Enter Today's Date:");
		String date = new String (sc.nextLine());
		
		//create ShoppingCart object. 
		ShoppingCart myCart = new ShoppingCart(name, date);
		
		//print name of the customer and date
		System.out.println();
		System.out.println("Customer Name: " + myCart.getCustomerName());
		System.out.println("Today's Date: " + myCart.getDate());
		System.out.println();
		
		//continue with printing menu options and reading from user
		printMenu(myCart, sc);

	}
	
	//printMenu method which has two arguments: a ShoppingCart and a Scanner object
	//This function is very similar to what you wrote for the previous lab
	public static void printMenu(ShoppingCart s, Scanner scanner) {
		char choice;
		System.out.println("MENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("q - Quit");
		System.out.println();
		do {
			System.out.println("Choose an option:");
			
			choice = scanner.nextLine().charAt(0);
			switch (choice) {
			case 'q':
				System.exit(0);
			case 'o':
				System.out.println("OUTPUT SHOPPING CART");
				s.printTotal();
				System.out.println();
				outputMenu();
				break;
			case 'i':
				System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
				s.printDescriptions();
				System.out.println();
				outputMenu();
				break;
			case 'a':
				System.out.println("ADD ITEM TO CART");
				ItemToPurchase newItem = new ItemToPurchase();
				System.out.println("Enter the item name:");
				newItem.setName(scanner.nextLine());
				System.out.println("Enter the item description:");
				newItem.setDescription(scanner.nextLine());
				System.out.println("Enter the item price:");
				newItem.setPrice(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Enter the item quantity:");
				newItem.setQuantity(scanner.nextInt());
				scanner.nextLine();
				s.addItem(newItem);
				System.out.println();
				outputMenu();
				break;
			case 'd':
				System.out.println("REMOVE ITEM FROM CART");
				System.out.println("Enter name of item to remove:");
				s.removeItem(scanner.nextLine());
				System.out.println();
				outputMenu();
				break;
			case 'c':
				System.out.println("CHANGE ITEM QUANTITY");
				ItemToPurchase modItem = new ItemToPurchase();
				System.out.println("Enter the item name:");
				modItem.setName(scanner.nextLine());
				System.out.println("Enter the new quantity:");
				modItem.setQuantity(scanner.nextInt());
				scanner.nextLine();
				s.modifyItem(modItem);
				System.out.println();
				outputMenu();
				break;
			}
		} while (choice != 'q');
	}
	public static void outputMenu() {
		System.out.println("MENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("q - Quit");
		System.out.println();
	}

}
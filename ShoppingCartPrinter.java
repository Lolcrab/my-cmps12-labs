package lab1;

import java.util.Scanner;

public class ShoppingCartPrinter{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//instantiate two objects of ItemToPurchase
	ItemToPurchase item1 = new ItemToPurchase();
	ItemToPurchase item2 = new ItemToPurchase();
	
	//print properties of the objects in the specified format
	System.out.println("Item 1");
	System.out.println("Enter the item name:");
	item1.setName(sc.nextLine());
	System.out.println("Enter the item price:");
	item1.setPrice(sc.nextInt());
	System.out.println("Enter the item quantity:");
	item1.setQuantity(sc.nextInt());
	System.out.println();
	
	System.out.println("Item 2");
	System.out.println("Enter the item name:");
	sc.nextLine();
	item2.setName(sc.nextLine());
	System.out.println("Enter the item price:");
	item2.setPrice(sc.nextInt());
	System.out.println("Enter the item quantity:");
	item2.setQuantity(sc.nextInt());
	System.out.println();
	
	//printing total cost of and list of items
	System.out.println("TOTAL COST");
	System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getPrice()*item1.getQuantity()));
	System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getPrice()*item2.getQuantity()));
	System.out.println();
	System.out.println("Total: $" + ((item1.getPrice()*item1.getQuantity())+(item2.getQuantity()*item2.getPrice())));
	}
}

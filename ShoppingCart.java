package lab1;

public class ShoppingCart {

	//private fields such as customerName, currentDate, and an array of ItemToPurchase objects
	//note that you need to instantiate the array to have size of 0 in the beginning. 
	private String customerName;
	private String currentDate;
	private ItemToPurchase[] cartItems = new ItemToPurchase[0];
	
	//default constructor
	ShoppingCart(){
		customerName = new String("none");
		currentDate = new String("January 1, 2016");
	}
	
	//non-default constructor
	ShoppingCart(String nameInput, String dateInput){
		customerName = new String(nameInput);
		currentDate = new String(dateInput);
	}
	
	//getCustomerName method
	public String getCustomerName() {
		return customerName;
	}
	
	//getDate method
	public String getDate() {
		return currentDate;
	}
	
	/*addItem method --> in this method you can declare a new bigger size array, 
	copy all existing object to the new array and place the object you receive from the
	parameter in the last index
	*/
	public void addItem(ItemToPurchase input) {
		ItemToPurchase[] newCart = new ItemToPurchase[cartItems.length + 1];
		System.arraycopy(cartItems, 0, newCart, 0, cartItems.length);
		cartItems = newCart;
		cartItems[cartItems.length - 1] = input;
	}
	
	/*
	removeItem method --> similar to addItem method, but you decrease the size of the new 
	array, find the index in the array where the item's name is equal to the string you
	get from the parameter, copy all elements, except the object at that index.
	*/
	public void removeItem(String input) {
		int i;
		boolean checkName = false;
		for (i = 0; i < cartItems.length; i++) {
			if (input.equals(cartItems[i].getName())) {
				checkName = true;
				break;
			}
		}
		if (checkName) {
			ItemToPurchase[] newCart = new ItemToPurchase[cartItems.length - 1];
			System.arraycopy(cartItems, 0, newCart, 0, i);
			System.arraycopy(cartItems, i+1, newCart, i, cartItems.length-i-1);
			cartItems = newCart;
		}
		else
			System.out.println("Item not found in cart. Nothing removed.");
	}
	
	/*
	modifyItem method --> receives an ItemToPurchase object and look for an existing object
	with the same name, if such object exists, then it changes other fields of the object
	to that of the current object if and only if the values are not default ("none" or 0)
	*/
	public void modifyItem(ItemToPurchase input) {
		int i;
		boolean checkName = false;
		for (i = 0; i < cartItems.length; i++) {
			if (input.getName().equals(cartItems[i].getName())) {
				checkName = true;
				break;
			}
		}
		if (checkName) {
			if ((cartItems[i].getPrice() != 0) && (cartItems[i].getQuantity() != 0) && !(cartItems[i].getDescription().equals("none"))) {
				cartItems[i].setQuantity(input.getQuantity());
			}
		}
		else
			System.out.println("Item not found in cart. Nothing modified.");
	}
	/*
	getNumItemsInCart method
	*/
	public int getNumItemsInCart() {
		int totQuant = 0;
		for (int i = 0; i < cartItems.length; i++) {
			totQuant += cartItems[i].getQuantity();
		}
		return totQuant;
	}
	
	//getCostOfCart method
	public int getCostofCart() {
		int totCost = 0;
		for (int i = 0; i < cartItems.length; i++) {
			totCost += (cartItems[i].getQuantity()*cartItems[i].getPrice());
		}
		return totCost;
	}
	
	//printTotal method 
	public void printTotal() {
			System.out.println(customerName + "'s Shopping Cart - " + currentDate);
			System.out.println("Number of Items: " + getNumItemsInCart());
			System.out.println();
			if (cartItems.length == 0)
				System.out.println("SHOPPING CART IS EMPTY");
			else {
				for (int i = 0; i < cartItems.length; i++) {
					System.out.println(cartItems[i].getName() + " " + cartItems[i].getQuantity() + " @ $" + cartItems[i].getPrice() + " = $" + (cartItems[i].getPrice()*cartItems[i].getQuantity()));
				}
			}
			System.out.println();
			System.out.println("Total: $" + getCostofCart());
		}
	
	//printDescriptions method
	public void printDescriptions() {
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println();
		System.out.println("Item Descriptions");
		for (int i = 0; i < cartItems.length; i++)
			System.out.println(cartItems[i].getName() + ": " + cartItems[i].getDescription());
	}
	}

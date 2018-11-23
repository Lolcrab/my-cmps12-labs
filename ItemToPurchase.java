package lab1;

public class ItemToPurchase{
	//private fields such as itemName, itemPrice, and itemQuantity
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	private String itemDescription;
	
	//default constructor
	ItemToPurchase(){
		itemName = new String("none");
		itemPrice = 0;
		itemQuantity = 0;
		itemDescription = new String("none");
	}
	
	ItemToPurchase(String nameInput, String descInput, int priceInput, int quantInput){
		itemName = new String(nameInput);
		itemPrice = priceInput;
		itemQuantity = quantInput;
		itemDescription = new String(descInput);
	}
/*	
	ItemToPurchase(String nameInput, String descInput, int priceInput){
		itemName = new String(nameInput);
		itemPrice = priceInput;
		itemQuantity = 0;
		itemDescription = new String(descInput);
	}
	
	ItemToPurchase(String nameInput, String descInput){
		itemName = new String(nameInput);
		itemPrice = 0;
		itemQuantity = 0;
		itemDescription = new String(descInput);
	}
	
	ItemToPurchase(String nameInput){
		itemName = new String(nameInput);
		itemPrice = 0;
		itemQuantity = 0;
		itemDescription = new String("none");
	}
*/	
	//setName method
	public void setName(String input) {
		itemName = input;
	}
	//getName method
	public String getName() {
		return itemName;
	}
	//setPrice method
	public void setPrice(int input) {
		itemPrice = input;
	}
	
	//getPrice method
	public int getPrice() {
		return itemPrice;
	}
	
	//setQuantity method
	public void setQuantity(int input) {
		itemQuantity = input;
	}
	
	//getQuantity method
	public int getQuantity() {
		return itemQuantity;
	}

	public void setDescription(String input) {
		itemDescription = input;
	}
	
	public String getDescription() {
		return itemDescription;
	}
	
	public void printItemCost(){
		System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice*itemQuantity));
	}
	
	public void printItemDescription() {
		System.out.println(itemName + ": " + itemDescription);
	}
}

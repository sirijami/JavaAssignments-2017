import java.util.ArrayList;

public class Checkout {
	ArrayList<DessertItem> items = new ArrayList<DessertItem>();
	
	public Checkout() {
	
    }
	
	//Returns the number of items in the list
	public int numberOfItems() {
		return items.size();
	}
	
	//Enters the item in the list
	public void enterItem(DessertItem dessert) {
		 items.add(dessert);
	}
	
	//Resets the value after each transaction
	public void clear() {
		items.clear();
	}
	
	//Returns the totalCost of all items without tax
	public int totalCost() {
		int totalCost = 0;
		for (DessertItem dessert : items){
			totalCost = dessert.getCost() + totalCost;
		}             
		return totalCost;		
	}
	
	//Returns the totalTax amount with respect to total cost of purchase
	public int totalTax() {
		int totalTax = (int) ((DessertShoppe.TAX_RATE * totalCost()) / 100);
		return totalTax;
	}
	
	//Prints the receipt of transaction
	@Override
    public String toString() {
		String reciept =  "\t\t\t"+DessertShoppe.STORE_NAME + "\n" ;
		reciept = reciept +"\t\t"+ "------------------------" + "\n";
		 for (DessertItem dessert : items) {
			 // Access child class information from parent class which is of type dessert type. 
			 //Use instance of to determine the item type (Candy/cookie/Icecream/Sundae). 
			 //Typecast the dessert item with the subclass to access child class properties
			 if(dessert instanceof Candy) {
				 Candy candy = (Candy) dessert;
				 reciept = reciept + candy.getWeight() +" lbs. @ " +
						 DessertShoppe.cents2dollarsAndCents(candy.getPricePerPound()) + " /lb. \n";
			 }
			 if(dessert instanceof Cookie) {
				 Cookie cookie = (Cookie) dessert;
				 reciept = reciept + cookie.getNumber() + " @ " + 
				         DessertShoppe.cents2dollarsAndCents(cookie.getPricePerDozen()) + " /dz. \n";
			 }
			 if(dessert instanceof Sundae) {
				 Sundae sundae = (Sundae) dessert;
				 reciept = reciept + sundae.getNameOfTopping() + " Sundae with \n";
			 }
			 reciept = reciept + dessert.getFormattedName().substring(0, DessertShoppe.SIZE_OF_ITEM_NAME) + "\t\t" + 
		     DessertShoppe.cents2dollarsAndCents(dessert.getCost()) + "\n";
		 }
		 reciept = reciept +"\n" + "Tax" + "\t\t\t\t" + DessertShoppe.cents2dollarsAndCents(totalTax())+ "\n";
		 reciept = reciept + "Total Cost " + "\t\t\t" + DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax()); 
		 return reciept;
    }
	
	public static void main (String args[]){
		Checkout checkout = new Checkout();
		checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
		checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
		checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
		
		System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
	    System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
	    System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
	    System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
	    System.out.println(checkout);
	    
	    checkout.clear();
	    
	    checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
        checkout.enterItem(new Candy("Candy Corn", 3.0, 109));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);		
	}
	

}

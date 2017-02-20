
public class Cookie extends DessertItem {
	private int number;
	private int pricePerDozen;
	
	public int getNumber() {
		return number;
	}

	public int getPricePerDozen() {
		return pricePerDozen;
	}
	
	public Cookie(String name, int number, int pricePerDozen) {
		super(name);
	    this.number = number;
	    this.pricePerDozen = pricePerDozen;
    }
	
	//Returns the price of cookie 
    public int getCost(){
   	 int cost = pricePerDozen * number / 12;
   	 return cost;
    }
 
}

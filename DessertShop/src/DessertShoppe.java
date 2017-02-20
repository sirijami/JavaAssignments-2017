
public class DessertShoppe {
	//setting all constants value
	public static final double TAX_RATE = 6.53 ;
	public static final String STORE_NAME = "CANDY SHOP";
	public static final int SIZE_OF_ITEM_NAME = 20;
	public static final int WIDTH_TO_DISPLAY = 30;
	
	// Returns the price in a string format
	public static String cents2dollarsAndCents(int priceInCents) {
		int dollar = priceInCents / 100;
		int cents = priceInCents % 100;
		if (cents < 10) {
			return  dollar + "." + "0" + cents;
		}
		return  dollar + "." + cents;		
	}

}

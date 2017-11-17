import java.util.ArrayList;


public class Customer {
	private final double taxAmount = 3.0;
	private String customerName;
	private ArrayList<Book> cart;
	private double totalPrice;
	private double priceAfterTax;
	
	public Customer(String customerName) {
		this.customerName = customerName;
		cart = new ArrayList<Book>();
		totalPrice = 0.0;
		priceAfterTax=0.0;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}

	public void addBook(Book b) {
		cart.add(b);
		totalPrice += b.getBookPrice();
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void addTax() {
		priceAfterTax = getTotalPrice() + taxAmount;
	}
	public double getPriceafterTax( ) {
		return priceAfterTax;
	}


}

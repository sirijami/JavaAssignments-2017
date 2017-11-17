
public class TestCustomer {
	
	public static void main (String args[]) {
		Book bookInfo = new Book("Head first java", 23);
		Book bookInfo1 =new Book("Web devlopment",25.5);
		Customer customer1 = new Customer("siri");
		customer1.addBook(bookInfo);
		customer1.addBook(bookInfo1);
		System.out.println("Book Name: " + bookInfo.getBookName());
		System.out.println("Book price: " + bookInfo.getBookPrice() + "$");
		System.out.println("Book Name: " + bookInfo1.getBookName());
		System.out.println("Book price: " + bookInfo1.getBookPrice() + "$");
	    System.out.println("Total price of books is " + customer1.getTotalPrice());
	    customer1.addTax();
	    System.out.println("Total Price after tax " + customer1.getPriceafterTax() );
    }

}


public class Book {
	private final int taxAmount = 2;
    private String bookName;
    private double bookPrice;
    private String bookAuthor;
 
    public Book(String bookName , double bookPrice ) {
    	this.bookName=bookName;
    	this.bookPrice = bookPrice;	
    }
    public void setBookName(String bookName){
    	this.bookName = bookName;
    }
    public String getBookName() {
    	return bookName;
    }
    public void setBookPrice(int bookPrice) {
    	this.bookPrice = bookPrice;
    }
    public double getBookPrice() {
    	return bookPrice;
    }
    public void setBookAuthor(String bookAuthor) {
    	this.bookAuthor = bookAuthor;
    }
    public String getBookAuthor() {
    	return bookAuthor;
    }
}
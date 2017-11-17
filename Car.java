
public class Car {
	private String color;
	private String model;
	private String brand;
	private double price;
	private int numberOfSeats;
	private GasTank gasTank;

	public Car(String color, String model, String brand, double price, int numberOfSeats ) {
	    this.color = color;
	    this.model = model;
	    this.brand = brand;
	    this.price = price;
	    this.numberOfSeats = numberOfSeats;
	    gasTank = new GasTank();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
	public GasTank getGasTank() {
		return gasTank;
	}

	public void setGasTank(GasTank gasTank) {
		this.gasTank = gasTank;
	}

	

}

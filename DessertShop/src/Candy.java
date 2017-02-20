
public class Candy extends DessertItem {
	private double weight ;
    private int pricePerPound;
    
    public double getWeight() {
		return weight;
	}

	public int getPricePerPound() {
		return pricePerPound;
	}

	public Candy(String name, double weight, int pricePerPound) {
    	super(name);
    	this.weight = weight;
    	this.pricePerPound = pricePerPound;
    }
	
    // Calculates the cost of candy 
    public int getCost() {
    	 double cost = weight* pricePerPound;
    	 int costAfterRoundingInCents = (int) Math.round(cost);
		 return costAfterRoundingInCents;    	 
     }
}


public class IceCream extends DessertItem {
	
	protected int costOfIceCream ;

	public IceCream(String name, int costOfIceCream) {
		super(name);
	    this.costOfIceCream = costOfIceCream;    
    }
	
	// Returns the price of the Icecream
	@Override
    public int getCost() {
	    return costOfIceCream;
    }

}

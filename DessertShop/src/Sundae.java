
public class Sundae extends IceCream{
	private String nameOfTopping;
	private int costOfTopping;

	
	public Sundae(String name, int costOfIceCream, String nameOfTopping, int costOfTopping) {
		super(name,costOfIceCream);
		this.nameOfTopping = nameOfTopping;
		this.costOfTopping = costOfTopping;   
    }

	public int getCost(){
		int cost = costOfIceCream + costOfTopping;
		return cost;
	}

	public String getNameOfTopping() {
		return nameOfTopping;
	}
	

}

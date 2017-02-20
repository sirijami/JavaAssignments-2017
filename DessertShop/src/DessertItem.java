
public abstract class DessertItem {
	//Parent class instance variables scope is set to protected as 
	//so that classes present in the package can access.
	protected String name;

	public DessertItem() {

    }
	public DessertItem(String name) {
		this.name = name;
    }
	public final String getName() {
		return name;		
	}
	
	//Extra white space added to space the gap between name of dessert and price
	public final String getFormattedName() {
		String formattedName = name + "                                                   ";
		return formattedName;
	}
	
	public abstract int getCost();
	
}

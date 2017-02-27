import java.util.ArrayList;

public class Mreview {
	private String title;
	ArrayList<Integer> rating;
	double sumOfRating = 0.0;
	double avgRating = 0.0;
	
	public Mreview() {
		this.title = "";
		this.rating = new ArrayList<Integer>();
	}
	
	public Mreview(String title) {
		this.title = title;
		this.rating = new ArrayList<Integer>();
	}

	public Mreview(String title, int firstRating) {
	    super();
	    this.title = title;
	    this.rating = new ArrayList<Integer>();
	    rating.add(firstRating);
    }
   
	public void addRating(int r) {
		rating.add(r);
	}
	
	public double aveRating() {
		if (rating.size() == 0) {
			return 0.0;
		}
		for (Integer rates : rating) {
			sumOfRating = sumOfRating + rates;			
		}
		avgRating = sumOfRating / numRatings();
		return avgRating;		
	}

	public int numRatings() {
		return rating.size();
    }

	public String getTitle() {
		return title;		
	}
	
	public boolean equals(Object obj) {
		Mreview mreviewObject = (Mreview) obj;
		return this.getTitle().equals(mreviewObject.getTitle());
	}
	
   	public int compareTo(Mreview obj) {
   		return this.getTitle().compareTo(obj.getTitle());
   }

	@Override
    public String toString() {
	    return getTitle() + ", average " + aveRating() + " out of " + numRatings() + " ratings";
    }
	
	public static void main (String args[]) {
		Mreview obj = new Mreview();
		obj.addRating(2);
		obj.addRating(3);
		obj.addRating(3);
		System.out.println(obj.toString());		
		System.out.println("----------------------");
		
		Mreview obj1 = new Mreview("Kill Bill");
		Mreview obj2 = new Mreview("Star Wars");
		Mreview obj3 = new Mreview("k");
		Mreview obj5 = new Mreview("k");
		
		obj1.addRating(2);
    	obj1.addRating(3);
		obj1.addRating(1);
		obj1.addRating(4);
		System.out.println(obj1.toString());
		System.out.println("----------------------");
		
		obj2.addRating(4);
    	obj2.addRating(0);
		obj2.addRating(1);
		obj2.addRating(4);
		System.out.println(obj2.toString());
		System.out.println("----------------------");
		
		System.out.println(obj1.compareTo(obj2));
		System.out.println(obj2.compareTo(obj1));
		System.out.println(obj3.compareTo(obj5));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj5));
		
		System.out.println("----------------------");
		
		Mreview obj6 = new Mreview("La La Land", 3);
		Mreview obj7 = new Mreview("karate kid",2);
		obj6.addRating(2);
		obj6.addRating(4);		
		obj6.addRating(3);
		obj6.addRating(4);
		System.out.println(obj6.toString());
		System.out.println("----------------------");
		
		obj7.addRating(2);
		obj7.addRating(0);
		System.out.println(obj6.toString());
		System.out.println("----------------------");
	
		System.out.println(obj6.equals(obj7));
		System.out.println(obj6.compareTo(obj7));
	
	}
}


public class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected Sex sex;
	

	public Pet(String petName, String ownerName, String color) {
	    this.petName = petName;
	    this.ownerName = ownerName;
	    this.color = color;
    }
	public String getPetName() {
		return petName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getColor() {
		return color;
	}
	//Returning the value in enum type which is of string in this case.
	public String getSex() {
		return sex.name();
	}
	//passing an integer value and getting the result in enum datatype named Sex
	public void setSex(int sexid) {
		this.sex = Sex.values()[sexid];
	}
	// Declaring a special data type that enables a variable to be a set of predefined constants.
	public enum Sex {
		MALE, FEMALE, SPAYED, NEUTERED	
	}
		
	@Override
    public String toString() {
	    return petName + " owned by " + ownerName + "\n" + "Color: " + color +"\n" + "Sex: " + getSex(); 
    }
	public static void main (String args[]){
				Pet obj = new Pet("kitty","siri","brown");
				obj.setSex(1);
				System.out.println(obj.toString());
				System.out.println("---------------------------------");
				
				// YEAR changes
				Cat obj1 = new Cat("Milky", "Avinav", "black", "short");
				obj1.setSex(0);
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 3, 2019);
				boolean isBoarding = obj1.boarding(3, 3, 2018);
				System.out.println(obj1.toString() + "\n1. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 3, 2017);
				isBoarding = obj1.boarding(3, 3, 2017);
				System.out.println(obj1.toString() + "\n2. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 3, 2018);
				isBoarding = obj1.boarding(3, 3, 2018);
				System.out.println(obj1.toString() + "\n3. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 3, 2018);
				isBoarding = obj1.boarding(3, 3, 2017);
				System.out.println(obj1.toString() + "\n4. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
		
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 3, 2018);
				isBoarding = obj1.boarding(3, 3, 2016);
				System.out.println(obj1.toString() + "\n4.1. IsBoarding should be false but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 3, 2018);
				isBoarding = obj1.boarding(3, 3, 2019);
				System.out.println(obj1.toString() + "\n4.2. IsBoarding should be false but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				// MONTH Changes
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(8, 3, 2017);
				isBoarding = obj1.boarding(3, 3, 2017);
				System.out.println(obj1.toString() + "\n5. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(8, 3, 2017);
				isBoarding = obj1.boarding(8, 3, 2017);
				System.out.println(obj1.toString() + "\n6. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(8, 3, 2017);
				isBoarding = obj1.boarding(7, 3, 2017);
				System.out.println(obj1.toString() + "\n7. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(8, 3, 2017);
				isBoarding = obj1.boarding(2, 3, 2017);
				System.out.println(obj1.toString() + "\n7.1. IsBoarding should be false but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(8, 3, 2017);
				isBoarding = obj1.boarding(9, 3, 2017);
				System.out.println(obj1.toString() + "\n7.2. IsBoarding should be false but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				// DATE changes
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 7, 2017);
				isBoarding = obj1.boarding(3, 7, 2017);
				System.out.println(obj1.toString() + "\n8. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 7, 2017);
				isBoarding = obj1.boarding(3, 6, 2017);
				System.out.println(obj1.toString() + "\n9. IsBoarding should be true but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				obj1.setBoardStart(3, 3, 2017);
				obj1.setBoardEnd(3, 3, 2017);
				isBoarding = obj1.boarding(3, 4, 2017);
				System.out.println(obj1.toString() + "\n10. IsBoarding should be false but is:" + isBoarding);
				System.out.println("---------------------------------");
				
				Dog obj2 = new Dog("alpha","sahil","white","long");
				obj2.setSex(3);
				obj2.setBoardStart(2, 3, 2017);
				obj2.setBoardEnd(3, 3, 2019);
				obj2.boarding(1, 2,2017);
				System.out.println(obj2.toString());
			    System.out.println("---------------------------");
			    
				Pet obj3 = new Pet("hana", "laks", "brownAndblack");
				obj3.setSex(2);
				System.out.println(obj3.toString());
	
	}
}

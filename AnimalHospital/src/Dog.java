
public class Dog extends Pet implements Boardable {
	private String size;
	private int startMonth;
	private int startDay;
	private int startYear;
	private int endMonth;
	private int endDay;
	private int endYear;

	public Dog(String petName, String ownerName, String color, String size) {
	    super(petName, ownerName, color);
	    this.size = size;
    }
	
	public String getSize() {
		return size;
	}

	@Override
    public void setBoardStart(int month, int day, int year) {
		this.startMonth = month;
		this.startDay = day;
		this.startYear = year;
		dateValidation(month, day, year);	    
    }

	@Override
    public void setBoardEnd(int month, int day, int year) {
		this.endMonth = month;
		this.endDay = day;
		this.endYear = year;
		dateValidation(month, day, year);
    }

	@Override
    public boolean boarding(int month, int day, int year) {
		if((startYear < year) && (year < endYear)){
			return true;
		} else if ((startYear == year) && (endYear == year) && (startMonth == month && endMonth == month)){
			if (day >= startDay  && day <= endDay) {
				return true;
			}
		}else if (startYear == endYear){
			if ((year >= startYear) && ( month >= startMonth && month <= endMonth))  {
				return true;
			}
		}else if((startYear == year && year < endYear )&& (startMonth == month)) {
			if(startDay <= day){
			    return true;					
			}
		}else if(startYear == year && year < endYear){
			if(startMonth <= month) {
				return true;			
			}
		}else if((endYear == year &&  year > startYear ) && (endMonth == month)){
			if(endDay >= day){
				return true;
				}
		}else if(endYear == year && year > startYear){
			if(endMonth >= month) {
				return true;			
			}
		}
		return false;
	}

	@Override
    public String toString() {
	    return "DOG:\n" + getPetName() + " owned by " + getOwnerName() +"\n" + "Color: " + getColor() + "\n"
	    		+ "Sex: " + getSex() + "\n" + "Size: " + getSize();
    }
	
	protected void dateValidation(int month, int day, int year){
		if ( ((year / 10000 >= 1) || (year/1000 < 1))) {
			System.out.println(year + " is not a valid year. Enter a valid year");	
		}
		if (month > 12 || month < 1) {
			System.out.println(month + " is not a valid month. Enter valid month");
		}
		if (day <1 || day > 31){
			System.out.println(day + " is not a valid day. Enter valid day");
		}
		switch(month) {
			case 2: 
				if(year % 4 == 0){
					if(day > 29) {
						System.out.println(day +" Not a valid day");
						break;
					} 
				}
				else if(day > 28){
						System.out.println(day + " Not a valid day");
						break;
				}					
			case 1: 
			case 3:
			case 5:
			case 7: 
			case 8: 
			case 10:
			case 12:
				if(day > 31 && day <1) {
					System.out.println(day + "not a valid day");
					break;
				}
			case 4: case 6: case 9: case 11:
				if( day > 30 && day < 1){
					System.out.println(day + "not a valid day");
				}				
		}
	}
	
//
//	public static void main(String args[]) {
//		Dog obj = new Dog("alpha","sahil","white","long");
//		obj.setSex(3);
//		System.out.println(obj.toString());
//		obj.setBoardStart(2, 3, 2017);
//		obj.setBoardEnd(3, 3, 2019);
//		obj.boarding(1, 2,2017);
//	    System.out.println("---------------------------");	
//		Pet obj1 = new Pet("hana", "laks", "brownAndblack");
//		obj1.setSex(2);
//		System.out.println(obj1.toString());
//    }


	

}

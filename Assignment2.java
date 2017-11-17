/*score:8.5 + 1(extra credit)
comments:pay attention to "if" and "else"
*/
public class Assignment2 {

	public static void main(String[] args){
		// TEST DATA
		Assignment2 assignments = new Assignment2();
		Employee e1 =new Employee("avi", 62, Gender.MALE, 8999);
		Employee e2 =new Employee("siri", 62, Gender.FEMALE, 8999);
		Employee e3 = new Employee("Tara", 20, Gender.FEMALE, 2000);
        Employee e4 = new Employee("Sahil", 30, Gender.MALE, 2500);
        Employee e5= new Employee("rosie", 25, Gender.FEMALE, 8900);
        
        // *** TEST CASES FOR SOCIAL socialSecurityTax() ***
        // salary < 8900
        assignments.socialSecurityTax(e4);
        
        // salary > 8900
        assignments.socialSecurityTax(e1);
        
        // salary = 8900
        assignments.socialSecurityTax(e5);
        
        //***TEST CASES FOR insuranceCoverage() ***
        // age < 35
        assignments.insuranceCoverage(new Employee("sir", 24, Gender.FEMALE, 5000));
        
        // age = 35
        assignments.insuranceCoverage(new Employee("sir", 35, Gender.FEMALE, 5000));
        
        // age = 45
        assignments.insuranceCoverage(new Employee("sir", 45, Gender.FEMALE, 5000));
        
        // age = 50
        assignments.insuranceCoverage(new Employee("sir", 50, Gender.FEMALE, 5000));
        
        // age = 55
        assignments.insuranceCoverage(new Employee("sir", 55, Gender.FEMALE, 5000));
        
        // age = 60
        assignments.insuranceCoverage(new Employee("sir", 60, Gender.FEMALE, 5000));
        
        // age = 70
        assignments.insuranceCoverage(new Employee("sir", 70, Gender.FEMALE, 5000));
        
        //***TEST CASES FOR sortSalary() ***
              
        assignments.sortSalary(e1, e2, e3);
        
        assignments.sortSalary(e2, e4, e5);
        
        
        //***TEST CASES FOR tripleSalary() *** 
        
        //salary=5000
        assignments.tripleSalary(new Employee("siri", 24, Gender.FEMALE, 5000));
        
        //salary=8900
        assignments.tripleSalary(new Employee("sir", 24, Gender.FEMALE, 8900));
        
        
        //***TEST CASES FOR isPrim() ***
        
        //Prime number=1
        assignments.isPrime(1);
        
        //Prime number=2
        assignments.isPrime(2);
        
        //Prime Number=9
        assignments.isPrime(9);
        
        //Prime Number=11
        assignments.isPrime(11);
        
        //Prime number=14
        assignments.isPrime(14);
        
        //Prime Number=15
        assignments.isPrime(15);
        
        //Prime number=167
        assignments.isPrime(167);
        
        //Prime number=169
        assignments.isPrime(169);
        
        //Prime number=853
        assignments.isPrime(853);

        //***TEST CASES FOR addDigits() ***
        
        //number = 3
        assignments.addDigits(9);
        
        //number = 13
        assignments.addDigits(13);
        
        //number = 10
        assignments.addDigits(10);
        
        //number = 107
        assignments.addDigits(107);
        
        //number = 135
        assignments.addDigits(935);
     
        //number = 498
        assignments.addDigits(898);
        
      //***TEST CASES FOR isUgly() ***
        
        //number = 14
        assignments.isUgly(14);
        
        //number = 15
        assignments.isUgly(15);

        //number = 16
        assignments.isUgly(16);

        //number = 49
        assignments.isUgly(49);

        //number = 169
        assignments.isUgly(169);

        //number = 51
        assignments.isUgly(51);

        //number = 1
        assignments.isUgly(1);

        //number = 65
        assignments.isUgly(65);
        
        
        Employee a = new Employee("jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("john", 30, Gender.MALE, 2700);
        System.out.println("Before: a=" + a.getName());

        System.out.println("Before: b=" + b.getName());

        swap(a, b);

        System.out.println("After: a=" + a.getName());

        System.out.println("After: b=" + b.getName());
        }
        
	// Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */

	public double socialSecurityTax(Employee employee) {                          //correct
		double socialSecurityTax;
		if (employee.getSalary() <= 8900) {
			socialSecurityTax= 0.062 * employee.getSalary();
		} else {
			socialSecurityTax = (0.062*106800);
		}
		System.out.println("The social security tax amount is " + socialSecurityTax);
		return socialSecurityTax;
	}
	
    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
	public double insuranceCoverage(Employee employee) {                               //correct
		double amountContributed = 0;
		if (employee.getAge()<35) {
			amountContributed=0.03*employee.getSalary();
		} else if ((employee.getAge() >= 35) && (employee.getAge() <= 50)) {
			amountContributed=0.04*employee.getSalary();
		} else if ((employee.getAge()>50)&& employee.getAge()<60) {
			amountContributed=0.05*employee.getSalary();
        } else if (employee.getAge()>=60) {
        	amountContributed=0.06*employee.getSalary();
        }
		System.out.println("The amount contributed for insurance coverage is " + amountContributed);
		return amountContributed;
	}
	
	/**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
	
	public void sortSalary(Employee e1, Employee e2, Employee e3) {              //you miss an "else" after the second "if". For example, e1's salary is 1, e2's salary is 2, e3's salary is 3, you will print two lines
        if((e1.getSalary()<e2.getSalary()) &&(e1.getSalary()<e3.getSalary())){
       	      if(e2.getSalary()<e3.getSalary()){
       	    	     System.out.println(e1.getName()+" "+e2.getName()+" "+e3.getName()); 
       	    	 }
       	             System.out.println(e1.getName()+" "+e3.getName()+" "+e2.getName());
       	    }else if((e2.getSalary()<e1.getSalary()) &&(e2.getSalary()<e3.getSalary())){
                  if(e1.getSalary()<e3.getSalary()){
               	     System.out.println(e2.getName()+" "+e1.getName()+" "+e3.getName());
               	 }
                        System.out.println(e2.getName()+" "+e3.getName()+" "+e1.getName());
              }else if((e3.getSalary()<e1.getSalary()) &&(e3.getSalary()<e2.getSalary())){
           	   if(e1.getSalary()<e2.getSalary()){
           		     System.out.println(e3.getName()+" "+e1.getName()+" "+e2.getName());
           	     }
           	         System.out.println(e3.getName()+" "+e2.getName()+" "+e1.getName());
              }
     }
	

	/**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
	
	
	public void tripleSalary(Employee employee) {            //correct
	    employee.raiseSalary(300);
    }
	
	/**
     * Write a method to determine whether a number is prime
     */
	
	
	 public boolean isPrime(int n) {                        //correct
		 
		 if ((n == 1)||(n==0)) { 
			 System.out.println(n + " Not a prime number");
			 return false;
			 }
		 
		 for (int i=2;i<n;i++) {
			 if ( n%i == 0) {
				 System.out.println(n + " is not a prime number");
				 return false;
				 } 
			 }
		 System.out.println(n +" is a prime number");
		 return true;
		 }
	 
	 
	 /**
	     * Given a non-negative integer n, repeatedly add all its digits until the
	     * result has only one digit. For example: Given n = 38, the process is
	     * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	     */
	 
	 public int addDigits(int n) {                                         //correct
		 System.out.println("number " + n);
		 int sum = 0;
		 if (n <= 9){
			 //prints the number
		 }
		 while (n > 9) {
			 if (n > 0) {
				 int rem = n % 10;
				 int div = n / 10;
				 sum = rem + div;
				 }
			 n = sum;
			 }
		 System.out.println("Rseult after adding digit until one digit "+  n );     
		 return n;
        }
	 
	 /**
	     * Write a program to check whether a given number is an ugly number. Ugly
	     * numbers are positive numbers whose prime factors only include 2, 3, 5.
	     * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	     * another prime factor 7. Note that 1 is typically treated as an ugly
	     * number.
	     */
   
   public boolean isUgly(int n) {                                       //correct
	   int orginalNumber = n;
	   if (n == 1 ) {
		   System.out.println(orginalNumber + " is an ugly number ");
		   return true;
	   }
	   if (n > 1) {
		   while ( n % 2 == 0 ) {
			   int quotient = n/2;
			   n = quotient;
			   if (n == 1) {
				   System.out.println(orginalNumber + " is an ugly number ");
				   return true;
				   }
		   }
		   while (n % 3 == 0) {
			   int quotient = n/3;
			   n = quotient;			   
			   if (n == 1) {
				   System.out.println(orginalNumber + " is an ugly number ");
				   return true;
			   }
		   }
           while (n % 5 == 0) {
			   int quotient = n/5;
			   n = quotient;
			   if (n == 1) {
				   System.out.println(orginalNumber + " is an ugly number ");
				   return true;
			   }
		   }
	   }
	   System.out.println(orginalNumber + " is not an ugly number ");
	   return false;
   }
   
 //Extra credit

   /**
    * I have written some code below. What I want is to swap two Employee objects.
    * One is Jenny and one is John. But after running it, I got the result below:
    * Before: a=Jenny
    * Before: b=John
    * After: a=Jenny
    * After: b=John
    * There is no change after swap()! Do you know the reason why my swap failed?
    * Write your understanding of the reason and explain it.
    */
	//correct
   /* My understanding:
   /* There is no swap as the reference variable a and b refers to same object even after calling method.
   /* So, they were not swapped.
   */
    
   public static void swap(Employee x, Employee y) {
	   Employee temp = x;
       x = y;
       y = temp;
   }
}
	   
	   
	   
	   
	   
	





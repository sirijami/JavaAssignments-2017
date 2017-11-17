
public class Employee {

	String name;
    int age;
    Gender gender;
    double salary;// salary per month
    double byPercent;
  
    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
       }
    
    public String getName() {
        return name;
    }
   
    public int getAge(){
    	return age;
    	}
    public double getSalary(){
    	return salary;
    }
    public Gender getGender(){
    	return gender;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
    	this.age=age;
    }
    public void setSalary(double salary){
    	this.salary=salary;
    }
    public void setGender(Gender gender){
    	this.gender=gender;
    }
    
    public void raiseSalary(double byPercent){
    	   salary = salary * (byPercent/100);
    	   System.out.println("The raised salary is " + salary);	  
    }
   
}
enum Gender {
    MALE,
    FEMALE;
}





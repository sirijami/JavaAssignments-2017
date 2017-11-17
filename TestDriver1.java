
public class TestDriver1 {

	public static void main(String[] args) {
		  Car car = new Car("blue", "Sonata", "hyundai", 50.0, 5);
		  Driver driver = new Driver("Sirisha");
		  //First get the amount of gas present in gas tank
		  System.out.println("Amount of gas present in Gastank " + car.getGasTank().getGasLevel());
		  //AddGas
		  driver.addGas(car, 20.0);
		  
		  //Driver drives car
		  driver.drive(car);
		  
		  //Driver checks gas status
		  driver.driverChecksGasStatus(car);
		  
		  //Driver drives car
		  driver.drive(car);
		  driver.drive(car);
		  driver.drive(car);
		  
		  //driver check gas status
		  driver.driverChecksGasStatus(car);
		  
		  driver.drive(car);
		  driver.drive(car);
		  driver.drive(car);
		  
	}

}

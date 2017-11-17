public class Driver {
	private String driverName;
	
	public Driver(String driverName) {
		this.driverName = driverName;
		
	}
	
	public void drive(Car car) {
		if(car.getGasTank().getGasLevel() <= 4.0) {
			System.out.println("Not enough gas to drive");
			} else {
		    car.getGasTank().useGas(4.0);
		    System.out.println("Amount of gas left after driving " + car.getGasTank().getGasLevel());
			}
		}
	
	public void driverChecksGasStatus(Car car) {
		if(isGasLow(car)) {
			System.out.println("Gas level reached the lower limit. So adding gas");
			addGas(car, 5);
			System.out.println("Gas added!!");
			System.out.println("The amount of gas after adding :" + car.getGasTank().getGasLevel());
			} else {
				System.out.println("Enough gas is there to drive");
			}
		}
	
	public void addGas(Car car, double amount ) {
		car.getGasTank().addGas(amount);
		System.out.println("Amount after adding gas " + car.getGasTank().getGasLevel());
	}
	
	public boolean isGasLow(Car car) {
		if (car.getGasTank().getGasLevel() < 10) {
			  return true;
		} 
		      return false;
		}

}

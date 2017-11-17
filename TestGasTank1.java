
public class TestGasTank1 {

	public static void main(String[] args) {

		GasTank gasTank = new GasTank();
		System.out.println("The amount of gas is there: " + gasTank.getGasLevel() );
		//Add Gas
		gasTank.addGas(10.0);
		System.out.println("The amount of gas is there: " + gasTank.getGasLevel() );
		//Use Gas
		gasTank.useGas(5.0);
		System.out.println("The amount of gas is there: " + gasTank.getGasLevel() );
		//Use Again
		gasTank.useGas(6.0);
		System.out.println("The amount of gas is there: " + gasTank.getGasLevel() );
		//Use Again
		gasTank.useGas(5.0);
		System.out.println("The amount of gas is there: " + gasTank.getGasLevel() );
		//Use Gas
		gasTank.useGas(3.0);
		System.out.println("The amount of gas is there: " + gasTank.getGasLevel() );
		
		

	}
	
	
}

public class GasTank {
   private double amount;
   
   public void GasTank() {
	   amount= 0.0;
   }

   public void addGas(double value) {
	  amount  = amount + value;
   }
   
   public void useGas(double value) {
	   if (amount <= 0.0) {
		   System.out.println("GasTank is empty!!");
		   } else if (amount < value) {
		   System.out.println("Sorry!! don't have enough gas to run ");
		   } else {
			   amount = amount - value;
			   }
	   }
   
   public double getGasLevel() {
	   return amount;
   }
}

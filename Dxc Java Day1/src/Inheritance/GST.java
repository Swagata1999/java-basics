package Inheritance;

public class GST extends IncomeTax{
	
	String aadhaarCard; // additional property/partition of the child class
	
	/**
	 * to give a new definition to calculeTax method
	 */
	@Override
	int calculateTax(int income) {
		// TODO Auto-generated method stub
		int tax = super.calculateTax(income); //reusing the functionality
		if(income > 10000) {
			  tax = income/5;
		}
		return tax;
	}

}
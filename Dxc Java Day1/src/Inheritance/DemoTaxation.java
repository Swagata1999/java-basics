package Inheritance;

public class DemoTaxation {

	public static void main(String[] args) {
		IncomeTax incomeTax = new IncomeTax();
		GST gst = new GST();
		int tax = gst.calculateTax(10000);
		System.out.println("tax is  "+tax);
	}

}
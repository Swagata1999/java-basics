package ecommerce;
public class Customer {
 public void walkin() {
	 System.out.println("abdul is going inside big bazar");
	 
 }
 public void shop() {
	 System.out.println("cust is shopping");
 }
 public void checkout() {
	 Cashier ansariCashier=new Cashier();
	 ansariCashier.estimate();
 }
}
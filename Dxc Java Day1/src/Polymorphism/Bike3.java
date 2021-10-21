package Polymorphism;
public  class Bike3{  
	
	final int speedlimit=90;//final variable  
	
	 void run(){  
		//speedlimit=400;  
	}  
	
	
	public static void main(String args[]){  
		Bike3 obj=new  Bike3();  
		obj.run();  
		Bike3 myBike = new Bike3(); //this has one partition-- speedLimit
		Honda myHonda = new Honda(); //this has 2 partitions -- speedLimit and petrolTank
		//myHonda = (Honda) myBike; //upcasting is not defined -- which partition should i remove i don't know
		myBike = (Bike3)myHonda; //downcasting -- petrol tank partition from honda gets removed
	}  
	
	
}

class Honda extends Bike3{  
	int petrolTank = 5;
	   void run(){System.out.println("running safely with 100kmph");}  
}
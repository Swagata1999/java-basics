package Basics;

public class DebugDemo {
	
	public static void main(String[] args) {
		System.out.println("DebugDemo-- main");
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("the sum is--"+sum);

		throw new NullPointerException();
	}

}
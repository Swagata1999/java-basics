package Basics;

public class DebugDemo {
	
	public static void main(String[] args) {
		System.out.println("DebugDemo-- main");
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("the sum is--"+sum);
		Student abdul = new Student("ansari",123);
		//Student myStudent = new Student();
		//Student yourStudent = new Student("geethanjali");
		for(int a=0; a<5; a++) {
			int j = a *2;
			int f = a+ 5 *3 +j;
			System.out.println("the no is="+f);
			
		}
		throw new NullPointerException();

	}
	

}
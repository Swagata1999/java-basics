package Threads;

public class OfficeBoy extends Thread{
	
	
	
	public OfficeBoy(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is getting water");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

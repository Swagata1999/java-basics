package Threads;

public class WorkerThread implements Runnable {
	String message;
	
	
	
	
	public WorkerThread(String msg) {
		message = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +":--i am working on --  "+message);
		processMessage();
		System.out.println("i am done with "+message+" thread name is "+ Thread.currentThread().getName());
	}

	private void processMessage() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
package eg_using_thread_class;

public class MyThread extends Thread {

	// in the run() method is where you specify the job of the threads which you
	// create
	@Override
	public void run() {
		//System.out.println("Hello from " + Thread.currentThread().getName() + " whose id is : "
		//		+ Thread.currentThread().getId() + " with priority " + Thread.currentThread().getPriority());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing from thread "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

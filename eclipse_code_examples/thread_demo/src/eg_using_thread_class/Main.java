package eg_using_thread_class;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println(10/0);
		Thread t=Thread.currentThread();
		System.out.println(t);//[thread_name,priority,thread_group] 
		//priority ranges from 1 to 10, 1 is Min priority 10 is max priority and 5 is normal priority which is given to main
		//nowhere the priority is guaranteed because java handles these threads at OS level and every OS has its own way to manage these threads.
		//wherever you create the thread, the priority of the place where you are creating it, will be passed to the new thread.
		t.setPriority(6);
		t.setName("vinay's-main");
		System.out.println(Thread.currentThread());
		
		//System.out.println(10/0);
		
		MyThread t1=new MyThread();
		t1.setName("my-1");
		MyThread t2=new MyThread();
		t2.setName("my-2");
		MyThread t3=new MyThread();
		t3.setName("my-3");
		MyThread t4=new MyThread();
		t4.setName("my-4");
		MyThread t5=new MyThread();
		t5.setName("my-5");
		t5.setPriority(7);
		
		
		t1.start();//start() will call run method
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
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

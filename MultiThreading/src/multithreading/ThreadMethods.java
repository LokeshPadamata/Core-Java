package multithreading;

class Mythread1 extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadMethods {

	public static void main(String[] args) {
		  Mythread1 thread1 = new Mythread1();
		  thread1.setName("Thread 1");
		  System.out.println("thread1 state: " + thread1.getState());
		  thread1.start();
		  System.out.println("thread1 state: " + thread1.getState());
		  System.out.println("thread1 priority: " + thread1.getPriority());
		  
		  Mythread1 thread2 = new Mythread1();
		  thread2.setName("Thread 2");
		  System.out.println("thread2 state: " + thread2.getState());
		  thread2.start();
		  System.out.println("thread2 state: " + thread2.getState());
		  thread2.setPriority(8);
		  System.out.println("thread2 priority: " + thread2.getPriority());
		  System.out.println("Max Priority: " + Thread.MAX_PRIORITY);
		  System.out.println("Min Priority: " + Thread.MIN_PRIORITY);
		  System.out.println("Active count: " + Thread.activeCount());  // 3 because thread1,thread2 and main thread
		  
		//System.out.println(Thread.currentThread().getName());   // main/default thread by jvm
		//System.out.println(Thread.currentThread().getState());    // thread is in runnable state
	}

}

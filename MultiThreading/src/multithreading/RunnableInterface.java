package multithreading;

class CustomThread implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		CustomThread customThread = new CustomThread();
		Thread t1 = new Thread(customThread);
		System.out.println(t1.getState());
		t1.setName("Thread 1");
		t1.start();
		System.out.println(t1.getState());
	}

}

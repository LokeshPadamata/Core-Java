package multithreading;


class Tcycle extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreadLifeCycle {

	public static void main(String[] args) {
		Tcycle t1 = new Tcycle();
		Tcycle t2 = new Tcycle();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		System.out.println("Thread 1 Before start: " + t1.getState());
		System.out.println("Thread 2 Before start: " + t2.getState());
		t1.start();
		t2.start();
		System.out.println("Thread 1 After start: " + t1.getState());
		System.out.println("Thread 2 After start: " + t2.getState());
	}

}

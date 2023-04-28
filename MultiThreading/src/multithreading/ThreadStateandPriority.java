package multithreading;

class Threads extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadStateandPriority{
	public static void main(String[] args) {
		Threads t1 = new Threads();
		t1.setName("Thread 1");
		t1.setPriority(1);
		Threads t2 = new Threads();
		t2.setName("Thread 2");
		t2.setPriority(7);
		Threads t3 = new Threads();
		t3.setName("Thread 3");
		t3.setPriority(3);
		t1.start();
		t2.start();
		t3.start();
	
	}
}
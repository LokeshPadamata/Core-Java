package multithreading;

class Mythread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadClassDemo{
	public static void main(String[] args) {
		Mythread thread1 = new Mythread();
		thread1.setName("Thread 1");
		thread1.start();
		
		Mythread thread2 = new Mythread();
		thread2.setName("Thread 2");
		thread2.start();
	}
}
package multithreading;

class Table extends Thread{
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			int x = n*i;
			System.out.println(x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Th1 extends Thread{
		Table t;
		Th1(Table table){
				this.t = table;	
			}
		@Override
		public void run() {
		// TODO Auto-generated method stub
			super.run();
			t.printTable(2);
		}
}
class Th2 extends Thread{
	Table t;
	Th2(Table table){
		this.t =table;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		t.printTable(5);
	}
}
public class TestSyncronization {

	public static void main(String[] args) {
		Table t = new Table();
		Th1 th1 = new Th1(t);
		Th2 th2 = new Th2(t);
		th1.start();
		th2.start();

	}

}

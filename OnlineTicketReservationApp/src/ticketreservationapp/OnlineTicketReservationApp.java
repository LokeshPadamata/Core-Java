package ticketreservationapp;

class Reserve extends Thread{
	static int availabletickets = 30;
	synchronized void reserveTickets(int reqtickets) {
		if(availabletickets >= reqtickets) {
			System.out.println("Tickets Available Book now");
			try {
				
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Avaible Tickets: " + availabletickets +"\t"+ "Requested Tickets: " + reqtickets );
			System.out.println(reqtickets + "Tickets are Booked");
		
			availabletickets = availabletickets - reqtickets;
		}
		else {
			System.out.println("Requested Tickets not available");
			}
		System.out.println("Availabletickets are: " + availabletickets);
	}
}
class Person extends Thread{
	Reserve reserve;
	int reqtickets;
	public Person(Reserve reserve,int reqtickets){
		this.reserve =reserve;
		this.reqtickets = reqtickets;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		reserve.reserveTickets(reqtickets);
	}
}


public class OnlineTicketReservationApp {

	public static void main(String[] args) {
		Reserve reserve = new Reserve();
		Person thread1 = new Person(reserve,10);
		thread1.start();
		
		Person thread2 = new Person(reserve,15);
		thread2.start();
		
		Person thread3 = new Person(reserve,10);
		thread3.start();

	}

}

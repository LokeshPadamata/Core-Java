package functionalinterface;

interface Remote{
	public void onOff();
}
/* class Remote1 implements Remote{
	public void onOff() {
		
	}
}
class Remote2 implements Remote{
	public void onOff() {
		
	}
}   */
public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		
		// Lambda Expression
		Remote remote = () -> System.out.println("Implementation 1");
		Remote remote1 = () -> System.out.println("Implementation 2");
		remote.onOff();
		remote1.onOff();

	}

}

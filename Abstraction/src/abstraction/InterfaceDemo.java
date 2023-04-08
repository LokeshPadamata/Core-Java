package abstraction;

interface A{
	void m1();   
	void m2();
	void m3();    //should contain all un implemented menthods
}
class Aimpl implements A{
	public void m1() {
		System.out.println("implementing m1 method");
	}
	public void m2() {
		System.out.println("implementing m2 method");
	}
	public void m3() {
		System.out.println("implementing m3 method");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		A obj = new Aimpl(); //we should create object for class not for interface
		obj.m1();
		obj.m2();
		obj.m3();

	}

}

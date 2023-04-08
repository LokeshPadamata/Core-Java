package abstraction;

interface A1{
	void m1();
	void m2();
	void m3();
}
abstract class A1impl implements A1{      //abstract class can contain both implemented and unimplemented classes
	public void m1() {
		System.out.println("Calling m1 method");
	}
	public void m2() {
		System.out.println("Calling m2 method");
	}
	public abstract void m3();
	abstract void m4();
}
class A1implChild extends A1impl{
	public void m3() {
		System.out.println("calling m3 method");
	}
	public void m4() {
		System.out.println("calling m4 method");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		A1 obj = new A1implChild();
		obj.m1();
		obj.m2();
		obj.m3();
		A1implChild obj1 = new A1implChild();
		obj1.m4();
	}

}

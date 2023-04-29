package functionalinterface;


interface A{
	public void m1();
	public default void m2() {   // default method in the functional interface A
		System.out.println("I am a default method");
	}
}
class B implements A{
	public void m1() {
		System.out.println("m1() method");
	}
}
class C implements A{
	public void m1() {
		System.out.println("m1() of C");
	}
}
public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new B();
		aa.m1();
		aa.m2();
		A cc = new C();
		cc.m1();
	}

}

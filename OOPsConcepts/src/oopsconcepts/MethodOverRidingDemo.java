package oopsconcepts;
class A1{
	void m1() {
		System.out.println("Calling m1 method in A");
	}
	void m2() {
		System.out.println("Calling m2 method in A");
	}
}
class B1 extends A1{
	void m2() {
		System.out.println("Calling m2 method in B");
	}
}
public class MethodOverRidingDemo {

	public static void main(String[] args) {
		//B1 b = new B1();
		//b.m2();
		//b.m1();
		A1 a = new B1();  //Dynamic Polymorphism
		a.m2();
	}

}

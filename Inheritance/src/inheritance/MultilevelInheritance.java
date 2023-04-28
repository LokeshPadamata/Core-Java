package inheritance;

class Parent{
	int x=10;
	int a=100;
}
class Child1 extends Parent{
	int y=20;
}
class Child2 extends Parent{
	int z=30;
}
class Child3 extends Parent{
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Child3 c3 = new Child3();
		System.out.println(c3.x);
		Child2 c2 = new Child2();
		System.out.println(c2.a);

	}

}

package inheritance;

class A{
	int a=100;
	int b=200;
}
class B extends A{
	int c=300;
	int d=400;
}
class C extends B{
	int e=500;
}
class D extends C{
	int f=600;
	int g=700;
}
public class HierarchialInheritance {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.a + "\t" + d.f + "\t" + d.c);
		C c = new C();
		System.out.println(c.b + "\t"+ c.a +"\t"+c.e);
	}

}


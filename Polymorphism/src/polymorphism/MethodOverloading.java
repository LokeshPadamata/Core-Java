package polymorphism;

class Polymorphism{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(float a,float b,float c) {
		System.out.println(a+b+c);
	}
	public int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.add(2,3,4);
		p.add(10.5f , 2.3f , 4.5f);
		p.add(5, 2);
		System.out.println(p.add(1,2,3,4));

	}

}

package constructors;
class Super{
	public Super() {
		System.out.println("This is a Super Class Constructor");
	}
	public void m1() {
		System.out.println("Calling m1");
	}
}
class Subclass extends Super{
	String name = "Varun";
	Subclass(){
		super();   // Super Keyword is used to inherit the Superclass constructor
		System.out.println("This is a Sub Class Constructor");
	}
	
}
public class ConstructorInheritance {

	public static void main(String[] args) {
		Subclass sub = new Subclass();
		System.out.println(sub.name);
	}

}
package basics;

public class InstanceVariables {
	String name = "Varun";  //Instance  Declared can't be changed
	int age = 20;
	String email = "varun@gmail.com";
	public static void main(String[] args) {
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name); 
		System.out.println(obj1.age);
		System.out.println(obj1.email);
		System.out.println("_____________________");
		InstanceVariables obj2 = new InstanceVariables();
		obj1.name = "SM";
		obj1.age = 22;
		obj1.email = "sm@gmail.com";
		System.out.println(obj2.name); 
		System.out.println(obj2.age);
		System.out.println(obj2.email);
		
		
		
		
		
	}
}

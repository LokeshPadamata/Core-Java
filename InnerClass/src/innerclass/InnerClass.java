package innerclass;

class Outerclass {
	String name = "varun";
	int age = 20;
	class InClass{
		public void display() {
			float salary = 8000;
			System.out.println(age);
			System.out.println(salary);
			System.out.println(name);
		}
	}
	void accessToInner() {
		InClass in = new InClass();
		in.display();		
	}
	
}
public class InnerClass {
	public static void main(String[] args) {
		Outerclass outer = new Outerclass();
		outer.accessToInner();
	}
	
	
}

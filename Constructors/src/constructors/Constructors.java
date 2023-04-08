package constructors;

class Employee{
	int id;
	String name;
	long salary;
	
	//Parametrized constructor
	public Employee(int id,String name,long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
}
public class Constructors {
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"varun",100000);
		Employee e2 = new Employee(101,"Eswar",10000);
		System.out.println(e1.id + "\t" + e1.name +"\t" + e1.salary);
		System.out.println(e2.id + "\t" + e2.name +"\t" + e2.salary);

	}

}


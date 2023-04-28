package basics;

class Employe{
	String name;
	int id;
	float salary;
	
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Employe s = new Employe();
		s.name = "Ravi";
		s.id = 150;
		s.salary = 30000;
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.salary);
		
	}

}
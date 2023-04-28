package encapsulation;

class Employee{
	private String id;
	private String name;
	private long salary;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}	
}
public class UsingGettersAndSetters {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId("Varun101");
		e.setName("Varun");
		e.setSalary(20000);
		System.out.println(e.getId());
		System.out.println(e.getSalary());
		System.out.println(e.getName());	
}
}
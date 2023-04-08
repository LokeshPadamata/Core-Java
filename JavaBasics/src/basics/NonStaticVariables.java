package basics;
class Student{
	int rollno;
	String name;
	String branch;
}
public class NonStaticVariables {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollno = 10;
		s1.name = "Varun";
		s1.branch = "ECE";
		Student s2 = new Student();
		s2.rollno = 11;
		s2.name = "SM";
		s2.branch = "Mech";
		System.out.println(s1.rollno +"\t" + s1.name + "\t" + s1.branch);
		System.out.println(s2.rollno +"\t" + s2.name + "\t" + s2.branch);
		

	}

}

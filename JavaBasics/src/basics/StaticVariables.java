package basics;

public class StaticVariables {
	static int a=10;
	static String b = "Hello";

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(StaticVariables.a); // Recomended to access static varibles by class name
		System.out.println(StaticVariables.b); // Recomended to access static varibles by class name
		/*StaticVariables obj = new StaticVariables();
		  System.out.println(obj.a);   Not recomended to access static variables by object creation
		  System.out.println(obj.b);   Not recomended to access static variables by object creation
		  obj.a = 200;
		  System.out.println(StaticVariables.a);      //200
		  obj.b = "world"; // Not recomended   
		  System.out.println(StaticVariables.b);  //world           */
	}

}

//Static Variables are used to represent no.of hits/likes etc
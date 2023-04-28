package basics;

public class StaticVariables_Realtime {
	static int noOfLikes = 0;
	public static void m1() {
		System.out.println("noOfLikes= " + noOfLikes );
		noOfLikes++;
	}
	public static void m2() {
		System.out.println("noOfLikes= "+ noOfLikes);
		noOfLikes++;
	}
	public static void m3() {
		System.out.println("noOfLikes= "+ noOfLikes);
		noOfLikes++;
	}


	public static void main(String[] args) {
		m1();
		m2();
		m3();
		System.out.println("noOfLikes= "+noOfLikes);
		
	}
}
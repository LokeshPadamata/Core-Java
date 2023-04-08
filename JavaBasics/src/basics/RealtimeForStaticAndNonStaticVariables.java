package basics;

public class RealtimeForStaticAndNonStaticVariables{
	  
	  static String pid = "1053G"; 
	  static String name = "Mobile";
	  static long price = 10000; 
	  String color;
	  byte rating;

	public static void main(String[] args) {
		
		System.out.println("Product id: "+ pid);
		System.out.println("Product name: "+name);
		System.out.println("Product price: "+price);
		RealtimeForStaticAndNonStaticVariables	p1= new RealtimeForStaticAndNonStaticVariables();
		p1.color = "Blue";
		p1.rating = 9;
		RealtimeForStaticAndNonStaticVariables	p2= new RealtimeForStaticAndNonStaticVariables();
		p2.color = "Black";
		p2.rating = 7;
		System.out.println("Product color product1 = "+p1.color);
		System.out.println("Product rating product1 = "+p1.rating);
		System.out.println("Product color product2 = "+p2.color);
		System.out.println("Product rating product2 = "+p2.rating);
		
	}
}
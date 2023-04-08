package basics;

public class Swapping {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int temp;
		temp =x;
		x = y;
		y = temp;
		System.out.println("Before Swapping x = " + x +"\n"+" y = " +y);
		System.out.println("After Swapping:");
		System.out.println("The value of X is = "+ x + "\n" +  "The value of Y is = " + y);
		
	}
}


package basics;

public class SwapWithoutThird {

	public static void main(String[] args) {
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=b;
		b=b+a;
		System.out.println(a);
		System.out.println(b);

	}

}

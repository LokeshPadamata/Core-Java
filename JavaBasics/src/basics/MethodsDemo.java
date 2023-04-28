package basics;

class MethodsDemo{
	static byte a=127;
	short b= 250;
	
	void nonStaticMethod() {
		System.out.println("Non static Method is executed");
		System.out.println(MethodsDemo.a);
		System.out.println(b);
		System.out.println("--------");
	}
	static void staticMethod() {
		System.out.println("Static Method is executed");
		System.out.println(a);
		System.out.println(new MethodsDemo().b);
		System.out.println("--------");
		
	}
	void secondNonStaticMethod() {
		System.out.println("Second NonStatic Method is executed");
		staticMethod();
	}
	static void secondStaticMethod() {
		System.out.println("Second Static Method executed");
		System.out.println(a);
		System.out.println(new MethodsDemo().b);
	}
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.nonStaticMethod();
		staticMethod();
		obj.secondNonStaticMethod();
		secondStaticMethod();
	}
}
package exceptionhandling;

public class ArrayIndexOutOfBoundsExceptio {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		try {
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}
		System.out.println(arr[1]+arr[0]);
		System.out.println("Exception Handled");
	}
}

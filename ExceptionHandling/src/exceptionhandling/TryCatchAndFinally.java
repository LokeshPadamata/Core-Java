package exceptionhandling;

public class TryCatchAndFinally {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(arr[0]);
		try {
			System.out.println("Opening DB");
			System.out.println(arr[4]);
			System.out.println(arr[1]); //control goes to catch after line 10 because it has error and does not comes back to line11 to execute
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
			//System.out.println(arr[7]);
		}
		finally {             //executes irrespective of errors in catch block
			System.out.println("Closing DB");
		}
		System.out.println("Done");
	}

}

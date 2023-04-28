package arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		float[] arr = {1.5f,2.5f,3.5f,4.5f,5.5f,6.5f};
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
		}
		System.out.println("The Sum is= " + sum);
	}

}

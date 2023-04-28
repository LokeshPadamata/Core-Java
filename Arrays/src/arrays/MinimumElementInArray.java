package arrays;

public class MinimumElementInArray {
	public static void main(String[] args) {
		int[] arr = {2,9,6,44,43,66,78,90,88};
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
	}
	System.out.println("\n");	
	System.out.println(arr[0]);
}
}
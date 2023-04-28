package arrays;
public class MaxElementInArray {

	public static void main(String[] args) {
		int[] arr = {22,11,54,78,96,28,6};
		int max = 0;
		for(int i : arr) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println(max);
	}

}

package arrays;

public class AvarageOfMarksUsingArray {

	public static void main(String[] args) {
		float[] arr= {55,99,75,63,69};
		float avg;
		float sum=0;
		for(float i : arr) {
			sum = sum + i;
		}
		avg = (sum/5);
		System.out.println("Avarage Marks is= "+avg);
	}

}

package arrays;

public class AddindTwoMatrix {

	public static void main(String[] args) {
		int[][] arr1= {{1,2,9},{3,4,8}};
		int[][] arr2 = {{5,6,7},{7,8,6}};
		int[][] arr3 = {{0,0,},{0,0,}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				for(int k=0;k<arr1.length;k++)
					arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println(" ");
		}
		

	}

}

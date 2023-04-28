package arrays;

class RemoveDuplicates {
		public static void main (String[] args)
		{
			int arr[] = {1, 2,1, 2,3,3, 3, 4,6,4, 4, 5, 5};
			int n = arr.length;
			int[] arr1 = new int[n];
			for (int i=0; i<arr.length; i++)
			{ 
				for (int j=0; j<arr.length; j++)
				{ 
					if(arr[i]==arr1[j]) {
						continue;
					}
					arr1[i] = arr[i];		
			}
			}
			for (int i=0; i<arr.length; i++)
			{ 
				System.out.println(arr1[i]);
			}
			
		}
}

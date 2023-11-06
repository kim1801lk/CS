package C20;

public class BinarySearch {

	public static void main(String[] args) {
		
		int []arr = new int [20];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.random();
		}
	
		
		BinarySearch obj = new BinarySearch();

		obj.BinarySort(15, arr);
		
	}
	
	private void BinarySort(int key, int []arr) {
		
		int [] arr1 = new int [10];
		if (arr[9] < key) {
			
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = arr[i];
			
			}
		
		
		}
		
		else 
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = arr[i];
			}
		
		int [] arr2 = new int [3];
		if (arr1[1] > key) {
			for (int i = 0; i < arr2.length; i++) {
				arr2 [i] = arr1[i];
			}
		}
		else 
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr1[i];
			}
		
		for (int i = 0; i < arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}

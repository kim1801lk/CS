package C20;

public class LinearSearch {

	public static void main(String[] args) {
		
		int [] arr = new int [15];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.random();
		}
		
		LinearSearch obj = new LinearSearch();
		obj.LinearSearch(70, arr);

	}

	private void LinearSearch(int key, int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] == key)
				System.out.println(i);
			else
				continue;
		}
		
		System.out.println(-1);
	}

	
}


//sort array
//sub arrays 
//compare key with last elemnt of first array 

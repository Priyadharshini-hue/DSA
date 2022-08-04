/*
Find the element that appears once in an array where every other element appears twice

Input:  ar[] = {7, 3, 5, 4, 5, 3, 4}
Output: 7 
*/

class UniqueElementinArray{
	
	static int find(int[] arr, int n){
		int xorSum = arr[0];
		
		for(int i = 1; i < n; i++){
			xorSum = xorSum ^ arr[i];
		}
		return xorSum;
	}

	public static void main(String[] args){
		int[] arr = {7, 3, 5, 4, 5, 3, 4};
		
		System.out.println(find(arr, arr.length));
	}
}
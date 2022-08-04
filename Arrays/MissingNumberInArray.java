/*
Missing number in array
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 7
Output: 5
*/

class MissingNumberInArray{
	
	static int find(int[] arr, int n){
		int sum = ((n+1)*(n+2))/2;
		
		for(int i = 0; i < n; i++){
			sum -=arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		int[] arr = {1, 2, 4, 6, 3, 7, 5};
		
		System.out.println(find(arr, arr.length));
	}
}
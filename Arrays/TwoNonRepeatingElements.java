/*
Find the two non repeating elements in a given array of range 1 to n.
Input:
arr = [4, 2, 4, 5, 2, 3, 1, 1] 
n = 5
Output:
4 2
*/
class TwoNonRepeatingElements{
	
	static void find(int[] arr, int n){
		int xor = 0;
		
		for(int i = 0; i < arr.length; i++){
			xor = xor ^ arr[i];
		}
		
		int rightMostBit = xor & ~(xor-1);
		int x = 0, y = 0;
		
		for(int i = 0; i < n; i++){
			if((rightMostBit & arr[i]) != 0){
				x = x ^ arr[i];
			}else{
				y = y ^ arr[i];
			}
		}
		
		System.out.println(x + " " + y);
	}

	public static void main(String[] args){
		int[] arr = { 4, 2, 4, 5, 2, 3, 1, 1};
		
		find(arr, arr.length);
	}
}
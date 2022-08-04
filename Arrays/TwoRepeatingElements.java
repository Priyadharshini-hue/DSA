/*
Find the two repeating elements in a given array of range 1 to n.
Input:
arr = [4, 2, 4, 5, 2, 3, 1] 
n = 5
Output:
4 2
Explanation:
The above array has n + 2 = 7 elements with all elements occurring once except 2 and 4 which occur twice. So the output should be 4 2.
*/

class TwoRepeatingElements{
	
	static void find(int[] arr, int n){
		
		int xor = arr[0];
		int actualSize = n - 2;
		
		for(int i = 1; i < n; i++){
			xor = xor ^ arr[i];
		}
				
		for(int i = 1; i <= actualSize; i++){
			xor = xor ^ i;
		}
		
		int rightMostBit = xor & ~(xor-1);
		
		//System.out.println(rightMostBit);
		
		int x = 0, y = 0;
		
		for(int i = 0; i < n; i++){
			if((rightMostBit & arr[i] )!= 0){
				x = x ^ arr[i];
			}else{
				y = y ^ arr[i];
			}
		}
		for(int i = 1; i <= actualSize; i++){
			if((rightMostBit & i) != 0){
				x = x ^ i;
			}else{
				y = y ^ i;
			}
		}
		
		System.out.println(x + " " + y);
	}

	public static void main(String[] args){
		int[] arr = {1, 2, 2, 3, 4, 4, 5}; // 1 2 3 4 5 (n = 7 - 2 = 5)
		
		find(arr, arr.length);
	}
}
/*
Multiply left and right array sum.
Pitsy needs help with the given task by her teacher. 
The task is to divide an array into two sub-array (left and right) containing n/2 elements each and do the sum of the subarrays
and then multiply both the subarrays.

Note: If the length of the array is odd then the right half will contain one element more than the left half.

Example 1:

Input : arr[ ] = {1, 2, 3, 4}
Output : 21
Explanation:
Sum up an array from index 0 to 1 = 3
Sum up an array from index 2 to 3 = 7
Their multiplication is 21.

Example 2:

Input : arr[ ] = {1, 2} 
Output :  2 
 

Your Task:
This is a function problem. The input is already taken care of by the driver code. 
You only need to complete the function multiply() that takes an array (arr), sizeOfArray (n), and
return the sum of the subarrays and then multiply both the subarrays. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
class MultiplySum{
	
	static int multiply(int[] arr, int length){
		
		int start = 0, end = length-1, sumLeft = 0, sumRight = 0, mid =(start+end)/2;
	
		// while loop to iterate b/w start and end
		while(start < end){
			sumLeft += arr[start];
			sumRight +=arr[end];
			start++;
			end--;
		}
		// return l*r if length is even, else add the remaining element to right and then add
		return length % 2 == 0 ? (sumLeft)*sumRight : (arr[start] + sumRight)*sumLeft ;
	}

	public static void main(String[] args){
		int arr[] = {1, 2, 3};
		
		System.out.println(multiply(arr, arr.length));
	}
}
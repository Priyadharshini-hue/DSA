/*
A peak element is an element that is strictly greater than its neighbors.
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Can return either index number 1 where the peak element is 2, 
or index number 5 where the peak element is 6.
 */
class FindPeakElement {

    static int findElement(int[] arr) {
        
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if the mid is greater than next element, then ignore right half
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            // If the mid is less than next element, then ignore left half
            else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println(findElement(arr));
    }
}
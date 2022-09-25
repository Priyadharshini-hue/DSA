/*
Binary Search - O(log n) & O(n)
 */
class BinarySearchRecursiveApproach {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int elementToFind = 5;
        System.out.println(search(arr, 0, arr.length-1,elementToFind));
    }

    static int search(int[] arr, int start, int end, int elementToFind) {
        int mid = start +(end-start)/2;
        if(arr[mid] == elementToFind){
            return mid;
        }else if(arr[mid] < elementToFind){
            search(arr, mid+1, end, elementToFind);
        }else{
            search(arr, start, mid-1, elementToFind);
        }
        return -1;
    }
}

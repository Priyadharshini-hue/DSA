public class CountNegativeNumbers {
     static  int count(int[]arr, int length){
          int count=0,start=0,end=arr.length-1,mid;

         // exceptional cases
         if(arr[start]>=0){
             return 0;
         }
         if(arr[end]<0){
             return arr.length;
         }

          while (start<=end){
              mid=start+((end-start)/2);
              if(arr[mid]>0){
                  end=mid-1;
              }else{
                  count=mid;
                  start=mid+1;
              }
          }
          return count+1;
      }

    //decreasing order
   /* static int count(int[] arr, int length) {
        int count = 0, start = 0, end = arr.length - 1, mid;

        // exceptional cases
        if(arr[start]<0){
            return arr.length;
        }
        if(arr[end]>=0){
            return 0;
        }

        while (start <= end) {
            mid = start + ((end - start) / 2);
            if (arr[mid] >= 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
                count = mid;
            }
        }
        return arr.length - count;
    }*/

    public static void main(String[] args) {
        int[] arr={-9,-5,-2,1,2,3,4,5,6,7,8,9};

        // decreasing order
//        int[] arr = {4,3,2,1,0,-1};

        System.out.println(count(arr, arr.length - 1));
    }
}

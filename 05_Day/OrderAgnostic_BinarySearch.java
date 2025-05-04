public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {
        // int[] nums = {-1,0,12,23,34,55,68,78,99};
        int[] nums = {90,88,76,65,44,36,28,11,1,-2};
        int target = 90;

        int result = orderAgnostic_bs(nums, target);
        System.out.println(result);
    }

    public static int orderAgnostic_bs(int[] arr, int target) {
      int start = 0;
      int end = arr.length-1;
      
      boolean isAscending;
      if(arr[start] < arr[end]) {
          isAscending = true;
      } else {
          isAscending = false;
      }

      while (start <= end) {
          int mid = start+(end-start)/2;

          if (target == arr[mid]) {
              return mid;
          }

          if (isAscending) {
              if(target < arr[mid]) {
                end = mid-1;
              } else {
                start = mid+1;
              } 
          } else {
              if(target > arr[mid]) {
                end = mid-1;
              } else {
                start = mid+1;
              } 
          }
      }

      // target not found.
      return -1;
    }
}

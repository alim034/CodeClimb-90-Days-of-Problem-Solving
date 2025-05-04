public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,12,23,34,55,68,78,99};
        int target = 68;

        int result = binary_search(nums, target);
        System.out.println(result);
    }

    // write index of the target.
    // if target is not found then return -1.
    public static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //int mid = (start+end)/2;  // It might be possible , if we take lagre value of start and end , then its not wrok.
        

        while (start <= end) {
            int mid = start+(end-start)/2;

            if(target < arr[mid]) {
                end = mid-1;
            } else if(target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }

        // target not found.
        return -1;
    }
}

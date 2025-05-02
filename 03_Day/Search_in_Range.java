public class Search_in_Range {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67,78,89,90};
        int start = 2;
        int end = 7;
        int target = 56;

        System.out.println(search_in_range(arr, start, end, target));
    }

    // FUNCTION for searching the element or target in range.
    public static int search_in_range(int[] arr, int start, int end, int target){
      // if array is empty then return -1.
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i<= end; i++){
            if(arr[i] == target){
                return i;
            }
        }

        // execute when the target not found at any index.
        return -1;
    }
}

public class Minimum_Element {
    public static void main(String[] args) {
      int[] arr = {12,34,66,5,-8,-5,-2};

      System.out.println("The Minimum Element in Array is: " + minimum_element(arr));
    }

    // function for finding the minimum element.
    public static int minimum_element(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                 min = arr[i];
            }
        }
        return min;
    }
}

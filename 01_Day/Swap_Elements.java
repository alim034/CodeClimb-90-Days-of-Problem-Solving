import java.util.Scanner;
import java.util.Arrays;

public class Swap_Elements {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] arr = new int[6];
      System.out.print("Enter Array Elements: ");
      for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();
      }

      // Array Before Swaping the Elements
      System.out.println("Array Before Swaping: "+Arrays.toString(arr));

      swap_elements(arr, 0, 5);
      // Array Before Swaping the Elements
      System.out.println("Array After Swaping: " +Arrays.toString(arr));

      sc.close();
    }

    // Function for Swaping the Array Elements.
    public static void swap_elements(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
 

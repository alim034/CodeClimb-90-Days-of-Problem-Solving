import java.util.Scanner;
import java.util.Arrays;

public class Lagest_Element_InRange {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] arr = new int[10];
      System.out.println("Enter Array Elements: ");
      for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("Array is: " + Arrays.toString(arr));

      System.out.println("Largest In Range: " + largest_element_inrange(arr, 3, 8));

    }

    public static int largest_element_inrange(int[] arr, int start, int end){
      int max = arr[start];
      for(int i=start; i<=end; i++){
        if (arr[i] > max) {
          max = arr[i];
        }
      }
      return max;
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Largest_Elements {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] arr = new int[10];
      System.out.println("Enter Elements of Array: ");
      int n = arr.length;
      for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
      }

      System.out.println("Array is: " + Arrays.toString(arr));

      System.out.println("Lagest Element in Array is: " + largest_element(arr));

      sc.close();
  }

  public static int largest_element(int[] arr){
    
    int n = arr.length;
    int max = arr[0];
    for(int i=0; i<n; i++){
      if (arr[i] > max) {
          max = arr[i];
      }
    }
    return max;
  }
}

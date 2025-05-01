import java.util.Scanner;
import java.util.Arrays;


public class Reverse_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    System.out.println("Enter the Element of the Array; ");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Arrays Before Reverse: " + Arrays.toString(arr));

    // Call Reverse function 
    reverse_array(arr);
    System.out.println("Arrays After Reverse: " + Arrays.toString(arr));
  }

  // swap function..
  public static void swap(int[] arr, int start, int end){
    int tmep = arr[start];
    arr[start] = arr[end];
    arr[end] = tmep;
  }

  // function for reverse the array..
  public static void reverse_array(int[] arr){
    int start = 0;
    int end = arr.length -1;

    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }
}

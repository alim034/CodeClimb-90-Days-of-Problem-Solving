import java.util.*;

public class Linear_Search {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Input Array from user
      int[] arr = new int[10];
      System.out.print("Enter Array Elements: ");
      for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();
      }

      // Input Key to search.
      System.out.println("Enter Key For Searching: ");
      int key = sc.nextInt();

      System.out.println("The key found at index: " + linear_search(arr, key));

      sc.close();
  }

  // function for searching the element.
  public static int linear_search(int[] arr, int key) {
      for(int i=0; i<arr.length; i++){
        if(arr[i] == key){
          return i;
        }
      }

      return -1;
  }
}

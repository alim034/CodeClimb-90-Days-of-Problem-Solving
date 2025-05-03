// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Even_Digits {
  public static void main(String[] args) {
      int[] arr = {12,345,2,6,7896};
      System.out.println(findNumber(arr));
  }

  public static int findNumber(int[] arr) {
      int count = 0;
      for(int i=0; i<arr.length; i++) {
          if(even_check(arr[i])) {
              count++;
          }
      }
      return count;
  }

  // function to check whether digits of number is even or odd
  public static boolean even_check(int num) {
      int NoOfDigits = digits(num);

      if(NoOfDigits % 2 == 0) {
          return true;
      }
      return false;
  }

  // function to find out the no.of digit.
  public static int digits(int nums) {
      int count = 0;
      while(nums>0) {
        nums = nums / 10;
        count++;
      }
      return count;
  }
}

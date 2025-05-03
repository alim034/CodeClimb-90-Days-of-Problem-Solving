// https://leetcode.com/problems/richest-customer-wealth/

public class Richest_Customer_Weath {
  public static void main(String[] args) {
      int[][] arr = {
        {1,2,3},
        {3,2,1},
        {12,3}
        
      };
      System.out.println(sum(arr));
  }

  public static int sum(int[][] nums) {
      int max=0;
      
      for(int i=0; i<nums.length; i++) {
        int rowsum = 0;
          for(int j=0; j<nums[i].length; j++) {
              rowsum += nums[i][j];
          }

          if (rowsum > max) {
            max = rowsum;
        }
      }
      
      return max;
  }
}

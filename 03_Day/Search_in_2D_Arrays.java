import java.util.Arrays;

public class Search_in_2D_Arrays {
    public static void main(String[] args) {
        int[][] arr= {
          {12,34,45,56},
          {54,67,23,55,43,55},
          {33,88,11,2,3,5}
        };

        int target =56;
        int[] result = search_2d_array(arr, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] search_2d_array(int[][] arr, int target){
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

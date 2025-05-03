public class Maximum_In_2DArray {
    public static void main(String[] args){
        int[][] arr = {
          {12,34,55,66,43,56},
          {83,74,97,33,0,86,37,9},
          {65,11,2,3,4,66,86,3},
          {99,98,36,98,363}
        };

        System.out.println("Maximum Element: " + maximum_in_ed(arr));
    }

    public static int maximum_in_ed(int[][] arr){
        int max = arr[0][0];
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }
}

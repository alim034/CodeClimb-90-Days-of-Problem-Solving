public class Max_SubArray_Sum {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14};
        maxSubArraySum(nums);
    }

    public static void maxSubArraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                currSum = 0; 
                for(int k=start; k<=end; k++) {
                    currSum += arr[k];
                }
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("The Max SubArray is: " + maxSum);
    }
}

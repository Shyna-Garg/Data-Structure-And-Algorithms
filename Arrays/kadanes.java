public class kadanes {
    
   

    public static int kadanesAlgo(int nums[]) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2, -3, -7, -2, -10, -4};
        System.out.println(kadanesAlgo(nums));  
    }
}

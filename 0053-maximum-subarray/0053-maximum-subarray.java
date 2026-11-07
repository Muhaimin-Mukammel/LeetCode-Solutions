class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1 ; i < nums.length; i++){
            if(currSum + nums[i] < nums[i]) currSum = nums[i];
            else currSum = currSum + nums[i];
            if(currSum > maxSum) maxSum = currSum;
        }

        return maxSum;
    }
}
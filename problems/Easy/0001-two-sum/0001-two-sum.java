class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lp = 0;
        int rp = 1;
        int[] result = new int[2];

        while(lp < nums.length){
            if(nums[lp] + nums[rp] == target){
                result[0] = lp;
                result[1] = rp;
                break;
            }

            if(rp == nums.length - 1){
                lp++;
                rp = lp + 1;
            } else {rp++;}
        }

        return result;
    }
}
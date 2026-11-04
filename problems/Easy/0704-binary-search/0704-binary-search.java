class Solution {
    public int search(int[] nums, int target) {
        boolean found = false;
        int l = 0;
        int r = nums.length;
        int found_index = 0;



        while ( r - l > 0){
            int m = (l + r) / 2;

            if(nums[m] == target){
                found = true;
                return m;
            }
            else if( nums[m] < target ){
                l = m + 1;
            } else {
                r = m;
            }
        }

        return -1;
    }
}
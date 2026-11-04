class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lp = 0;
        int rp = 1;

        ArrayList<Integer> arr = new ArrayList<>();

        while (rp < nums.length){
            if(nums[lp] + nums[rp] == target){
                arr.add(lp);
                arr.add(rp);
                break;
            }
            if(rp == nums.length - 1){
                lp += 1;
                rp = lp + 1;
            } else {rp += 1;}
        }

        int[] ans = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }
}
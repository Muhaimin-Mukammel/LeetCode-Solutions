class Solution {
    public int maxSum(int[] nums) {

        int n = nums.length;
        int[] pos = new int[n];
        int i = 0;
        for(int num : nums){
            if(n > 0 && num >= 0){
                pos[i] = num;
                i++;
                n--;
            }else {
            n--;
            }
        }

        if(i == 0){
            int max = nums[0];
            for(int j = 0; j < nums.length; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            return max;
        }

        Set<Integer> set = new HashSet<>();
        for(int num : pos){
            set.add(num);
        }

        int ans = 0;
        for(int num : set){
            ans += num;
        }

        return ans;


    }
}
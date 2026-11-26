class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        
        int degree = 0;
        int minLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            firstIndex.putIfAbsent(num, i);
            
            // Update frequency
            int currCount = count.getOrDefault(num, 0) + 1;
            count.put(num, currCount);
            
            // If we found a new highest frequency, update degree and minLength
            if (currCount > degree) {
                degree = currCount;
                minLength = i - firstIndex.get(num) + 1;
            } 
            // If this number ties the highest frequency, take the shorter span
            else if (currCount == degree) {
                minLength = Math.min(minLength, i - firstIndex.get(num) + 1);
            }
        }

        return minLength;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            int curr = frequency.getOrDefault(num, 0);
            frequency.put(num, curr + 1);
        }

        int leastFrequentNum = -1;
        int minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() < minFreq) {
                minFreq = entry.getValue();
                leastFrequentNum = entry.getKey();
            }
        }

        return leastFrequentNum;
    }
}
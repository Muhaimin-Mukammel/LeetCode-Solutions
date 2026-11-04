class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> pocket = new HashMap<>();
        Map<Character, Integer> tempo = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        pocket.putAll(tempo);

        char[] arr = s.toCharArray();

        int ans = 0;

        for ( int i = 0; i < arr.length; i++){
            int currVal = pocket.get(arr[i]);
            if(i + 1 < arr.length && currVal < pocket.get(arr[i + 1])){
                ans -= currVal;
            } else {
                ans += currVal;
            }
        }

        return ans;
    }
}
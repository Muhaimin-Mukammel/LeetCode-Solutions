class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();

        int[] freq = new int[256];

        for( int i = 0; i < s.length(); i++){
            
        }

        for(char c : arr){
            freq[c]++;
        }

        for ( int i = 0; i < arr.length; i++){
            if(freq[arr[i]] == 1){
                return i;
            }
        }

        return -1;

    }
}
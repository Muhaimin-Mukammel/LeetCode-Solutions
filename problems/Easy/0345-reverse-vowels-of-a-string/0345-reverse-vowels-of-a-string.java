class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";

        char[] arr = s.toCharArray();

        int lp = 0;
        int rp = s.length() - 1;

        while ( lp < rp ) {
            while (lp < rp && vowels.indexOf(arr[lp]) == -1) { lp++; }
            while (lp < rp && vowels.indexOf(arr[rp]) == -1) { rp--; }

            char temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = temp;

            lp++;
            rp--;
        }
        return new String(arr);
     }
}
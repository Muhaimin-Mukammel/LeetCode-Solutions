class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String p1 = strs[0];
        String p2 = strs[strs.length - 1];

        for(int i = 0; i < Math.min(p1.length(), p2.length()); i++){
            if(p1.charAt(i) != p2.charAt(i)) return sb.toString();

            sb.append(p1.charAt(i));
        }

        return sb.toString();
    }
}
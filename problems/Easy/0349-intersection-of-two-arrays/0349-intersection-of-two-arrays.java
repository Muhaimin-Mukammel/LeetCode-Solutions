class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();

        for(int num : num1){
            set.add(num);
        }

        for(int num : num2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
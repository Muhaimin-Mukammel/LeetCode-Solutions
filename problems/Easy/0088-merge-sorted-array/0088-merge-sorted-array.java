class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[n + m];

        int i = 0;
        for(int num : nums1){
            if(num != 0){
                array[i++] = num;
            }
        }

        for(int num : nums2){
            if(num != 0){
                array[i++] = num;
            }
        }

        Arrays.sort(array);

        int j = 0;
        for(int num : array){
            nums1[j++] = num;
        }
    }
}
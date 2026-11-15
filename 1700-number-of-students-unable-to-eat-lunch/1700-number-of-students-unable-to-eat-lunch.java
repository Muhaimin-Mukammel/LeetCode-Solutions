class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for(int st : students) count[st]++;

        int r = sandwiches.length;
        for(int sw : sandwiches){
            if(count[sw] == 0){
                break;
            }
            if(r-- == 0){
                break;
            }

            count[sw]--;
        }

        return r;
    }
}
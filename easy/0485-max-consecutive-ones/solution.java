class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        for (int i=1;i<nums.length;i++){
            if (nums[i-1]==nums[i]){
                count++;
            }
        }
        return count;
            else{
                count = 0;
            }
    }
}

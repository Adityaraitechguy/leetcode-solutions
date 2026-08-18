class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        for (int i=1;i<nums.length;i++){
            if (nums[i-1]==nums[i]){
                count++;
            }
        }
        return maxi;
        int maxi =0;
        Math.max(maxi, count);
            else{
                count =0;
            }
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
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

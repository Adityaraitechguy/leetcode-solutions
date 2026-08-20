class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i =1;i<n;i++){
            if (nums[i]==target){
                return i;
            }
        }
        
        
        return 1;
            else if (target>nums[i-1]&&target<nums[i]){
                return i;
            }
    }
}

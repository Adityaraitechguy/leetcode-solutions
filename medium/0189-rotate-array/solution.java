        int n=nums.length;
    public void rotate(int[] nums, int k) {
class Solution {
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    
              
    }
    private void reverse(int nums[],int left,int right){
        while(right>left){
            int temp= nums[left];
            nums[left] = nums[right];
            nums[right]= temp;
            left++;
            right--; 
        }
    }


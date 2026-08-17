        int n = nums.length;
        k %= n; // handle k > n
        
        reverse(nums, 0, n - 1);   // reverse whole array
        reverse(nums, 0, k - 1);   // reverse first k elements
        reverse(nums, k, n - 1);   // reverse the rest
    }
    
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}

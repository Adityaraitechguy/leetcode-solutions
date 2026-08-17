import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : nums) deque.add(num);
        
        for (int i = 0; i < k; i++) {
            deque.addFirst(deque.removeLast());
        }
        
        int idx = 0;
        for (int num : deque) {
            nums[idx++] = num;
        }
    }
}
# Rotate Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-17T16:46:36.759Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-array/)
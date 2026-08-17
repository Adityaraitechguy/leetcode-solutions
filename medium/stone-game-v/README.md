# Stone Game V

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:07:12.669Z  

```unknown
1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        for (int i =0; i<n;i++){
6            if(nums[i]>nums[(i+1)%n]){
7                count++;
8
9            }
10        }
11        if (count>1){
12            return false;
13        }
14        return true;
15    }
16}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-v/)
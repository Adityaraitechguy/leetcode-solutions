# Nearest Available Drone

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:09:03.005Z  

```unknown
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int ans = -1;
4        int min = Integer.MAX_VALUE;
5
6        for (int i = 0; i < drones.length; i++) {
7            int distance = Math.abs(drones[i][0] - target[0])
8                         + Math.abs(drones[i][1] - target[1]);
9
10            if (distance <= drones[i][2] && distance < min) {
11                min = distance;
12                ans = i;
13            }
14        }
15
16        return ans;
17    }
18}
```

---

[View on LeetCode](https://leetcode.com/problems/nearest-available-drone/)
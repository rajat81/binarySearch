package com.google.rajatswnt;

import java.util.*;
import java.util.stream.Collectors;

public class Problem {
    // declare the variables required here

    // functions
    public int solve(int[] nums, int k) {
        Arrays.sort(nums);
        return findMinDiff(nums, k, 0, nums.length-1);
    }

    // send sorted array
    public int findMinDiff(int[] nums, int k, int low, int high) {
        if(k == 0) return nums[high] - nums[low];
        return Integer.min(findMinDiff(nums, k-1, low+1, high), findMinDiff(nums, k-1, low, high-1));
    }

}

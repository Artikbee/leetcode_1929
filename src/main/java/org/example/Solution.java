package org.example;

import java.util.Arrays;

import static java.lang.System.*;

public class Solution {
    public int[] getConcatenation(int[] nums) {

        int count = 0;
        int[] nums1 = Arrays.copyOf(nums, nums.length * 2);
        for (int i = nums.length; i < nums1.length; i++) {
            nums1[i] = nums[count++];
        }

        return nums1;
    }
}

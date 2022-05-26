package com.company;

import java.util.Arrays;

public class missingNumber {
    public int missingNum(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if (count != nums[i]) {
                return count;

            }
            count++;
        }
        return count;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisapperedNum {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disNums = new ArrayList<Integer>();
        int[] normlist = new int[nums.length];
        Arrays.sort(nums);
        int count = 1;
        ArrayList<Integer> norm = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!norm.contains(nums[i])) {
                norm.add(nums[i]);
                normlist[i] = nums[i];
            }else{
                normlist[i] = 0;
            }
        }
        norm.clear();
        for(int i = 0; i < normlist.length; i++) {
            norm.add(normlist[i]);
        }

        for(int i = 0; i < norm.size(); i++) {
                if (!norm.contains(count)) {
                    disNums.add(count);
                }
                count++;
        }
        return disNums;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}

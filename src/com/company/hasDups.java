package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class hasDups {
    public static boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> counts = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(counts.containsKey(nums[i])){
                counts.put(nums[i],counts.get(nums[i]) + 1);
            }else{
                counts.put(nums[i],1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(counts.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}

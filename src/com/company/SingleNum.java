package com.company;

import java.util.HashMap;

public class SingleNum {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> counts = new HashMap<Integer,Integer>();
        int single = 0;
        for (int i = 0; i < nums.length; i++){
            if(counts.containsKey(nums[i])){
                counts.put(nums[i],counts.get(nums[i]) + 1);
            }else{
                counts.put(nums[i],1);
            }
        }
        for(Integer key : counts.keySet()) {
            if (counts.get(key) == 1) {
                single = key;
            }
        }
        return single;
    }
    public static void main(String[] args){
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}

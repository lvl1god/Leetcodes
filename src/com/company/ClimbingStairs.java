package com.company;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int prev =1,prev2=1;
         for(int i = 2; i <= n;i++){
             int curr = prev + prev2;
             prev2 = prev;
             prev = curr;
         }
         return prev;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(climbStairs(n));
    }
}

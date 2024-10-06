package com.pluralsight;

public class Dice {
    public int roll() {
        //int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //System.out.println(nums[nums.length -1]);
        return (int)(Math.random() * 6) + 1;
    }
}

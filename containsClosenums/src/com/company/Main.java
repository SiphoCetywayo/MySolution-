package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = new int[]{0,1,2,3,5,2};
        int k = 3;
        containsCloseNums(nums,k);

    }

    private static void containsCloseNums(int[] nums, int k) {

        boolean test = false;
        int i;
        for(i =0; i<nums.length; i++){
            if(nums[i] == k){
                test = true;

                k = 2;
              int num =  nums[i] = Math.abs(nums[i]);
                if(num == k)
                    test = false;
                break;
            }
        }
        System.out.println("containsCloseNums(nums, k): " + test);
        System.out.print("containsCloseNumsAbsolute(nums, k)" + test);
    }
}

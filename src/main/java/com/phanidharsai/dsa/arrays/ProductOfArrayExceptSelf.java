package com.phanidharsai.dsa.arrays;

import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public static int[] productExceptSelfBruteForce(int[] nums) {
        int[] res = new int[nums.length];
        int newIndex=0;
        int product=1;
        int i=0;
        while(i!=nums.length){
            product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product*=nums[j];
                }
            }
            res[newIndex++]=product;
            i++;
        }
        return res;
    }
    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[numsLength];
        for(int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelfBruteForce(nums)));

    }
}
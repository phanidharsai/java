package com.phanidharsai.dsa.binarySearchAlgoProblems;

public class MinimalSubArrayOfLargestSumInMSubArrays {
    public static int getLargestSum(int[] nums, int m){
        int start =0;
        int end =0;
        for(int num:nums){
            start= Math.max(start,num);
            end = end+num;
        }
        while(start<end){
            int mid= start+(end-start)/2;
            int pieces =1;
            int sum=0;
                for (int i = 0; i < nums.length; i++) {
                    sum = sum + nums[i];
                    if(sum>mid){
                        sum=nums[i];
                        pieces+=1;
                    }
                }
            if(pieces<=m){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int[] nums ={7,2,5,8,10};
        int m =2; //number of subarrays
        int largest = getLargestSum(nums,m);
        System.out.println(largest);
    }
}

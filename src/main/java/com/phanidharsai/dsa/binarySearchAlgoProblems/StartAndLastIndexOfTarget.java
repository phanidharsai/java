package com.phanidharsai.dsa.binarySearchAlgoProblems;

import java.util.ArrayList;
import java.util.List;

public class StartAndLastIndexOfTarget {
    private static int[] getIndexes(int[] nums, int target) {
        int[] res = {-1,-1};
        int start = 0;
        int end = nums.length-1;
        int startIndex =-1;
        int endIndex =-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid]==target){



            }
            if(nums[mid]<target){
                start=mid+1;

            }
            else if(nums[mid]>target){
                end = mid-1;

            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums ={5,7,7,8,8,10};
        int target =8;
        int[] res = getIndexes(nums,target);
        System.out.println(res);
    }



}

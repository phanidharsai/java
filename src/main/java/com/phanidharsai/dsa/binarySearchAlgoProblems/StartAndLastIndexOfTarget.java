package com.phanidharsai.dsa.binarySearchAlgoProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartAndLastIndexOfTarget {

    private static int[] getIndexes(int[] nums, int target){
        int[] res = new int[2];
        res[0] = searchIndex(nums, target, true);
        int endIndex = searchIndex(nums, target, false);
        if(res[0]!=-1) {
            res[1] = endIndex;
        }
        return res;
    }
    private static int searchIndex(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = 0;
        while (start <= end) {
           int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;

            } else {
                ans=mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid +1;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums ={5,7,7,7,8,8,10};
        int target =8;
        int[] res = getIndexes(nums,target);
        System.out.println(Arrays.toString(res));
    }



}

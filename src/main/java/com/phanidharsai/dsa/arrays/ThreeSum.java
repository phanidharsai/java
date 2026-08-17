// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

package com.phanidharsai.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> getListBruteForce(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<len-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j= i+1;j<len-1;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                for(int k=j+1;k<len;k++){
                    if(k>j+1 && nums[k]==nums[k-1]){
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[k]==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = ThreeSum.getListBruteForce(nums);
        System.out.println("Phani "+res);
    }
    
}

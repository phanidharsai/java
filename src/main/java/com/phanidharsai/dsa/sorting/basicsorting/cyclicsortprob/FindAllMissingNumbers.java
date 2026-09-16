//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

package com.phanidharsai.dsa.sorting.basicsorting.cyclicsortprob;

import java.util.ArrayList;
import java.util.List;

import static com.phanidharsai.dsa.sorting.basicsorting.BubbleSort.swap;

public class FindAllMissingNumbers {
    static List<Integer> findAll(int[] arr){
        List<Integer> res = new ArrayList<>();
        int i =0;
        while(i<arr.length){
            while(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                res.add(j+1);
            }
        }
        return res;
    }
    public static void main(String[] args){
         int[] arr={4,3,2,7,8,2,3,1};
         List<Integer> res = findAll(arr);
         System.out.println(res.toString());
    }
}

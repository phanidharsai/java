//https://leetcode.com/problems/first-missing-positive/description/

package com.phanidharsai.dsa.sorting.basicsorting.cyclicsortprob;

import static com.phanidharsai.dsa.sorting.basicsorting.BubbleSort.swap;

public class FindMissingNumber {
    static int findNumber(int[] arr){
        int len = arr.length;
        int res=0;
        for(int i=0;i<arr.length;i++){
                while( arr[i]<len &&  arr[i]!=arr[arr[i]] ){
                    swap(arr,i,arr[i]);
                }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr ={4,0,2,1};
        int num = findNumber(arr);
        System.out.println(num);
    }
}

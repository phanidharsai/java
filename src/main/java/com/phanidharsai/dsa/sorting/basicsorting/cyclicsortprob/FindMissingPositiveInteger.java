package com.phanidharsai.dsa.sorting.basicsorting.cyclicsortprob;

import static com.phanidharsai.dsa.sorting.basicsorting.BubbleSort.swap;

public class FindMissingPositiveInteger {
    static int findMissingPositiveInteger(int[] arr){
        int len = arr.length;
        int i=0;
        while(i<len){
            if(arr[i]>0 && arr[i]<=len && arr[i]!=arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<len;j++){
            if( arr[j]!=j+1){
                return j+1;
            }
        }
        return len+1;
    }

    public static void main(String[] args){
        int[] arr = {4,1,2,3};
        int res= findMissingPositiveInteger(arr);
        System.out.println(res);
    }
}

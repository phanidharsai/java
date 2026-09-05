package com.phanidharsai.dsa.sorting.basicsorting;

import java.util.Arrays;

import static com.phanidharsai.dsa.sorting.basicsorting.BubbleSort.swap;

public class NoAlgoSort {
    public static void BruteForceSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    swap(arr, i,j);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr= {3,10,1,16,4,8,2,21};
        BruteForceSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

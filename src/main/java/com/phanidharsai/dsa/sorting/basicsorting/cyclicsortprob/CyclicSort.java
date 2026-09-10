package com.phanidharsai.dsa.sorting.basicsorting.cyclicsortprob;

import java.util.Arrays;

import static com.phanidharsai.dsa.sorting.basicsorting.BubbleSort.swap;


public class CyclicSort {
    static void doCyclicSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                swap(arr,i,arr[i]-1);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {5,3,2,1,4,7,6};
        doCyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

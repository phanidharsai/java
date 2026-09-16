package com.phanidharsai.dsa.sorting.basicsorting.cyclicsortprob;

import java.util.Arrays;

import static com.phanidharsai.dsa.sorting.basicsorting.BubbleSort.swap;


public class CyclicSort {
    // does not work for duplicate numbers
    static void doCyclicSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                swap(arr,i,arr[i]-1);
            }
        }
    }
    static void doCyclicSortWithDup(int[] arr) {
        int i=0;
        while (i < arr.length) {
            while (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            }
            i++;
        }
    }

    public static void main(String[] args){
        int[] arr = {5,3,2,1,4,7,6};
        int[] arr2={4,3,2,7,8,2,3,1};
        doCyclicSort(arr);
        doCyclicSortWithDup(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}

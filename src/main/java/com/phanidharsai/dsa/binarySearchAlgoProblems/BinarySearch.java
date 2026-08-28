package com.phanidharsai.dsa.binarySearchAlgoProblems;

public class BinarySearch {
    public static int doBinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7};
        int target =7;
        int index = doBinarySearch(arr,target,0,arr.length-1);
        System.out.println(index);
    }
}

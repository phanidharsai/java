package com.phanidharsai.dsa.binarySearchAlgoProblems;



public class BinarySearchInRotatedArray {
    public static int getPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1] && arr[start]<arr[mid+1]) {
                    start = mid + 1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    public static int getPivotApproach2(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int getIndexFromRotatedArray(int[] arr, int target){
//        int pivot = getPivot(arr);
        int pivot = getPivotApproach2(arr);
        if(pivot==arr.length-1){
            return BinarySearch.doBinarySearch(arr,target,0,arr.length-1);
        }
        else if(target<arr[0]){
            return BinarySearch.doBinarySearch(arr,target,pivot+1, arr.length-1);
        }
        else{
            return BinarySearch.doBinarySearch(arr,target,0,pivot);
        }
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,9,0,1,2};
        int target = 9;
        int index = getIndexFromRotatedArray(arr,target);
        System.out.println(index);
    }
}

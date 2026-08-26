package com.phanidharsai.dsa.binarySearchAlgoProblems;

public class OrderAgnosticBinarySearch {
    public static int getIndexFromOrderAgnosticBinarySearch(int[] arr, int start, int end, int target){
        boolean isAsc = false;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            }
            else{
                if (arr[mid] < target){
                    end = mid - 1;
                }
                else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

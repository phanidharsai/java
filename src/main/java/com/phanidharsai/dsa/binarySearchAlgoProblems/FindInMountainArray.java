package com.phanidharsai.dsa.binarySearchAlgoProblems;

public class FindInMountainArray {
    private static int findIndex(int[] arr, int target) {
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        int ascStart = 0;
        int ascEnd= start;
        int descStart = start+1;
        int descEnd=arr.length-1;
        int index = OrderAgnosticBinarySearch.getIndexFromOrderAgnosticBinarySearch(arr, ascStart, ascEnd, target);
        if(index==-1){
        return OrderAgnosticBinarySearch.getIndexFromOrderAgnosticBinarySearch(arr, descStart, descEnd, target);
        }
        return index;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int index = findIndex(arr, 2);
        System.out.println(index);
    }


}

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/2119377137/

package com.phanidharsai.dsa.binarySearchAlgoProblems;


class peakIndexInMountainArray {
    public static int getIndex(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            // if mid<mid+1 we are still in ascending array, start becomes mid+1, since mid is already less than mid+1 we need not consider mid and start with mid+1
            if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
            //if not, that is a possible peak element or it could be somewhere behind that element, so end =mid not mid-1
            else {
                end =mid;
            }
        }
        //here we can return either start or end because the loop breaks when start = end, and that is our answer
        return start;
    }
    public static void main(String[] args){
//        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int[] arr = {3,5,3,2,0};
        int res = getIndex(arr);

        System.out.println(res);
    }
}
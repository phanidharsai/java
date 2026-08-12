package com.phanidharsai.dsa.binarySearchAlgoProblems;

public class FindCeiling {
    public static int FindCeilingNum(int[] in, int target ){
        int start = 0;
        int end = in.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target==in[mid]){
                return in[mid];
            }
            else if(target<in[mid]){
                    end=mid-1;
            }
            else if(target>in[mid]){
                start= mid+1;
            }
        }
//        to find floor of target number use this
//        if(end<in.length-1) {
//            return in[end];
//        }
        if(start<in.length-1) {
            return in[start];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr ={2,3,5,9,14,16};
        int num = 12;
        int res = FindCeilingNum(arr, num);
        System.out.println(res);
    }
}

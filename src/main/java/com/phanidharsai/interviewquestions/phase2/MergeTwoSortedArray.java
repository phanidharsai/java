package com.phanidharsai.interviewquestions.phase2;

import java.util.Arrays;

public class MergeTwoSortedArray {
    private static int[] merge(int[] arr1, int[] arr2) {
        int arr1L = arr1.length;
        int arr2L = arr2.length;
        int tL = arr1.length + arr2.length;
        int[] res = new int[tL];
        int left =0;
        int right =0;
        int index=0;
        while(left<arr1L && right <arr2L){
            if(arr1[left]<=arr2[right]){
                res[index++] = arr1[left++];
            }
            else{
                res[index++]= arr2[right++];
            }
        }
        while(left<arr1L){
            res[index++]=arr1[left++];
        }
        while(right<arr2L){
            res[index++]=arr2[right++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] res = merge(arr1, arr2);
        System.out.println(Arrays.toString(res));
        int[] res2 = new int[0];
        System.out.println(Arrays.toString(res2));
    }

}

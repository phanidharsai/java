package com.phanidharsai.dsa.binarySearchAlgoProblems;

public class BinarySearch2DArray {
    public static String getIndex(int[][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;
        int i=0;
        int j=n-1;
        int count =0;
            while(i<arr.length && j>=0){
                count++;
                if(target == arr[i][j]){
                    System.out.println(count);
                    return i +","+j;
                }
                if(target>arr[i][j]){
                    i++;
                }
                else if(target<arr[i][j]){
                    j--;
                }
        }

        return -1+"";
    }
    public static void main(String[] args){
        int[][] arr ={{10,21,32,40},{14,23,35,50},{18,30,39,60},{20,33,42,71}};
        int target = 71;
        String value = getIndex(arr, target);
        System.out.println(value);
    }
}

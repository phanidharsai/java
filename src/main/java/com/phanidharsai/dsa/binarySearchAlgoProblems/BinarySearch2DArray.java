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

        return -1+"," + -1;
    }
    public static void main(String[] args){
        int[][] arr ={{10,21,32,40},
                      {14,23,35,50},
                      {18,30,39,60},
                      {20,33,42,71}};
        // above code works for sorted matrix as well with sam e rime complexity
        int[][] arr2 ={{3,6,7,11},
                       {13,14,20,26},
                       {28,31,35,41},
                       {43,46,50,51}};
        int target = 35;
        String value = getIndex(arr2, target);
        System.out.println(value);
    }
}

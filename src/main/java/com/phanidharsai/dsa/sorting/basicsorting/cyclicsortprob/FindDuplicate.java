//https://leetcode.com/problems/find-the-duplicate-number/

package com.phanidharsai.dsa.sorting.basicsorting.cyclicsortprob;

import java.util.Arrays;

import static com.phanidharsai.dsa.sorting.basicsorting.BubbleSort.swap;

public class FindDuplicate {
    static int findDup(int[] arr) {
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] != i + 1) {
                if (arr[i] != arr[arr[i] - 1]) {
                    swap(arr, i, arr[i] - 1);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int num = findDup(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(num);
    }
}
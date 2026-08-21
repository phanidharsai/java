//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
// so the idea is to find the range in the infinite array where the element is present
package com.phanidharsai.dsa.binarySearchAlgoProblems;

public class TargetElementPositionInfiniteArray {

    private static int searchPosition(int[] infinite, int target) {
        int start = 0;
        int end = 1;
        while(infinite[end]<target){
                int newStart=end+1;
                // end = end + 2 * size of box
                end = end+ (end-start+1)*2;
                start=newStart;
        }
        while(start<=end){
            int mid = (end+start)/2;
            if(infinite[mid]<target){
                start= mid+1;
            }

            else if(infinite[mid]>target){
                end=mid-1;
            }
            else if(infinite[mid]==target){
                return  mid;
            }

        }

        return -1;

    }
    public static void main(String[] args){
        //for the time being lets consider this as infinite array and we dont know the length
        int[] infinite = {2,4,6,8,12,14,17,20,21,23,25,30,33};
        int target = 8;
        int position = searchPosition(infinite, target);
        System.out.println(position);
    }


}

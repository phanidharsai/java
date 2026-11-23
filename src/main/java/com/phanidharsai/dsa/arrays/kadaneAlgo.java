/** largest sum of a subArray in an array
 * input: 5, -5, -6, -4, 2, 7, 9, -8
 * output: 18
 * */

package com.phanidharsai.dsa.arrays;

public class kadaneAlgo {
    public static void withFunction(int[] arr){
        int cS=0;
        int mS =-9999999;
        for(int i=0;i<arr.length;i++){
            cS = Math.max(arr[i],cS+arr[i]);
            mS = Math.max(cS,mS);
        }
        System.out.println(mS);
    }
    //compares current sum with current element if current element is more replace currentsum with current element
    public static void withoutFunction(int[] arr){
        int cS=0;
        int mS=arr[0];
        for(int i=0;i<arr.length;i++){
            cS+=arr[i];
            if(arr[i]>cS){
                cS=arr[i];
            }
            if(mS<cS){
                mS=cS;
            }
        }
        System.out.println(mS);
    }
    public static void main(String... args){
        int[] in={-2,1,-3,4,-1,2,1,-5,4};
        withFunction(in);
        withoutFunction(in);

    }
}

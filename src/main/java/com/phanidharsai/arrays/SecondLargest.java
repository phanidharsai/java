package com.phanidharsai.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void findSecondLargest(Integer[] array){
        int largest=-1;
        int secondLargest=-1;
        for(int i=0;i<array.length;i++){
            if (array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }
            else if(array[i]< largest && array[i]>secondLargest ){
                secondLargest=array[i];
            }
        }
        System.out.println(secondLargest);
    }
    public static void main(String[] args){
        Integer[] array={10,1,5,6,4,3,13,8,21};
        Integer secondlargest= Arrays.stream(array)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow();
        System.out.println(secondlargest);
        findSecondLargest(array);

    }
}

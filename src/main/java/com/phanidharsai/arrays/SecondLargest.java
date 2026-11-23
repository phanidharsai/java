package com.phanidharsai.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void findSecondLargest(Integer[] array){
        Integer largest=null;
        Integer secondLargest=null;
        if(array.length==0){
            System.out.println("empty array");
        }
        for(Integer value:array){
            if(value==null){
                continue;
            }
            if (largest==null || value>largest){
                secondLargest=largest;
                largest=value;
            }
            else if(value< largest && (secondLargest==null || value>secondLargest) ){
                secondLargest=value;
            }
        }
        System.out.println(secondLargest);
    }
    public static void main(String[] args){
        Integer[] array={10,1,5,6,4,3,13,8,21};
//        Integer[] array={};
        Integer secondlargest= Arrays.stream(array)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow();
        System.out.println(secondlargest);
        findSecondLargest(array);

    }
}

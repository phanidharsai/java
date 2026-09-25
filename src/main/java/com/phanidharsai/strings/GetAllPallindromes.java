package com.phanidharsai.strings;

import java.util.ArrayList;
import java.util.List;

public class GetAllPallindromes {
    static List<String> getAllPallindromes(List<String> input){
        List<String> res = new ArrayList<>();
        for(String word: input){
            boolean val = checkPal(word);
            if(val){
                res.add(word);
            }
        }
        return res;
    }
    static boolean checkPal(String input){
        int len = input.length();
        String word = input.toLowerCase();
        if(len==0 ){
            return false;
        }
        else if( len ==1){
            return true;
        }
        for(int i =0; i< len/2;i++){
            if(word.charAt(i)!=word.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        List<String> input = new ArrayList<>();
        input.add("Mom");
        input.add("phaninahp");
        input.add("Race");
        System.out.println(getAllPallindromes(input));
    }
}

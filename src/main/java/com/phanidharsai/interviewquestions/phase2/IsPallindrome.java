package com.phanidharsai.interviewquestions.phase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsPallindrome {
    private static List<String> getPallsList(List<String> inputs) {
        List<String> res = new ArrayList<>();
        boolean isPal = false;
        for(String word:inputs){
            isPal = checkIsPall(word);
            if(isPal){
                res.add(word);
            }
        }
        return res;
    }

    private static boolean checkIsPall(String word) {
        String cleaned = word.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        if(cleaned.isEmpty()){
            return false;
        }
        if(cleaned.length()==1){
            return true;
        }
        int left =0;
        int right = cleaned.length()-1;
        while(left<right){
            if(cleaned.charAt(left)!=cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        List<String> inputs = Arrays.asList("racecar", "madam", "piano","A man, a plan, a canal: Panama");
        List<String> palWrds = getPallsList(inputs);
        System.out.println(palWrds);
    }
}

package com.phanidharsai.designpatterns.creational.builder.phase2;

public class Main {
    public static void main(String[] args){
        User user = new User.Builder().name("phani").age(27).build();
    }
}

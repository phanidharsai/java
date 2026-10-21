package com.phanidharsai.designpatterns.structural.composite.phase2;

public class TextFile implements FileTemplate{
    private String name;
    public TextFile(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Display() {
        System.out.println("text file displayed");
    }
}

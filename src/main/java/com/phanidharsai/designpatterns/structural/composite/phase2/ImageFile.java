package com.phanidharsai.designpatterns.structural.composite.phase2;

public class ImageFile implements FileTemplate{
    private String name;
    public ImageFile(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Display() {
        System.out.println("image displayed");
    }
}

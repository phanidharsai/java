package com.phanidharsai.designpatterns.structural.composite.phase2;

import java.util.ArrayList;
import java.util.List;

public class CompositeFile implements FileTemplate{
    private String name;
    public List<FileTemplate> files = new ArrayList<>();

    public CompositeFile(String name){
        this.name = name;
    }
    public void addFileTemplate(FileTemplate fileTemplate){
        files.add(fileTemplate);
    }
    public void removeFileTemplate(FileTemplate fileTemplate){
        files.remove(fileTemplate);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Display() {
        for(FileTemplate fileTemplate:files){
            fileTemplate.Display();
        }
    }
}

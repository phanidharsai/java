package com.phanidharsai.designpatterns.structural.composite.phase2;

public class Main {
    public static void main(String[] args){
        FileTemplate file1 = new TextFile("Text");
        FileTemplate file2 = new ImageFile("Image");
        CompositeFile firstStage = new CompositeFile("layer1");
        firstStage.addFileTemplate(file1);
        firstStage.addFileTemplate(file2);
//        firstStage.Display();
        CompositeFile secondStage = new CompositeFile("layer2");
        secondStage.addFileTemplate(firstStage);
        CompositeFile thirdStage = new CompositeFile("layer3");
        thirdStage.addFileTemplate(secondStage);
        thirdStage.Display();


    }
}

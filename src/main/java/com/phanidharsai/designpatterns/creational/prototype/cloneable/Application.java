package com.phanidharsai.designpatterns.creational.prototype.cloneable;

public class Application {
    public static void main(String[] args){
        Document original = new Document("Design Patterns", "Chapter 1...");
        original.addAuthor("Gang of Four");
        original.addMetadata("version", "1.0");

        Document copy = original.clone();
        copy.addAuthor("New Author");

        System.out.println(original);  // authors=[Gang of Four]
        System.out.println(copy);      // authors=[Gang of Four, New Author]

    }
}

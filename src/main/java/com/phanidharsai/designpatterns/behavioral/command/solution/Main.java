package com.phanidharsai.designpatterns.behavioral.command.solution;

public class Main {
    public static void main(String[] args) {
        TextDocument doc = new TextDocument();
        TextEditor editor = new TextEditor();

        editor.executeCommand(new InsertCommand(doc, 0, "Hello "));
        editor.executeCommand(new InsertCommand(doc, 6, "World!"));
        System.out.println(doc.getContent()); // "Hello World!"

        editor.undo(); // Removes "World!"
        System.out.println(doc.getContent()); // "Hello "

        editor.redo(); // Re-inserts "World!"
        System.out.println(doc.getContent()); // "Hello World!"
    }
}
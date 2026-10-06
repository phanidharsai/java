package com.phanidharsai.designpatterns.behavioral.command.solution;

public class InsertCommand implements Command {
    private final TextDocument document;
    private final int position;
    private final String text;

    public InsertCommand(TextDocument document, int position, String text) {
        this.document = document;
        this.position = position;
        this.text = text;
    }

    @Override
    public void execute() {
        document.insertText(position, text);
    }

    @Override
    public void undo() {
        document.deleteText(position, text.length());
    }

    @Override
    public String getDescription() {
        return "Insert '" + text + "' at position " + position;
    }
}
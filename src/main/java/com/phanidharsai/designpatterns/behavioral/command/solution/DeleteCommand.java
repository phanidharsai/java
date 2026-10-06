package com.phanidharsai.designpatterns.behavioral.command.solution;

public class DeleteCommand implements Command {
    private final TextDocument document;
    private final int position;
    private final int length;
    private String deletedText; // saved for undo

    public DeleteCommand(TextDocument document, int position, int length) {
        this.document = document;
        this.position = position;
        this.length = length;
    }

    @Override
    public void execute() {
        deletedText = document.getContent().substring(position, position + length);
        document.deleteText(position, length);
    }

    @Override
    public void undo() {
        document.insertText(position, deletedText);
    }

    @Override
    public String getDescription() {
        return "Delete " + length + " chars at position " + position;
    }
}
package com.phanidharsai.designpatterns.behavioral.command.solution;

import java.util.ArrayDeque;
import java.util.Deque;

//invoker
public class TextEditor {
    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();

    public void executeCommand(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear(); // Clear redo history on new action
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
            System.out.println("↩️ Undo: " + command.getDescription());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
            System.out.println("↪️ Redo: " + command.getDescription());
        }
    }
}
package com.phanidharsai.designpatterns.behavioral.command.solution;

// command interface
public interface Command {
    void execute();
    void undo();
    String getDescription();
}
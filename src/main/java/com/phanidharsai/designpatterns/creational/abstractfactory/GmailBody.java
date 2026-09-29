package com.phanidharsai.designpatterns.creational.abstractfactory;

public class GmailBody implements BodyTemplate{
    @Override
    public void createSubject() {
        System.out.println("Gmail subject");
    }

    @Override
    public void createBody() {
        System.out.println("Gmail body");
    }
}

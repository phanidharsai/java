package com.phanidharsai.designpatterns.creational.abstractfactory;

public class YahooBody implements BodyTemplate{
    @Override
    public void createSubject() {
        System.out.println("Yahoo subject");
    }

    @Override
    public void createBody() {
        System.out.println("Yahoo body");
    }
}

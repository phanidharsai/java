package com.phanidharsai.designpatterns.creational.abstractfactory;

public class YahooHeader implements HeaderTemplate{
    @Override
    public void createSenderList() {
        System.out.println("Yahoo sender list");
    }
}

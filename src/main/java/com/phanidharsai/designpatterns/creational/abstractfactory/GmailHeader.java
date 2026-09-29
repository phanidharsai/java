package com.phanidharsai.designpatterns.creational.abstractfactory;

public class GmailHeader implements HeaderTemplate{
    @Override
    public void createSenderList() {
        System.out.println("GmailSenderList");
    }
}

package com.phanidharsai.designpatterns.creational.abstractfactory;

public class GmailSignature implements SignatureTemplate{
    @Override
    public void declareSignature() {
        System.out.println("Gmail signature");
    }
}

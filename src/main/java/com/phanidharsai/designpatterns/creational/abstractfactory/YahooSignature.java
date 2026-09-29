package com.phanidharsai.designpatterns.creational.abstractfactory;

public class YahooSignature implements SignatureTemplate{

    @Override
    public void declareSignature() {
        System.out.println("Yahoo signature");

    }
}

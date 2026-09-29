package com.phanidharsai.designpatterns.creational.abstractfactory;

public class YahooFactory implements EmailFactory{
    @Override
    public HeaderTemplate createHeaderTemplate() {
        return new YahooHeader();
    }

    @Override
    public BodyTemplate createBodyTemplate() {
        return new YahooBody();
    }

    @Override
    public SignatureTemplate createSignatureTemplate() {
        return new YahooSignature();
    }
}

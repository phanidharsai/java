package com.phanidharsai.designpatterns.creational.abstractfactory;

public class GmailFactory implements EmailFactory{
    @Override
    public HeaderTemplate createHeaderTemplate() {
        return new GmailHeader();
    }

    @Override
    public BodyTemplate createBodyTemplate() {
        return new GmailBody();
    }

    @Override
    public SignatureTemplate createSignatureTemplate() {
        return new GmailSignature();
    }
}

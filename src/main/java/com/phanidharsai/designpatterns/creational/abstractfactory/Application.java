package com.phanidharsai.designpatterns.creational.abstractfactory;

public class Application {
    private final HeaderTemplate headerTemplate;
    private final BodyTemplate bodyTemplate;
    private final SignatureTemplate signatureTemplate;

    // Client works only with abstractions!
    public Application(EmailFactory factory) {
        this.headerTemplate = factory.createHeaderTemplate();
        this.bodyTemplate = factory.createBodyTemplate();
        this.signatureTemplate = factory.createSignatureTemplate();
    }

    public void renderUI() {
        headerTemplate.createSenderList();
        bodyTemplate.createSubject();
        bodyTemplate.createBody();
        signatureTemplate.declareSignature();
    }
}
package com.phanidharsai.designpatterns.creational.abstractfactory;

public interface EmailFactory {
    HeaderTemplate createHeaderTemplate();
    BodyTemplate createBodyTemplate();
    SignatureTemplate createSignatureTemplate();
}
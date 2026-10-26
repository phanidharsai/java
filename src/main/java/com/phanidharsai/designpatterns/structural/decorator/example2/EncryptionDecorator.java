package com.phanidharsai.designpatterns.structural.decorator.example2;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encrypted = encrypt(data);
        super.writeData(encrypted);
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String encrypt(String data) { return "ENC[" + data + "]"; }
    private String decrypt(String data) { return data.replace("ENC[", "").replace("]", ""); }
}
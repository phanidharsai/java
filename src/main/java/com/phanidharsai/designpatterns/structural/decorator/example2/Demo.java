package com.phanidharsai.designpatterns.structural.decorator.example2;

public class Demo {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("secrets.txt");
        source = new CompressionDecorator(source);
        source = new EncryptionDecorator(source);

        source.writeData("sensitive information");
        String info = source.readData();
        System.out.println(info);
        // Writes: ENC[ZIP[sensitive information]]
    }
}
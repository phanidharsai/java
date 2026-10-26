package com.phanidharsai.designpatterns.structural.decorator.example2;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressed = compress(data);
        super.writeData(compressed);
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) { return "ZIP[" + data + "]"; }
    private String decompress(String data) { return data.replace("ZIP[", "").replace("]", ""); }
}
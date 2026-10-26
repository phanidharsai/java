package com.phanidharsai.designpatterns.structural.decorator.example2;

public class FileDataSource implements DataSource {
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        // Write to file
        System.out.println("Writing raw data to " + filename);
    }

    @Override
    public String readData() {
        return "raw data from " + filename;
    }
}
package com.phanidharsai.designpatterns.creational.prototype.cloneable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document implements Cloneable {
    private String title;
    private String content;
    private List<String> authors;
    private Map<String, String> metadata;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
        this.authors = new ArrayList<>();
        this.metadata = new HashMap<>();
    }

    public void addAuthor(String author) { authors.add(author); }
    public void addMetadata(String key, String value) { metadata.put(key, value); }

    @Override
    public Document clone() {
        try {
            Document clone = (Document) super.clone();  // Shallow copy
            // Deep copy mutable fields
            clone.authors = new ArrayList<>(this.authors);
            clone.metadata = new HashMap<>(this.metadata);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Should not happen", e);
        }
    }

    @Override
    public String toString() {
        return "Document{title='" + title + "', authors=" + authors + "}";
    }
}

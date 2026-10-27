package com.phanidharsai.designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();
        String document = "Hello World! This is a flyweight demo. Hello again!";
        int totalChars = 0;

        for (int i = 0; i < document.length(); i++) {
            char c = document.charAt(i);
            CharacterGlyph glyph = factory.getGlyph(c, "Arial", 12, false);
            glyph.render(0, i); // row=0, col=i (extrinsic state)
            totalChars++;
        }

        factory.printStats(totalChars);
        // Unique glyph objects: ~20 (unique chars)
        // vs 51 objects without flyweight
    }
}

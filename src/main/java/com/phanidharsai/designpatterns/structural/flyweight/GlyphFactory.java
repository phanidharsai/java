package com.phanidharsai.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private final Map<String, CharacterGlyph> glyphs = new HashMap<>();
    private int creationCount = 0;

    public CharacterGlyph getGlyph(char c, String font, int size, boolean bold) {
        String key = c + "_" + font + "_" + size + "_" + bold;

        if (!glyphs.containsKey(key)) {
            glyphs.put(key, new CharacterGlyph(c, font, size, bold));
            creationCount++;
        }

        return glyphs.get(key);
    }

    public void printStats(int totalCharacters) {
        System.out.println("Total characters in document: " + totalCharacters);
        System.out.println("Unique glyph objects created: " + creationCount);
        System.out.printf("Memory saved: %.1f%%%n",
            (1.0 - (double) creationCount / totalCharacters) * 100);
    }
}
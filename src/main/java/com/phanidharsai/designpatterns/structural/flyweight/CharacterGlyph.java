package com.phanidharsai.designpatterns.structural.flyweight;

public class CharacterGlyph {
    private final char character;
    private final String font;
    private final int size;
    private final boolean bold;

    public CharacterGlyph(char character, String font, int size, boolean bold) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.bold = bold;
    }

    // Extrinsic state (row, col) passed at render time
    public void render(int row, int col) {
        System.out.printf("'%c' [%s %dpx %s] at (%d,%d)%n",
            character, font, size, bold ? "bold" : "normal", row, col);
    }

    public String getKey() {
        return character + "_" + font + "_" + size + "_" + bold;
    }
}
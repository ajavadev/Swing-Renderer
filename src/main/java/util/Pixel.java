package util;

import java.awt.Color;

public class Pixel {
    private Color pixelColor;

    // Constructors
    public Pixel(Color initialColor) {
        this.pixelColor = initialColor;
    }

    public Pixel(int r, int g, int b) {
        this(new Color(clamp(r, 0, 255), clamp(g, 0, 255), clamp(b, 0, 255)));
    }

    // Getters
    public Color getPixelColor() {
        return pixelColor;
    }

    public int getRed() {
        return pixelColor.getRed();
    }

    public int getGreen() {
        return pixelColor.getGreen();
    }

    public int getBlue() {
        return pixelColor.getBlue();
    }

    // Setters
    public void setPixelColor(Color newColor) {
        this.pixelColor = newColor;
    }

    public void setPixelColor(int r, int g, int b) {
        this.pixelColor = new Color(clamp(r, 0, 255), clamp(g, 0, 255), clamp(b, 0, 255));
    }

    // Helper method to clamp values
    private static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(value, max));
    }

    // Debug
    @Override
    public String toString() {
        return String.format("Pixel[r=%d, g=%d, b=%d, color=%s]", getRed(), getGreen(), getBlue(), pixelColor);
    }
}

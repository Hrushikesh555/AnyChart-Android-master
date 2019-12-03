package com.anychart.graphics.vector.text;

import java.util.Locale;

/**
 * Font style.
 */
public enum FontStyle {

    ITALIC("italic"),
    NORMAL("normal"),
    OBLIQUE("oblique");

    private final String value;

    FontStyle(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}
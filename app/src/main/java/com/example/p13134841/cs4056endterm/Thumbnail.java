package com.example.p13134841.cs4056endterm;
public class Thumbnail {
    private final String name;
    private final int imageResId;

    public Thumbnail(int imageResId, String name) {
        this.imageResId = imageResId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}


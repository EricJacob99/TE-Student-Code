package com.techelevator;

import static java.lang.String.valueOf;

public class RectangleWall extends Wall {

    public RectangleWall(String name, String color,int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    private int length;

    private int height;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String toString(String name, int length, int height) {
        return (name + " (" + length + "x" + height + ") rectangle");
    }

    @Override
    public int getArea() {
        return (length*height);
    }
}

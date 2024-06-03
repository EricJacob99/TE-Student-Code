package com.techelevator;

import static java.lang.String.valueOf;

public class RectangleWall extends Wall {

    private int length;
    private int height;
    public RectangleWall(String name, String color,int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public RectangleWall(String name, String color, int sideLength) {
        super(name, color);
        this.length = sideLength;
        this.height = sideLength;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return (getName() + " (" + length + "x" + height + ") rectangle");
    }

    @Override
    public int getArea() {
        return (length*height);
    }
}

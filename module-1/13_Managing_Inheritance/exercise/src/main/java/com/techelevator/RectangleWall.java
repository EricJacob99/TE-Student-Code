package com.techelevator;

public class RectangleWall {

    private int length;

    private int height;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public RectangleWall(String name, String color, int length, int height) {
    }


    public int getArea(int length, int height) {
        return length * height;
    }

    public String toString(String name, int length, int height) {
        return (name + " (" + this.length + "x" + this.height + ") rectangle");
    }
}

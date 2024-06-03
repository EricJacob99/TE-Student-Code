package com.techelevator;

public class SquareWall extends RectangleWall{

    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength);
    }

    public String toString(String name, int sideLength) {
        return (name + " (" + sideLength + "x" + sideLength + ") square");
    }
}

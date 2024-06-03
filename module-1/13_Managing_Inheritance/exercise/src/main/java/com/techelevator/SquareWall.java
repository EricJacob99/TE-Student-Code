package com.techelevator;

public class SquareWall extends Wall{

    private int sideLength;
    public SquareWall(String name, String color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return (sideLength*sideLength);
    }
}

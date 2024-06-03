package com.techelevator;

public class SquareWall extends Wall{
    public SquareWall(String name, String color, int sideLength) {
        super(name, color);

    }

    @Override
    public int getArea() {
        return 0;
    }
}

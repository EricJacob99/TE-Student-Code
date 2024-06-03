package com.techelevator;

public class TriangleWall extends Wall{
    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
    }

    @Override
    public int getArea() {
        return 0;
    }
}

package com.techelevator;

public class Elevator {

    private int currentFloor;

    private int numberOfFloors;

    private boolean isDoorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public Elevator(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
        this.currentFloor = 1;
    }

    public void openDoor() {
        isDoorOpen = true;
    }
    public void closeDoor() {
        isDoorOpen = false;
    }
    public void goUp(int desiredFloor) {
        if (!isDoorOpen && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
            currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor) {
        if (!isDoorOpen && desiredFloor > 0 && desiredFloor < currentFloor) {
            currentFloor = desiredFloor;
        }
    }
}

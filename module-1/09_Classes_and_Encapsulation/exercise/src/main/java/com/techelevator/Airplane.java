package com.techelevator;

public class Airplane {

    private String planeNumber;

    private int totalFirstClassSeats;

    private int bookedFirstClassSeats;

    private int totalCoachSeats;

    private int bookedCoachSeats;

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        int availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        int availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public boolean reserveSeats (boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass && getAvailableFirstClassSeats() >= totalNumberOfSeats) {
            bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
            return true;
        }else if (!forFirstClass && getAvailableCoachSeats() >= totalNumberOfSeats){
            bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
            return true;
        }
        return false;


    }
}

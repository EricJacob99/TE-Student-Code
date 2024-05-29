package com.techelevator.billpayment;

public class NetflixBill extends Bill {

    private int hoursWatched;

    public NetflixBill(String accountNumber, double balance, int hoursWatched) {
        super(accountNumber, balance);    // pass these values up to my parent's constructor (super is short for superclass)
        this.hoursWatched = hoursWatched;
    }



    public int getHoursWatched() {
        return hoursWatched;
    }

    public void setHoursWatched(int hoursWatched) {
        this.hoursWatched = hoursWatched;
    }
}

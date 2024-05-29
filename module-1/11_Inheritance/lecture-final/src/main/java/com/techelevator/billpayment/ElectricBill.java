package com.techelevator.billpayment;

public class ElectricBill extends Bill {

    private int wattsUsed = 0;
    private boolean isLateCharge = false;

    public ElectricBill(String accountNumber, double baseBalance, int wattsUsed, boolean isLateCharge) {
        super(accountNumber, baseBalance + (wattsUsed * 1.9999));     //calls the parent's constructor AND must be the first thing you do
        this.wattsUsed = wattsUsed;
        this.isLateCharge = isLateCharge;
    }


    public void payBill(double paymentAmount) {
        double obnoxiousLateFee = 10.00;

        if (this.isLateCharge) {
            paymentAmount = paymentAmount - obnoxiousLateFee;

        }
        super.payBill(paymentAmount);

    }

    public int getWattsUsed() {
        return wattsUsed;
    }

    public void setWattsUsed(int wattsUsed) {
        this.wattsUsed = wattsUsed;
    }
}

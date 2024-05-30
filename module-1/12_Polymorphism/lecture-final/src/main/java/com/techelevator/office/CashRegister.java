package com.techelevator.office;

public class CashRegister {

    private double balance;


    private void takeCash(double amount) {
        balance = balance + amount;
    }

    private double giveChange(double amountGiven) {
        return amountGiven - balance;
    }

    public double getBalance() {
        return balance;
    }
}

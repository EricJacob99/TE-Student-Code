package com.techelevator.billpayment;

public class Bill {

    //class aka instance aka properties aka member variables
    private String accountNumber;
    private double balance = 0;

    public Bill(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void payBill(double paymentAmount) {
        if (paymentAmount > 0) {
            balance = balance - paymentAmount;
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }

}

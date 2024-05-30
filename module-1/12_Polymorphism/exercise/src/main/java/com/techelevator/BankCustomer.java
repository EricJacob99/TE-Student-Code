package com.techelevator;

public class BankCustomer {




    public boolean isVip() {
        int totalAssets = 0;
        boolean status = false;
        if (totalAssets > 25000) {
            status = true;
        }
        return status;
    }

}

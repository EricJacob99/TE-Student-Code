package com.techelevator;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw >= 0) {
            super.withdraw(amountToWithdraw);
        } else if (getBalance() - amountToWithdraw > -100 && getBalance() - amountToWithdraw < 0) {
            super.withdraw(amountToWithdraw + 10);
        }
        return super.getBalance();
    }
}

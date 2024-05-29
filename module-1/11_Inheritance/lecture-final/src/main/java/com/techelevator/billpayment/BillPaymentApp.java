package com.techelevator.billpayment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BillPaymentApp {

    public static void main(String[] args) {

        Bill myBill = new Bill("ABC", 50.00);

        NetflixBill nfb = new NetflixBill("CCCC", 17.99, 99);
        ElectricBill eb = new ElectricBill("BBB", 100.98, 10, true);


//        Bill newNFBill = new NetflixBill("DDDD", 10.00, 10, true);
//        Bill newEBill = new ElectricBill("EEEE", 100.00, 100, false);


//        List<Bill> myBills = new ArrayList<>();
//        myBills.add(newNFBill);
//        myBills.add(newEBill);


          nfb.payBill(10.00);
          eb.payBill(100);


        BigDecimal num1 = new BigDecimal(10.00);






    }



}

package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private List<Burger> burgers = new ArrayList<>();

    private int orderId;
    private double totalOrderCost;


    public void addBurgerToOrder(Burger newBurgerToAdd) {
        burgers.add(newBurgerToAdd);
    }


    public List<Burger> getBurgers() {
        return burgers;
    }

    public void setBurgers(List<Burger> burgers) {
        this.burgers = burgers;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalOrderCost() {
        return totalOrderCost;
    }

    public void setTotalOrderCost(double totalOrderCost) {
        this.totalOrderCost = totalOrderCost;
    }
}

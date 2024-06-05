package com.techelevator.restaurant;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;

public class OrderService {

    private Map<Integer, Order> orders = new TreeMap<>();
    private Kitchen kitchen;

    public OrderService(String fileName) throws FileNotFoundException {
        kitchen = new Kitchen(fileName);
    }


    public void addOrder(Order newOrder) {

        orders.put(newOrder.getOrderId(), newOrder);

    }

    public Order retrieveOrderById(int orderId) throws OrderNotFoundException {

        Order foundOrder = orders.get(orderId);
        if (foundOrder == null) {
            throw new OrderNotFoundException(orderId);
        }
        return foundOrder;

    }




}

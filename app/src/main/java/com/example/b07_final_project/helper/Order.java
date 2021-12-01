package com.example.b07_final_project.helper;

import java.util.ArrayList;

public class Order {
    private String orderId;                 // unique order ID
    private Customers customer;             // corresponding customer of the order
    private int status;                     // 0 : processing, 1 : completed (ready for pickup)
    private ArrayList<Product> products;    // list of products

    public Order() {
    }

    public Order(String orderId, Customers customer, int status, ArrayList<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.status = status;
        this.products = products;
    }

    // Getters
    public String getOrderId() { return orderId; }
    public Customers getCustomer() { return customer; }
    public int getStatus() { return status; }
    public ArrayList<Product> getProducts() { return products; }

    // Setters
    public void setOrderId(String id) { this.orderId = orderId; }
    public void setCustomer(String name) { this.customer = customer; }
    public void setStatus(int price) { this.status = status; }
    public void setProducts(String brand) { this.products = products; }

    // for toString()
    public String statusMeaning() {
        if (getStatus() == 0) {
            return "processing";
        }
        else if (getStatus() == 1) {
            return "completed (ready for pickup)";
        }
        else {
            return "no valid status found.";
        }
    }

//    public String printProducts(Order order) {
//        String SEPARATOR = "";
//        StringBuilder compiledString = new StringBuilder();
//        for (product : order.products) {
//            compiledString.append(SEPARATOR);
//            compiledString.append(product.getName());
//            SEPARATOR = ", ";
//        }
//        String actualString = compiledString.toString();
//        return actualString;
//    }
//
//    @Override
//    public String toString() {
//        return "Order id: " + getOrderId() + ", by customer: " + getCustomer().getName() + ", " +
//                "with order status: " + statusMeaning() +
//                ", and list of products: " + printProducts() + ".";
//    }
}
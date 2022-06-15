package org.sevimozsoy;

public class Order {
    private int orderId;
    private int orderTotalPrice;


    public Order(int orderId, int orderTotalPrice) {
        this.orderId = orderId;
        this.orderTotalPrice = orderTotalPrice;
    }

    public int getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(int orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

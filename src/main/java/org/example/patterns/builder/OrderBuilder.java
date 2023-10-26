package org.example.patterns.builder;

public class OrderBuilder {

    private Order order;

    public OrderBuilder() {
        order = new Order();
    }
    public Order build(){

        if(order.getQnt() <= 0){
            throw new RuntimeException("Quantity is not correct!");
        }

        if(order.getPrice() <= 0){
            throw new RuntimeException("Price is not correct!");
        }
        return order;
    }

    public OrderBuilder setProductId(int productId) {
        order.setProductId(productId);
        return this;
    }
    public OrderBuilder setClientName(String clientName) {
        order.setClientName(clientName);
        return this;
    }


    public OrderBuilder setProductName(String productName) {
        order.setProductName(productName);
        return this;
    }

    public OrderBuilder setQnt(int qnt) {
        order.setQnt(qnt);
        return this;
    }

    public OrderBuilder setPrice(double price) {
        order.setPrice(price);
        return this;
    }

    public OrderBuilder setSign(boolean sign) {
        order.setSign(sign);
        return this;
    }

    public OrderBuilder isSign(boolean sign) {
        order.setSign(sign);
        return this;
    }


}

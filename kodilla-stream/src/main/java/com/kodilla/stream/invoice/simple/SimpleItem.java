package com.kodilla.stream.invoice.simple;

public class SimpleItem {
    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(SimpleProduct produckt, double quantity) {
        this.product = produckt;
        this.quantity = quantity;
    }

    public SimpleProduct getProduckt() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
    public double getValue() {
        return product.getProductPrice() * quantity;
    }
}

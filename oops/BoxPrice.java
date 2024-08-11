package com.om.oops;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double b, double h, double weight, double cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }

    public BoxPrice(Double side, Double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}

package com.om.oops;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight=-1;

    }
  BoxWeight(BoxWeight other){
  super(other);
  weight=other.weight;
  }
  BoxWeight(Double side,Double weight){
  super(side);
  this.weight=weight;
  }
    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h);
        this.weight = weight;
    }
}

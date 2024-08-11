package com.om.oops;

public class J18_oops2 {
  int age;
  String name;
  float salary;
  boolean married;
  static long population;
    public J18_oops2(int age, String name, float salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        J18_oops2.population+=1;
    }
}

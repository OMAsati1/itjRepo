package com.om.oops;

public class J18_oops_static {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);
        System.out.println(b);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}


package com.om;

import java.util.ArrayList;
import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
//        System.out.println(list.size());
//    list.add(66);
//    list.add(645);
//    list.add(63);
//    list.add(63);
//    list.add(36);
//    list.add(36);
//    list.add(36);
//    list.add(89);
//    list.add(36);
//    list.add(36);
//    list.add(234);
//    list.add(12);
//    list.add(234);
//    list.add(12);
//    System.out.println(list);
//        System.out.println(list.contains(89));
//        System.out.println(list.size());
//        list.remove(12);
//        list.set(2,45);
//    System.out.println(list);
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for (int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}


package com.om;

import java.util.Scanner;

public class J4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "apple" -> System.out.println("doctor's nightmare");
            case "mango" -> System.out.println("king");
            case "banana" -> System.out.println("High protein");
            case "orange" -> System.out.println("very juicy");
            default -> System.out.println("pls enter valid fruit");
        }
    }
}

package com.om;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        String name ="My name is Om Asati";
//        System.out.println(name);
//        String name = input.next();
//        String name = input.nextLine();
//        System.out.println(name);
        System.out.print("Enter any 2 number: ");
        int n1= input.nextInt();
        int n2= input.nextInt();
        float sum = n1+n2; /*This will typecast int into float*/
        System.out.println(sum);
        System.out.print("मई बढ़िया हूँ");

    }
}

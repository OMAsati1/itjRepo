package com.om;
import java.util.Scanner;
public class J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.print("Largest no. is: ");
//        System.out.println(max);
        int max =Math.max(c,Math.max(a,b));
        System.out.print("Largest no. is: ");

        System.out.println(max);

    }
}
package com.om;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//        char ch = inp.next().trim().charAt(0);
//        System.out.println(ch);
//        if (ch >='a' && ch<='z'){
//            System.out.println("Lower case");
//        }
//        else{
//            System.out.println("Upper case");
//        }
        // Fib series ques..................
//        int n =inp.nextInt();
//        int a=0;
//        int b=1;
//        int cnt =2;
//        while (cnt<=n){
//            int temp=b;
//            b=b+a;
//            a=temp;
//            cnt++;
//
//        }
//        System.out.print(b);
//        long  n =2646787673686l;
//        int key =6;
//        int cnt =0;
//        while(n>0){
//            long rem=n%10;
//            if (rem==key) {
//                cnt++;
//            }
//            n/=10;
//        }
//        System.out.print(cnt);
        int num =1038976;
        int r=0;
        while (num>0){
            int ld = num%10;
            r=r*10+ld;
            num/=10;
        }
        System.out.print(r);
    }
}

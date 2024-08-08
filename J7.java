package com.om;

import java.util.Scanner;

public class J7 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
  boolean ans=isPrime(a);
        System.out.println(ans);
        System.out.println("Prime no. upto "+a+": ");
  for (int i=2;i<=a;i++){
     if(isPrime(i)) {
          System.out.print(i + " ");
      }
  }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i<=Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return i * i > n;
    }
}
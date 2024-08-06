package com.om;

import java.util.Arrays;
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
//        int [] a= new int[5];
//       a[0]=0;
//       a[1]=1;
//       a[2]=2;
//       a[3]=3;
//       a[4]=4;
//        for (int i : a){
//            System.out.println(a[i]);
//        }
       /* int [] a= {3,56,43,23,45};
//        for (int i = 0; i < a.length; i++) {
//            int j = a[i];
//            System.out.print(j + " ");
//        }
        System.out.println(Arrays.toString(a));
*/
        Scanner inp =new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i]=inp.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
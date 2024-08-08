package com.om;

import java.util.ArrayList;

public class J14 {
    public static void main(String[] args) {
//        System.out.println('a'+'c');
//        System.out.println("a"+"c");
//        System.out.println('a'+3);
//        System.out.println((char)('a'+3));
//        System.out.println("a"+3);
//        System.out.println("a"+new ArrayList<>());
//        System.out.println("a"+new Integer(675));
//        System.out.println(new ArrayList<>()+""+new Integer(675)); // we should use"" so i dont gave error
        String s ="";
        for (int i = 0; i <26; i++) {
            char ch=(char)('a'+i);
            s+=ch;
        }
        System.out.println(s);
//        char cha='s';
//        String ser="hjschdbqoi";
//        System.out.println(ser.indexOf(cha));

        //...................................................

//        char cha = '1';
//boolean isLetter = Character.isLetter(cha);
//
//if (isLetter) {
//    System.out.println(cha + " is a letter.");
//} else {
//    System.out.println(cha + " is not a letter.");
//}
    }
}

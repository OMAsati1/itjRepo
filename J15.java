package com.om;

import java.util.Arrays;

public class J15 {
    public static void main(String[] args) {
        /* StringBuilder builder= new StringBuilder();
        for (int i = 0; i <26; i++) {
             char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.capacity());
        builder.deleteCharAt(3);
        System.out.println(builder);
        System.out.println(builder.capacity());
        builder.reverse();
        System.out.println(builder); */
        String str ="om asati";
        String str1 ="om asati from tikamgarh";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf('s'));
        System.out.println("   jhadhbs    ".strip());
        System.out.println(Arrays.toString(str1.split(" ")));
    }
}

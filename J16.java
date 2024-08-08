package com.om;

public class J16 {
    static boolean isPalidrome(String a){
        if (a==null || a.isEmpty()){
            return true;
        }
         a=a.toLowerCase();
        for (int i = 0; i <a.length()/2; i++) {
            char s=a.charAt(i);
            char e=a.charAt(a.length()-1-i);
           if (s!=e) {
               return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "Massam";
        System.out.println(isPalidrome(str));
//        System.out.println(str.charAt(2));
//        System.out.println(str.length());
    }

}

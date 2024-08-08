package com.om;

public class J13 {
    public static void main(String[] args) {
//        Integer num = new Integer(87);
//        System.out.println(num.toString());
        float a= 12.38764f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.println();
//        System.out.println(Math.PI);
        System.out.printf("Pie: %.2f",Math.PI);
        System.out.println();
        System.out.printf("My name is %s and i am %s","om","student");
        System.out.println();
        /*  Format Specifiers
        There are many format specifiers we can use. Here are some common ones:
    %c - Character
    %d - Decimal number (base 10)
    %e - Exponential floating-point number
    %f - Floating-point number
    %i - Integer (base 10)
    %o - Octal number (base 8)
    %s - String
    %u - Unsigned decimal (integer) number
    %x - Hexadecimal number (base 16)
    %t - Date/time
    %n - Newline

    Escape Characters
    Though, certain combinations (also called commands) have a different meaning to the compiler:
    \b - Insert backspace
    \f - Next line's first character starts to the right of current line's last character
    \n - Insert newline
    \r - Insert carriage return
    \t - Insert tab
    \\ - Insert backslash
    %% - Insert percentage sign
    */
        System.out.println("e\nr");
    }
}

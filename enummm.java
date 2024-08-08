package com.om;
// Declaration Outside the Class
//enum Color{
//    red,green,blue;
//}
//public class enummm {
//    public static void main(String[] args) {
//        Color c1= Color.green;
//        System.out.println(c1);
//    }
//}
////....................................................................................................................
//// Declaration Inside the Class
//public class enummm {
//enum Color{
//    red,green,blue;
//}
//    public static void main(String[] args) {
//        Color c1= Color.green;
//        System.out.println(c1);
//    }
//}
// A Java program to demonstrate working on enum
// in a switch case (Filename Test.java)

// An Enum class
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
public class enummm {
    Day day;

    // Constructor
    public enummm(Day day) {
        this.day = day;
    }

    // Prints a line about Day using switch
    public void dayIsLike() {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }

    // Driver method
    public static void main(String[] args) {
        String str = "TUESDAY";
        enummm t1 = new enummm(Day.valueOf(str));
        t1.dayIsLike();
    }
}


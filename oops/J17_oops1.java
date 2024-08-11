package com.om.oops;

public class J17_oops1{
    public static void main(String[] args) {

   Stu student1 = new Stu(1,"kjfhbid",54.5f);

        System.out.println(student1.n);
        System.out.println(student1.s1);
        System.out.println(student1.f);
        student1.change("fuy");
        student1.greet();

        System.out.println();

   Stu student2 = new Stu(13,"dvsjsdh",63.5f);

        System.out.println(student2.n);
        System.out.println(student2.s1);
        System.out.println(student2.f);
        System.out.println();
//   Stu student3= new Stu();
//     System.out.println(student3.n);
//        System.out.println(student3.s1);
//        System.out.println(student3.f);
//        System.out.println();
  Stu random=new Stu();
        System.out.println(random.s1);

    }
}
class Stu {
    int n;
    String s1;
    float f;

    void greet(){
        System.out.println("hello "+this.s1);
    }
    void change(String s1){
        this.s1=s1;
    }
            Stu(Stu other){
            this.n=other.n;
        this.s1=other.s1;
        this.f=other.f;
    }
    Stu(){

        this (13,"hoye hoye",93.6f);
    }
//    Stu(){
//        this.n=76;
//        this.s1="hehe";
//        this.f=97.8f;
//    }

    Stu(int n1,String a,float m){
        this.n=n1;
        this.s1=a;
        this.f=m;

        }

    }
    // learn about final keyword from vedio oops1 kk


